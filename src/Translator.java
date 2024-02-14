import java.util.ArrayList;
import java.util.List;

class Utils {
    public static final String TAB = "\t";

    public static final String SPACE = " ";

    public static void addStringUtil(StringBuilder theCode, String ... strings) {
        for (String string : strings) {
            theCode.append(string);
        }
    }
}

public class Translator extends HaskellANTLRBaseListener {

    private final StringBuilder theCode = new StringBuilder();

    private List<String> varsFunc = new ArrayList<>();

    private int cur = 0;

    private boolean wasCondition = false;

    public String getImperativeLanguage() {
        return theCode.toString();
    }

    @Override
    public void enterFunction(HaskellANTLRParser.FunctionContext ctx) {
        addString("public ");
    }

    @Override
    public void exitFunction(HaskellANTLRParser.FunctionContext ctx) {
        varsFunc = new ArrayList<>();
    }

    @Override
    public void enterInput_return_types(HaskellANTLRParser.Input_return_typesContext ctx) {
        String typeString = ctx.return_type().getText();
        String funcName = ctx.children.get(0).getText();
        addString(typeString, Utils.SPACE, funcName, "(");
    }

    @Override
    public void exitInputs_output(HaskellANTLRParser.Inputs_outputContext ctx) {
        wasCondition = false;
        cur = 0;
    }

    @Override
    public void exitInput_return_types(HaskellANTLRParser.Input_return_typesContext ctx) {
        addString(") ", "{\n");
    }

    @Override
    public void enterType(HaskellANTLRParser.TypeContext ctx) {
        String varName = ctx.children.get(1).getText();
        String typeName = ctx.children.get(0).getText();
        varsFunc.add(varName);
        if (varsFunc.size() > 1) {
            addString(",", Utils.SPACE);
        }
        addString(typeName, Utils.SPACE, varName);
    }

    @Override
    public void exitMethod_declaration(HaskellANTLRParser.Method_declarationContext ctx) {
        addString("}\n\n");
    }

    @Override
    public void enterCondition(HaskellANTLRParser.ConditionContext ctx) {
        String conditionString = ctx.getText();
        boolean lastSpace = conditionString.charAt(conditionString.length() - 1) == ' ';
        addString(Utils.TAB, "if ", "(", lastSpace ? conditionString.substring(0, conditionString.length() - 1) : conditionString);
        wasCondition = true;
    }

    @Override
    public void exitInputs(HaskellANTLRParser.InputsContext ctx) {
        if (wasCondition) {
            addString(")\n");
        }
    }

    @Override
    public void enterInput(HaskellANTLRParser.InputContext ctx) {
        if (ctx.INT() != null || ctx.DOUBLE() != null) {
            String varName = varsFunc.get(cur);
            String varValue = ctx.getText();
            if (wasCondition) {
                addString(Utils.SPACE, "&& ", varName, Utils.SPACE, "== ", varValue);
            } else {
                addString(Utils.TAB, "if (", varName, Utils.SPACE, "== ", varValue);
            }
            wasCondition = true;
        }
        cur++;
    }

    @Override
    public void enterOutput(HaskellANTLRParser.OutputContext ctx) {
        String expressionReturn = ctx.children.get(0).getText();
        addString(wasCondition ? Utils.TAB + Utils.TAB : Utils.TAB, "return ", expressionReturn, ";\n");
    }

    private void addString(String... strings) {
        Utils.addStringUtil(theCode, strings);
    }
}

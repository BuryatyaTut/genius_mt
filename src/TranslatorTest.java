import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.testng.annotations.Test;

public class TranslatorTest {
    @Test
    public void severalInputsTest() {
        String input = "sum :: Integer a -> Integer b -> Integer k -> Integer\n" +
                "sum 4 2 1 = 7:\n" +
                "a | a < 0 = 0:\n" +
                "a b k = a + b + k;";
        testIt(input);
    }

    @Test
    public void noParametersTest() {
        String input = "num2 :: Integer\n" +
                "num2 = 2;";
        testIt(input);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void conditionsTest() {
        String input = "mul :: Integer a -> Integer b -> Integer\n" +
                "mul a 2 = a * 2\n" +
                "2 4 = 8\n" +
                "a b | a > 0 && b > 0 = a * b\n" +
                "= a * b;";
        testIt(input);
    }

    @Test
    public void differentTypesTest() {
        String input = "mulDouble :: Double a -> Double b -> Double\n" +
                "mulDouble 0.0 = 0.0:\n" +
                "a 0.0 = 0.0:\n" +
                "a b | a < 0 && b < 0 = a * (b * a - d + e / c * mulDouble(a,b,c,d)):\n" +
                "a b = a * b;";
        testIt(input);
    }

    @Test
    public void booleanAndStringTest() {
        String input = "boolString :: Boolean b -> String\n" +
                "boolString b | b == true = \"True\":\n" +
                "b | b == false = \"False\";";
        testIt(input);
    }



    @Test
    public void defaultBranch() {

    }
    private void testIt(String functionalLangProgram) throws IllegalArgumentException {
        System.out.println("INPUT");
        System.out.println(functionalLangProgram + "\n");
        System.out.println("OUTPUT");

        HaskellANTLRLexer lexer = new HaskellANTLRLexer(CharStreams.fromString(functionalLangProgram));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        HaskellANTLRParser parser = new HaskellANTLRParser(tokens);


        parser.removeErrorListeners();
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                    int line, int charPositionInLine,
                                    String msg, RecognitionException e) {
                throw new IllegalArgumentException("Syntax error in functional language program: " + msg);
            }
        });

        Translator translator = new Translator();
        ParseTreeWalker walker = new ParseTreeWalker();

        walker.walk(translator, parser.start());

        String imperativeLanguageProgram = translator.getImperativeLanguage();
        if (imperativeLanguageProgram.isEmpty()) {
            throw new IllegalArgumentException("Translation resulted in an empty imperative language program.");
        }

        System.out.println(imperativeLanguageProgram + "\n");
    }
}
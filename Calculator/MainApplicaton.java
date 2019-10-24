import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class MainApplicaton {
    public static void main(String[] args) throws Exception {
        String text = "1+2+3+4-5\n";

        ANTLRInputStream inputStream = new ANTLRInputStream(new ByteArrayInputStream(text.getBytes()));
        CalculatorLexer lexer = new CalculatorLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        CalculatorParser parser = new CalculatorParser(tokenStream);
//        parser.addParseListener(new CalculatorBaseListener());
        ParseTree tree = parser.prog();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new CalculatorBaseListener(), tree);
        // print LISP-style tree
//        System.out.println(tree.toStringTree(parser));

    }
}
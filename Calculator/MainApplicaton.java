import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class MainApplicaton {
    public static void main(String[] args) throws Exception {
        Log.is_debug = Boolean.valueOf(args[0]);
        String text = "1+2+3+4-5\n";
        Scanner sc = new Scanner(System.in);
        String str = "";
        while (sc.hasNext()) {
            //利用nextXXX()方法输出内容
            str = sc.next();
            InputStream input = new ByteArrayInputStream((str + '\n').getBytes());
            ANTLRInputStream inputStream = new ANTLRInputStream(input);
            CalculatorLexer lexer = new CalculatorLexer(inputStream);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);

            CalculatorParser parser = new CalculatorParser(tokenStream);
//            parser.addParseListener(new CalculatorBaseListener());

            ParseTree tree = parser.prog();
//
//            ParseTreeWalker walker = new ParseTreeWalker();
//            walker.walk(new CalculatorBaseListener(), tree);
            CalculatorVisitor visitor = new CalculatorEvalVisitor();
            Object result = visitor.visit(tree);
            System.out.println("=" + result.toString());


        }


    }
}
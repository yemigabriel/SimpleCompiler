import gen.SimpleCompilerLexer;
import gen.SimpleCompilerParser;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;
import java.io.IOException;
import java.util.Arrays;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {

    public static void main(String[] args) {

        String inputDirectory = "input/";
        //charstream
        CharStream charStream = null;
        try {
            charStream = fromFileName(inputDirectory + "compiler.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //lexer
        SimpleCompilerLexer lexer = new SimpleCompilerLexer(charStream);
        //remove token recognition errors
        lexer.removeErrorListeners();
        //tokenstream
        TokenStream tokenStream = new CommonTokenStream(lexer);
        //parse
        SimpleCompilerParser parser = new SimpleCompilerParser(tokenStream);
        ParseTree parseTree = parser.expression();

        Float result = new SimpleCompiler().visit(parseTree);
        System.out.println(result);


        //show AST in GUI
        JFrame frame = new JFrame("AST for expression" );
        TreeViewer treeViewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), parseTree);
        treeViewer.setScale(1.5);
        frame.add(treeViewer);
        frame.setSize(640, 480);
        frame.setVisible(true);

    }
}

package ikanalyzer;

import java.io.IOException;
import java.io.StringReader;

import org.wltea.analyzer.core.IKSegmenter;
import org.wltea.analyzer.core.Lexeme;

public class Examples {

	public static void main(String[] args) throws IOException {
		StringReader sr = new StringReader("IKAnalyzer是一个开源的，基亍java 语言开发的轻量级的中文分词工具包。从 2006年12月推出1.0版开始， IKAnalyzer已经推出了3个大版本");
		IKSegmenter ik = new IKSegmenter(sr, true);
		Lexeme lex = null;
		while ((lex = ik.next()) != null) {
			System.out.print(lex.getLexemeText() + "|");
		}
	}
}

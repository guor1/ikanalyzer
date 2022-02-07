# IK Analyzer简介
- IK Analyzer是基于java的轻量级的中文分词工具包。
- 原始仓库为：https://gitee.com/wltea/IK-Analyzer-2012FF

- ikanalyzer是对原项目的一个复制，改动点如下：
  - 使用maven环境
  - 去掉lucene依赖以及对lucene接口实现，有需要请使用原版
  - 修改编译版本为1.6

# 使用步骤
## 1.配置JitPack仓库
```
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```

## 2.添加依赖
```
<dependency>
    <groupId>com.github.guor1</groupId>
    <artifactId>ikanalyzer</artifactId>
    <version>0.3</version>
</dependency>
```

## 3.示例
```
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
```
package Interpreter;

import java.util.StringTokenizer;

public class Context {
  private StringTokenizer tokeninzer;
  private String currentKeyword;

  public Context(String script) {
    tokeninzer = new StringTokenizer(script);
    readNextKeyword();
  }

  public String readNextKeyword() {
    if (tokeninzer.hasMoreTokens()) {
      currentKeyword = tokeninzer.nextToken();
    } else {
      currentKeyword = null;
    }

    return currentKeyword;
  }

  public String getCurrentKeyword() {
    return currentKeyword;
  }
}

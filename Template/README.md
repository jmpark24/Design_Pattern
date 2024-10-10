# Template 패턴

Template 패턴은 상위 클래스에서 알고리즘의 뼈대를 정의하고 구체적인 단계는 하위 클래스에서 정의하는 패턴입니다. 이 패턴의 주요 특징은 다음과 같습니다:

- 알고리즘의 구조를 변경하지 않고 알고리즘의 특정 단계들을 재정의할 수 있습니다.
- 상위 클래스에서는 순서(단계)만 정의하고, 하위 클래스에서 구체적인 코드를 구현합니다.

## 구현

### Article 클래스

실제 데이터를 저장하는 클래스입니다.

```java
package Template;
import java.util.ArrayList;

public class Article {
  private String title;
  private ArrayList<String> content;
  private String footer;

  public Article(String title, ArrayList<String> content, String footer) {
    this.title = title;
    this.content = content;
    this.footer = footer;
  }

  public String getTitle() {
    return title;
  }

  public ArrayList<String> getContent() {
    return content;
  }

  public String getFooter() {
    return footer;
  }
}
```

### DisplayArticleTemplate 추상 클래스

각 단계를 정해진 순서대로 실행하는 템플릿을 정의합니다.

```java
package Template;

public abstract class DisplayArticleTemplate {
  protected Article article;

  public DisplayArticleTemplate(Article article) {
    this.article = article;
  }

  public final void display() {
    title();
    content();
    footer();
  }

  protected abstract void title();
  protected abstract void content();
  protected abstract void footer();
}
```

### SimpleDisplayArticle 클래스

`DisplayArticleTemplate`를 상속받아 구체적인 표시 방법을 구현합니다.

```java
package Template;

import java.util.ArrayList;

public class SimpleDisplayArticle extends DisplayArticleTemplate {
  public SimpleDisplayArticle(Article article) {
    super(article);
  }

  @Override
  protected void title() {
    System.out.println(article.getTitle());
  }

  @Override
  protected void content() {
    ArrayList<String> content = article.getContent();
    for (String line : content) {
      System.out.println(line);
    }
  }

  @Override
  protected void footer() {
    System.out.println(article.getFooter());
  }
}
```

### CaptionDisplayArticle 클래스

`DisplayArticleTemplate`를 상속받아 다른 표시 방법을 구현합니다.

```java
package Template;
import java.util.ArrayList;

public class CaptionDisplayArticle extends DisplayArticleTemplate {
  public CaptionDisplayArticle(Article article) {
    super(article);
  }

  @Override
  protected void title() {
    System.out.println("TITLE: " + article.getTitle());
  }

  @Override
  protected void content() {
    System.out.println("CONTENT: ");
    ArrayList<String> content = article.getContent();
    for (String line : content) {
      System.out.println("    " + line);
    }
  }

  @Override
  protected void footer() {
    System.out.println("FOOTER: " + article.getFooter());
  }
}
```

### 메인 클래스

템플릿 패턴을 사용하여 두 가지 다른 표시 방법을 구현합니다.

```java
import java.util.ArrayList;

import Template.Article;
import Template.CaptionDisplayArticle;
import Template.DisplayArticleTemplate;
import Template.SimpleDisplayArticle;

public class MainEntry {
  public static void main(String[] args) {
    String title = "디자인패턴";
    ArrayList<String> content = new ArrayList<String>();
    content.add("디자인패턴은 클래스 간의 효율적이고 최적화된 관계를 설계하는 것입니다.");
    content.add("각 패턴을 외우기 보다 이해하는 것이 중요합니다.");
    content.add("다양한 패턴을 접하고 반복적으로 이해할수록");
    content.add("각 디자인패턴에 대한 응용의 폭이 넓어질 것입니다.");
    String footer = "2022.1.9, GIS Developer 김형준";

    Article article = new Article(title, content, footer);

    System.out.println("[CASE-1]");
    DisplayArticleTemplate style1 = new SimpleDisplayArticle(article);
    style1.display();

    System.out.println("\n[CASE-2]");
    DisplayArticleTemplate style2 = new CaptionDisplayArticle(article);
    style2.display();
  }
}
```

## 결론

템플릿 패턴을 사용하면 어떤 기능에 대해 실행되어야 할 각 단계는 정해져 있으나, 각 단계에 대한 세부 구현을 상황에 맞게 다르게 구현할 수 있습니다. 이를 통해 코드의 재사용성과 유연성을 높일 수 있습니다.

---

이 내용은 [유튜브 강의](https://www.youtube.com/watch?v=hPTqWJm51Vs&list=PLe6NQuuFBu7FhPfxkjDd2cWnTy2y_w_jZ&index=4)를 바탕으로 작성되었습니다.
# 디자인 패턴 학습 프로젝트

## 프로젝트 개요

이 프로젝트는 정보처리기사 실기 시험 대비와 실제 개발 능력 향상을 위한 디자인 패턴 학습을 목적으로 합니다. 단순 암기가 아닌 실제 구현을 통해 각 패턴의 개념과 적용 방법을 이해하고자 합니다.

## 학습 목표

1. 주요 디자인 패턴의 개념 이해
2. 각 패턴의 실제 구현 방법 습득
3. 패턴 적용 시나리오 파악
4. 정보처리기사 실기 시험에 대비한 실전 능력 향상

## 학습 방법

1. 각 디자인 패턴별로 별도의 패키지를 만들어 구현
2. 패턴별 README 파일을 작성하여 개념, 사용 이유, 구현 방법 정리
3. 실제 코드 구현 및 테스트
4. 학습 후 복습 및 응용 방안 고민

## 현재 구현된 디자인 패턴 목록

1. Iterator Pattern
2. Strategy Pattern
3. Template Method Pattern
4. Adapter Pattern
5. Bridge Pattern

## 프로젝트 구조

```
src/
├── Adapter/
│   ├── Animal.java
│   ├── Cat.java
│   ├── Dog.java
│   ├── README.md
│   ├── Tiger.java
│   ├── TigerAdapter.java
│   └── User.java
├── Bridge/
│   ├── CaptionDisplay.java
│   ├── Display.java
│   ├── Draft.java
│   ├── MainEntry.java
│   ├── Publication.java
│   ├── README.md
│   └── SimpleDisplay.java
├── Iterator/
│   ├── Aggregator.java
│   ├── Array.java
│   ├── ArrayIterator.java
│   ├── Item.java
│   ├── Iterator.java
│   ├── MainEntry.java
│   └── README.md
├── Strategy/
│   ├── GaussSumStrategy.java
│   ├── MainEntry.java
│   ├── README.md
│   ├── SimpleSumStrategy.java
│   ├── SumPrinter.java
│   └── SumStrategy.java
├── Template/
│   ├── Article.java
│   ├── CaptionDisplayArticle.java
│   ├── DisplayArticleTemplate.java
│   ├── MainEntry.java
│   ├── README.md
│   └── SimpleDisplayArticle.java
├── 추가 에정...
└── README.md
```

## 학습 진행 방법

1. 각 패턴별로 학습을 진행합니다.
2. 패턴의 개념을 이해하고 각 패턴 폴더 내의 README.md 파일에 정리합니다.
3. 해당 패턴의 패키지에 실제 코드를 구현합니다.
4. 구현한 코드를 테스트하고 결과를 확인합니다.
5. 학습한 내용을 바탕으로 실제 시나리오에 적용해봅니다.
6. 정기적으로 이전에 학습한 패턴들을 복습합니다.

## 참고 자료

- [유튜브 GIS DEVELOPER](https://www.youtube.com/@gisdeveloper)


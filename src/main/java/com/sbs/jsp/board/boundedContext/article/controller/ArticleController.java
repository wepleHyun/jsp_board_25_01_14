package com.sbs.jsp.board.boundedContext.article.controller;

import com.sbs.jsp.board.base.Rq;
import com.sbs.jsp.board.boundedContext.article.dto.Article;
import com.sbs.jsp.board.boundedContext.article.service.ArticleService;
import com.sbs.jsp.board.container.Container;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ArticleController {
    //private List<Article> articleList;
    private ArticleService articleService;

    public ArticleController() {
        articleService = Container.articleService;
        //articleList = new ArrayList<>();
        //akeTestDate();
    }


    private void makeTestDate() {
        /*
        for(int i = 1; i <= 5; i++) {
            articleList.add(new Article(i, "제목 %d".formatted(i), "내용 %d".formatted(i)));
        }
        */

        //스트림 문법
        /*IntStream.rangeClosed(1, 5)
            .forEach(i ->
                    articleList.add(new Article(i, "제목 %d".formatted(i), "내용 %d".formatted(i)))
            );
         */
    }



    public void showList(Rq rq) {
        List<Article> articles = articleService.getArticles();

        // articleList : 정렬되지 않은 1~5까지의 게시물 리스트
        
        // a1, a2 : article 객체
        // Integer.compare 두 정수를 비교하는 메서드
        // - a < b : 음수 반환
        // - a == b : 0을 반환
        // - a > b : 양수 반환
        // Integer.compare(a2.getId(), a1.getId()) : 둘을 비교해서 내림차순 정렬
        /*
        List<Article> articles = articleList.stream()
                .sorted((a1, a2) -> Long.compare(a2.getId(), a1.getId()))
                .toList(); //stream의 결과를 list로 변환
        */

        if(articles.isEmpty()) {
            rq.print("게시물이 존재하지 않습니다.");
            return;
        }

        rq.setAttr("articles", articles);

        rq.view("usr/article/list");

        //rq.print("<h1>게시물 리스트</h1>");
    }

    public void showWrite(Rq rq) {
        rq.view("usr/article/write");
    }

    public void doWrite(Rq rq) {
        String subject = rq.getParam("subject", "");
        if(subject.trim().isEmpty()) {
            rq.print("제목을 입력해주세요.");
            return;
        }

        String content = rq.getParam("content", "");
        if(content.trim().isEmpty()) {
            rq.print("내용을 입력해주세요.");
            return;
        }

        //rq.print("<div>subject : %s</div>\n".formatted(subject));
        //rq.print("<div>content : %s</div>\n".formatted(content));

        long id = articleService.write(subject, content);
        rq.print("<div>%d번 게시물이 생성되었습니다.</div>\n".formatted(id));
    }
}

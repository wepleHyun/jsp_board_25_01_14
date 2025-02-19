package com.sbs.jsp.board.servlet;

import com.sbs.jsp.board.base.Rq;
import com.sbs.jsp.board.boundedContext.article.controller.ArticleController;
import com.sbs.jsp.board.boundedContext.member.controller.MemberController;
import com.sbs.jsp.board.container.Container;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.lang.reflect.Member;

@WebServlet("/usr/*")
public class DispatcherServlet  extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Rq rq = new Rq(req, resp);

        MemberController memberController = Container.memberController;
        ArticleController articleController = Container.articleController;

        // http://localhost:8030/usr/article/list 중 "/usr/article/list" 값만 가져오기
        String url = req.getRequestURI();
        //System.out.println(url);

        //System.out.println(req.getRequestURI());

        switch (rq.getMethod()) {
            case "GET" -> {
                switch (rq.getActionPath()) {
                    case "/usr/article/write" -> articleController.showWrite(rq);
                    case "/usr/article/list" -> articleController.showList(rq);
                    case "/usr/article/detail" -> articleController.showDetail(rq);
                    case "/usr/member/join" -> memberController.showJoin(rq);
                }
            }
            case "POST" -> {
                switch (rq.getActionPath()) {
                    case "/usr/article/write" -> articleController.doWrite(rq);
                }
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

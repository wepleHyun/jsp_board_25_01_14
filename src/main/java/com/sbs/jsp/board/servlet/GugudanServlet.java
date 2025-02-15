package com.sbs.jsp.board.servlet;

import com.sbs.jsp.board.base.Rq;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.stream.IntStream;

@WebServlet("/gugudan")
public class GugudanServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*
        req.setCharacterEncoding("UTF-8"); //들어오는 데이터를 UTF-8로 해석
        resp.setCharacterEncoding("UTF-8"); //완성되는 HTML을 UTF-8로 인코딩
        resp.setContentType("text/html; charset=utf-8"); //브라우저에게 우리가 만들 결과물이 UTF-8이라고 알리는 의미

        int dan = Integer.parseInt(req.getParameter("dan"));
        int limit = Integer.parseInt(req.getParameter("limit"));
        */

        Rq rq = new Rq(req, resp);
        int dan = rq.getIntParam("dan", 9);
        int limit = rq.getIntParam("limit", 9);

        resp.getWriter().append("<h1>== %d단 ==</h1>\n".formatted(dan));

        for (int i = 1; i <= limit; i++){
            resp.getWriter().append("<div>%d * %d = %d</div>\n".formatted(dan, i, dan * i));
        }
    }
}


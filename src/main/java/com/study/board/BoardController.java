package com.study.board;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class BoardController extends HttpServlet {

    // 서블릿이 자동으로 호출하여 내가 만든 process()를 부름
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException {
        try {
            process(req, res);
        } catch (Exception e) {
            throw new ServletException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException {
        try {
            process(req, res);
        } catch (Exception e) {
            throw new ServletException(e);
        }
    }



    private String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
        System.out.println("왔니?");
        String command = req.getParameter("command");
        CommandHandler handler = null;
        if(command==null || command.trim().isEmpty()){
            // 에러가 발생할 상황일 때
            // 게시판 목록으로 진입 (초기)
            handler = new BoardHandler();
        } else if (command.contains("list")){
            handler = new BoardHandler();

        } else if (command.contains("insert")){

        } else if (command.contains("detail")){

        }

        return handler.processCommand(req, res);
    }
}

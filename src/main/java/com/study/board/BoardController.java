package com.study.board;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("*.do")
public class BoardController extends HttpServlet {
    private String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
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

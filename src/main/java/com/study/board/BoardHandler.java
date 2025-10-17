package com.study.board;

import com.study.board.dto.BoardListDTO;
import com.study.board.dto.BoardSearchInputDTO;
import com.study.board.service.BoardService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.util.List;

public class BoardHandler implements CommandHandler {

    private BoardService boardService;

    public BoardHandler() {
        this.boardService = new BoardService();
    }

    @Override
    public void processCommand(HttpServletRequest req, HttpServletResponse res) throws Exception {
        /*
        *   검색 조건 있을 때
        *   검색 조건 없을 때
        *   null 일 때 기본 진입
        * */

        BoardSearchInputDTO boardSearchInput = new BoardSearchInputDTO();
        if(req.getParameter("searchInput")==null) {
            boardSearchInput.setSearchWord(req.getParameter(""));
        } else {
            boardSearchInput.setSearchWord(req.getParameter("searchWord"));
        }

        if(req.getParameter("frontDate")==null) {
            boardSearchInput.setFrontDate("20000101");
        } else {
            boardSearchInput.setFrontDate(req.getParameter("frontDate"));
        }

        if(req.getParameter("tailDate")==null) {
            boardSearchInput.setTailDate("99991231");
        }else {
            boardSearchInput.setTailDate(req.getParameter("tailDate"));
        }

        List<BoardListDTO> boardList = boardService.getBoardList(boardSearchInput);
        req.setAttribute("boardList", boardList);
        //return "/board/list.jsp";

        // JSP 경로는 웹 루트 기준 또는 WEB-INF 기준
        RequestDispatcher rd = req.getRequestDispatcher("/board/list.jsp");
        rd.forward(req, res);
    }
}

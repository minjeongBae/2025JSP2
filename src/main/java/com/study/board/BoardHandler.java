package com.study.board;

import com.study.board.dto.BoardListDTO;
import com.study.board.dto.BoardSearchInputDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BoardHandler implements CommandHandler {
    @Override
    public String processCommand(HttpServletRequest req, HttpServletResponse res) throws Exception {
        /*
        *   검색 조건 있을 때
        *   검색 조건 없을 때
        *   null 일 때 기본 진입
        * */
        if(req.getParameter("searchInput")==null) {

        } else {
            BoardSearchInputDTO boardSearchInput = new BoardSearchInputDTO();
            boardSearchInput.setSearchWord(req.getParameter("searchWord"));
            boardSearchInput.setFrontDate(req.getParameter("frontDate"));
            boardSearchInput.setTailDate(req.getParameter("tailDate"));

            List<BoardListDTO> boardList = new ArrayList<>();
            req.setAttribute("boardList", boardList);
        }


        return "/list";
    }
}

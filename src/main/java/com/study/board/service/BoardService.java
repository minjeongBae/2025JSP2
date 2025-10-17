package com.study.board.service;

import com.study.board.dto.BoardListDTO;
import com.study.board.dto.BoardSearchInputDTO;
import com.study.board.entity.Board;
import com.study.board.repository.BoardDAO;

import java.util.ArrayList;
import java.util.List;

public class BoardService {
    private BoardDAO boardDAO;

    public BoardService () {
        this.boardDAO = new BoardDAO();
    }
    public List<BoardListDTO> getBoardList(BoardSearchInputDTO boardSearchInput){
        /*
        *   TODO myBatis 연동하여 서비스 구현
        *   입력값이 빈값이면 null로 담아 보내며
        *   쿼리문에서는 null이 아닌 경우로 값 검증
        * */
        System.out.println("* getBoardList");
        List<Board> list = boardDAO.selectBoardList(boardSearchInput.getSearchWord(),
                                            boardSearchInput.getFrontDate(),
                                            boardSearchInput.getTailDate());

        List<BoardListDTO> resultList = new ArrayList<BoardListDTO>();
        for(Board board : list){
            BoardListDTO boardListDTO = new BoardListDTO();
            boardListDTO.setBoardId(board.getBoardId());
            boardListDTO.setTitle(board.getTitle());
            boardListDTO.setWriter(board.getWriter());

            resultList.add(boardListDTO);

        }
        return resultList;
    }

}

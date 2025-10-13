package com.study.board.service;

import com.study.board.dto.BoardListDTO;
import com.study.board.dto.BoardSearchInputDTO;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class BoardService {
    public List<BoardListDTO> getBoardList(BoardSearchInputDTO boardSearchInput){
        /*
        *   TODO myBatis 연동하여 서비스 구현
        *   입력값이 빈값이면 null로 담아 보내며
        *   쿼리문에서는 null이 아닌 경우로 값 검증
        * */
        List<BoardListDTO> list = null;
        return list;
    }

    private LocalDate getFormattedDate(BoardSearchInputDTO boardSearchInput){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try{
            LocalDate date =  LocalDate.parse(boardSearchInput.getFrontDate(), formatter);
            return date;
        }catch (Exception e){
            return null;
        }
    }
}

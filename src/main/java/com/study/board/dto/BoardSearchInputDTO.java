package com.study.board.dto;

import lombok.Data;

@Data
public class BoardSearchInputDTO {
    String searchWord;
    String frontDate;
    String tailDate;
}

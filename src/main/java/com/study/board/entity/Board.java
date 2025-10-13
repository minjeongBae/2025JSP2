package com.study.board.entity;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Board {
    int boardId;
    String title;
    int category;
    String writer;
    int views;
    LocalDate createDate;
    LocalDate updateDate;
    String content;
    String password;
}

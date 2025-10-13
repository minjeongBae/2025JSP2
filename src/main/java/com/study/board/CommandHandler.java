package com.study.board;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface CommandHandler {
    public String processCommand(HttpServletRequest req, HttpServletResponse res) throws Exception;
}

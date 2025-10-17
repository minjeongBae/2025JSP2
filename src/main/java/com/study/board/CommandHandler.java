package com.study.board;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface CommandHandler {
    public void processCommand(HttpServletRequest req, HttpServletResponse res) throws Exception;
}

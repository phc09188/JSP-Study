package com.example.jsptest.chapter16.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface Controller {
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}

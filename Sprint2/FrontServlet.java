package etu1776.framework.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Date;
import java.util.*;

import etu1776.framework.*;

public class FrontServlet extends HttpServlet {

  HashMap<String,Mapping> MappingUrls;

    public void processRequest(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        Utile utile = new Utile();

    
        out.println(utile.getMethod(req));

}
  public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    processRequest(req,res);
  }

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

    }

}
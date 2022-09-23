package com.example.thtaoungungtinhchietkhau;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;


@WebServlet(name = "DiscountServlet", value = "/discount")
public class DiscountServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double listPrice = Double.parseDouble(request.getParameter("List Price"));
        double discountPercent = Double.parseDouble(request.getParameter("Discount Percent"));

        double DiscountAmount = listPrice * discountPercent * 0.01;
        double DiscountPrice = listPrice - DiscountAmount ;
        String ProductDescription = String.copyValueOf(request.getParameter("Product Description").toCharArray());
        PrintWriter writer = response.getWriter();

        writer.println("<html>");
        writer.println( "<h1>Product Description: " + ProductDescription + "</h1>");
        writer.println("<h1>Discount Amount: " + DiscountAmount + "</h1>");
        writer.println("<h1>Discount Price: " + DiscountPrice + "</h1>");
        writer.println("</html>");
    }

    public void destroy() {
    }
}
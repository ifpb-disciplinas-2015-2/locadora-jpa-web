/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.jass2125.locadora.jpa.servlets;

import io.github.jass2125.locadora.jpa.Automovel;
import io.github.jass2125.locadora.jpa.AutomovelDao;
import io.github.jass2125.locadora.jpa.IAutomovelDao;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Anderson Souza
 * @email jair_anderson_bs@hotmail.com
 * @since 2015, Feb 9, 2016
 */

@WebServlet(name = "add", urlPatterns = {"/add"})
public class AdicionaAutomovel extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        IAutomovelDao dao = new AutomovelDao();
        Automovel automovel = new Automovel("Wolkswagen", "Gol", 2012, 2013, "Usado");
        dao.add(automovel);
    }
    
    
    
    

}

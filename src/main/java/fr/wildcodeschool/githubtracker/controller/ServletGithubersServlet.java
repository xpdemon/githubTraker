package fr.wildcodeschool.githubtracker.controller;

import fr.wildcodeschool.githubtracker.githubtracker.dao.DumbGithuberDAO;
import fr.wildcodeschool.githubtracker.githubtracker.dao.GithuberDAO;
import fr.wildcodeschool.githubtracker.service.GithubersService;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ServletGithubersServlet",urlPatterns = {"/githubers"})
public class ServletGithubersServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        GithuberDAO githuberDAO = new DumbGithuberDAO();
        GithubersService githubersService = new GithubersService(githuberDAO);

        request.setAttribute("githubers",githubersService.getAllGithubers());
        request.getRequestDispatcher("/githubers.jsp").forward(request,response);
    }

}

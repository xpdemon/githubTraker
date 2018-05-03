package fr.wildcodeschool.githubtracker.controller;

import fr.wildcodeschool.githubtracker.githubtracker.dao.GithuberDAO;
import fr.wildcodeschool.githubtracker.githubtracker.dao.InMemory;
import fr.wildcodeschool.githubtracker.service.GithubUtils;
import fr.wildcodeschool.githubtracker.service.MemoryGithuberDAO;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletTrack",urlPatterns = {"/track","/Track"})
public class ServletTrack extends HttpServlet {


    @Inject
    @InMemory
    GithuberDAO githuberDAO;

    @Inject
    private
    GithubUtils utils;


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login");


        githuberDAO.saveGithuber(utils.parseGithuber(login));
        response.sendRedirect("/githubtracker/githubers");


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        request.getRequestDispatcher("/Tracker.jsp").forward(request,response);
    }
}

package fr.wildcodeschool.githubtracker.controller;

import fr.wildcodeschool.githubtracker.model.Githuber;

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

        List<Githuber> githuberList = new ArrayList<>();
        Githuber sonic = new Githuber();
        sonic.setName("Sonic");sonic.setId(1);sonic.setAvatarUrl("http://www.animated-gifs.eu/category_leisure/avatars-100x100-leisure/0017.gif");sonic.setLogin("Sonic");
        githuberList.add(sonic);

        Githuber mario = new Githuber();
        mario.setName("Mario");mario.setId(2);mario.setAvatarUrl("http://www.animated-gifs.eu/category_leisure/avatars-100x100-leisure/0043.gif");mario.setLogin("Mario");
        githuberList.add(mario);

        Githuber lara = new Githuber();
        lara.setName("Lara");lara.setId(3);lara.setAvatarUrl("http://www.animated-gifs.eu/category_leisure/avatars-100x100-leisure/0105.gif");lara.setLogin("Lara");
        githuberList.add(lara);

        Githuber pacman = new Githuber();
        pacman.setName("Pacman");pacman.setId(4);pacman.setAvatarUrl("http://www.animated-gifs.eu/category_leisure/avatars-100x100-leisure/0031.gif");pacman.setLogin("Pacman");
        githuberList.add(pacman);

        Githuber tails = new Githuber();
        tails.setName("Tails");tails.setId(5);tails.setAvatarUrl("http://www.animated-gifs.eu/category_leisure/avatars-100x100-leisure/0060.gif");tails.setLogin("Tails");
        githuberList.add(tails);

        request.setAttribute("githubers",githuberList);
        request.getRequestDispatcher("/githubers.jsp").forward(request,response);
    }
}

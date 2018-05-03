package fr.wildcodeschool.githubtracker.service;

import fr.wildcodeschool.githubtracker.githubtracker.dao.GithuberDAO;
import fr.wildcodeschool.githubtracker.githubtracker.dao.InMemory;
import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import java.util.List;

@Dependent
public class GithubersService {

    GithuberDAO githuberDAO;


    @Inject
    public GithubersService(@InMemory GithuberDAO githuberDAO) {
        this.githuberDAO = githuberDAO;
    }


    public List<Githuber> getAllGithubers(){
        return githuberDAO.getGithubers();
    }

    public Githuber getGithubers(String login){
        for (int i = 0; i < githuberDAO.getGithubers().size() ; i++) {
            if (githuberDAO.getGithubers().get(i).getLogin() == login){
                return githuberDAO.getGithubers().get(i);
            }

        }
        return null;

    }

    public void track(String login){
        //TODO
    }



}

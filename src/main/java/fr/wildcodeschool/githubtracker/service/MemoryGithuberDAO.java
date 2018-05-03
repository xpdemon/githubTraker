package fr.wildcodeschool.githubtracker.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.wildcodeschool.githubtracker.githubtracker.dao.GithuberDAO;
import fr.wildcodeschool.githubtracker.githubtracker.dao.InMemory;
import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@ApplicationScoped
@InMemory
public class MemoryGithuberDAO implements GithuberDAO {


    private @Inject GithubUtils utils;

    private Map<String,Githuber> githuberHashMap = new HashMap<>();

    @Override
    public List<Githuber> getGithubers() {
        List<Githuber> githuberList = new ArrayList<>();
        for(HashMap.Entry<String,Githuber> entry: githuberHashMap.entrySet()){
            githuberList.add(entry.getValue());
        }
        return githuberList;
    }



    @Override
    public void saveGithuber(Githuber githuber) {
        githuberHashMap.put(githuber.getLogin(),githuber);


    }



    @PostConstruct
    public void init(){
        saveGithuber(utils.parseGithuber("xpdemon"));
        saveGithuber(utils.parseGithuber("jean"));
        saveGithuber(utils.parseGithuber("michel"));

    }
}

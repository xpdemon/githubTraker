package fr.wildcodeschool.githubtracker.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

@ApplicationScoped
public class GithubUtils {
    @Inject
    private ObjectMapper om ;

    public Githuber parseGithuber(String login){

        URL url = null;
        try {
            url = new URL("https://api.github.com/users/"+login);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        URLConnection connection = null;
        try {
            assert url != null;
            connection = url.openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Githuber githuber = null;
        try {
            assert connection != null;
            githuber = om.readValue(connection.getInputStream(),Githuber.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if ( githuber== null){
            return null;
        }

        return githuber;
    }
}

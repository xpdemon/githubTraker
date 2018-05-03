package fr.wildcodeschool.githubtracker.model;

import com.fasterxml.jackson.annotation.JsonCreator;



public class Githuber {


    String name;
    String email;
    String login;
    int id;
    String avatar_url;

    @JsonCreator
    public String getName() {
        return name;
    }

    @JsonCreator
    public String getEmail() {
        return email;
    }

    @JsonCreator
    public String getLogin() {
        return login;
    }

    @JsonCreator
    public int getId() {
        return id;
    }

    @JsonCreator
    public String getAvatarUrl() {
        return avatar_url;
    }

    @JsonCreator
    public void setName(String name) {
        this.name = name;
    }

    @JsonCreator
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonCreator
    public void setLogin(String login) {
        this.login = login;
    }

    @JsonCreator
    public void setId(int id) {
        this.id = id;
    }

    @JsonCreator
    public void setAvatarUrl(String avatarUrl) {
        this.avatar_url = avatarUrl;
    }
}

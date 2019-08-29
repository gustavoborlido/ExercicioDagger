package com.gustavo.exerciciodagger.model;

import com.google.gson.annotations.SerializedName;

public class Autor {

    @SerializedName("id")
    private Long id;

    @SerializedName("login")
    private String login;

    @SerializedName("avatar_url")
    private String avatar;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}

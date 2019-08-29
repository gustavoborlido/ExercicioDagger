package com.gustavo.exerciciodagger.model;

import com.google.gson.annotations.SerializedName;

public class PullRequest {

    @SerializedName("id")
    private Long id;

    @SerializedName("title")
    private String titulo;

    @SerializedName("head")
    private Head head;

    @SerializedName("user")
    private Autor autor;

    @SerializedName("body")
    private String corpo;

    @SerializedName("created_at")
    private String data;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getCorpo() {
        return corpo;
    }

    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}

package com.gustavo.exerciciodagger.model;

import com.google.gson.annotations.SerializedName;

public class Repositorio {

    @SerializedName("id")
    private String id;

    @SerializedName("name")
    private String nome;

    @SerializedName("description")
    private String descricao;

    @SerializedName("forks_count")
    private Long forks;

    @SerializedName("stargazers_count")
    private Long estrelas;

    @SerializedName("owner")
    private Autor autor;

    @SerializedName("full_name")
    private String nomeCompleto;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Long getForks() {
        return forks;
    }

    public void setForks(Long forks) {
        this.forks = forks;
    }

    public Long getEstrelas() {
        return estrelas;
    }

    public void setEstrelas(Long estrelas) {
        this.estrelas = estrelas;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
}
package com.gustavo.exerciciodagger.model;

import com.google.gson.annotations.SerializedName;

public class Head {

    @SerializedName("repo")
    private Repositorio repositorio;

    public Repositorio getRepositorio() {
        return repositorio;
    }

    public void setRepositorio(Repositorio repositorio) {
        this.repositorio = repositorio;
    }
}

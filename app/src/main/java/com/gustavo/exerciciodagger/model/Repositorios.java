package com.gustavo.exerciciodagger.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Repositorios {

    @SerializedName("items")
    private List<Repositorio> repositorios;

    public List<Repositorio> getRepositorios() {
        return repositorios;
    }

    public void setRepositorios(List<Repositorio> repositorios) {
        this.repositorios = repositorios;
    }
}

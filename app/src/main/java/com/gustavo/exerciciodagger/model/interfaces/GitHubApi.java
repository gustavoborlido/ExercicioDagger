package com.gustavo.exerciciodagger.model.interfaces;

import com.gustavo.exerciciodagger.model.PullRequest;
import com.gustavo.exerciciodagger.model.Repositorios;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface GitHubApi {

    @GET("search/repositories?q=language:Java&sort=stars")
    Call<Repositorios> listarRepositorios(@Query("page") String pagina);

    @GET("repos/{autor}/{repositorio}/pulls")
    Call<List<PullRequest>> listarPullRequest(@Path("repositorio") String repositorio, @Path("autor") String autor);
}

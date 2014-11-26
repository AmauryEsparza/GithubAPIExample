package com.example.githubapiexample.InformationHandlers;

import com.example.githubapiexample.Models.Contributor;

import java.util.List;

import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by Amaury Esparza on 23/11/2014.
 */

public interface GithubService {
    @GET("/repos/{owner}/{repo}/contributors")
    public List<Contributor> contributors(@Path("owner") String owner, @Path("repo") String repo);
}

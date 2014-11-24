package com.example.githubapiexample.InformationHandlers;

import com.example.githubapiexample.BussinessControllers.RepositoriesBussinessController;

import org.json.JSONArray;

import java.util.List;

import retrofit.client.Response;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by Amaury Esparza on 23/11/2014.
 */

public interface GithubService {
    @GET("/users/{user}/repos")
    JSONArray listRepos(@Path("user") String user);
}

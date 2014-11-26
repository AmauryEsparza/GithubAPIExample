package com.example.githubapiexample.BusinessControllers;

import android.util.Log;

import com.example.githubapiexample.InformationHandlers.GithubService;
import com.example.githubapiexample.Models.Contributor;

import java.util.ArrayList;
import java.util.List;

import retrofit.RestAdapter;

/**
 * Created by Amaury Esparza on 23/11/2014.
 */
public class RepositoriesBusinessController implements IRepositories {
    private ArrayList<String> repos;
    private List<Contributor> listContributors;

    @Override
    public ArrayList<String> getRepositories(String username){
        //Endpoint
        RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint("https://api.github.com").build();
        GithubService service = restAdapter.create(GithubService.class);
        listContributors = service.contributors(username, "retrofit");
        Log.d("List Contributors", listContributors+" ");
        return repos;
    }
}

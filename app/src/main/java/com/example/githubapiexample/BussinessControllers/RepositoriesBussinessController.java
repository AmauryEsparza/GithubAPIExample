package com.example.githubapiexample.BussinessControllers;

import android.util.Log;
import android.widget.ArrayAdapter;

import com.example.githubapiexample.InformationHandlers.GithubService;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.List;

import retrofit.RestAdapter;
import retrofit.client.Response;

/**
 * Created by Amaury Esparza on 23/11/2014.
 */
public class RepositoriesBussinessController implements IRepositories {
    private ArrayList<String> repos;
    private JSONArray response;

    @Override
    public ArrayList<String> getRepositories(String username){
        RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint("https://api.github.com").build();
        GithubService service = restAdapter.create(GithubService.class);
        response = service.listRepos(username);
        Log.d("JSONArray", response+"");
        return repos;
    }
}

package com.example.githubapiexample.BusinessControllers;

import java.util.ArrayList;

/**
 * Created by Amaury Esparza on 23/11/2014.
 */
public interface IRepositories {
    public ArrayList<String> getRepositories(String username);
}

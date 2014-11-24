package com.example.githubapiexample.ViewControllers;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.githubapiexample.BussinessControllers.RepositoriesBussinessController;
import com.example.githubapiexample.R;


public class RepositoriesViewController extends Activity {

    EditText usernameText;
    Button findButton;
    ListView repoListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Init Components
        usernameText = (EditText) findViewById(R.id.usernameText);
        findButton = (Button) findViewById(R.id.findButton);

        findButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                RepositoriesBussinessController repoBC = new RepositoriesBussinessController();
                repoBC.getRepositories(usernameText.getText().toString());
            }
        });
    }
}

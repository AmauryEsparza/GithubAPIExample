package com.example.githubapiexample.ViewControllers;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.githubapiexample.BusinessControllers.RepositoriesBusinessController;
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
                RepositoriesBusinessController repoBC = new RepositoriesBusinessController();
                repoBC.getRepositories(usernameText.getText().toString());
            }
        });
    }
}

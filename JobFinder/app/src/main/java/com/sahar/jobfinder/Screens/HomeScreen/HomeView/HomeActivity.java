package com.sahar.jobfinder.Screens.HomeScreen.HomeView;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.sahar.jobfinder.R;
import com.sahar.jobfinder.Screens.JobsScreen.JobsView.JobsActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button allJobsBtn = findViewById(R.id.allJobsBtn);
        Button favJobsBtn = findViewById(R.id.favJobsBtn);

        allJobsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HomeActivity.this, JobsActivity.class);
                startActivity(intent);
            }
        });

        favJobsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(HomeActivity.this, );
            }
        });
    }
}

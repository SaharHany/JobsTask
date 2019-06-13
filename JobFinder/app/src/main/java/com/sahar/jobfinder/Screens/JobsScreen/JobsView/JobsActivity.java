package com.sahar.jobfinder.Screens.JobsScreen.JobsView;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.EditText;

import com.sahar.jobfinder.Model.Job;
import com.sahar.jobfinder.R;
import com.sahar.jobfinder.Screens.HomeScreen.HomePresenter.HomePresenter;
import com.sahar.jobfinder.Screens.JobsScreen.JobsPresenter.JobsPresenter;

import java.util.ArrayList;

public class JobsActivity extends AppCompatActivity {

    ArrayList<Job> jobs ;
    RecyclerView recyclerView ;
    RecyclerView.LayoutManager layoutManager ;
    Adapter adapter ;
    JobsPresenter presenter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jobs);
        presenter = new JobsPresenter(this);

        recyclerView = (RecyclerView) findViewById(R.id.jobsRecView);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter =  new Adapter(jobs,this);

        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }

    public void setJobs(ArrayList<Job> jobs) {
        this.jobs = jobs;
    }
}

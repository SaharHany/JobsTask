package com.sahar.jobfinder.Screens.JobsScreen.JobsPresenter;

import com.sahar.jobfinder.Model.Job;
import com.sahar.jobfinder.Screens.JobsScreen.JobsView.JobsActivity;
import com.sahar.jobfinder.Utilities.Network.RetrofitConnection;

import java.util.ArrayList;

public class JobsPresenter {

    ArrayList<Job> jobs ;
    JobsActivity jobsActivity ;
    RetrofitConnection retrofitConnection ;

    public JobsPresenter(JobsActivity jobsActivity) {
        this.jobsActivity = jobsActivity;
        retrofitConnection = new RetrofitConnection();
        retrofitConnection.setBase_url("https://jobs.github.com");
    }

    public void downloadJobs(){
        
    }

}

package com.sahar.jobfinder.Utilities.Network;

import com.sahar.jobfinder.Model.Job;

import java.util.ArrayList;

import io.reactivex.Observable;
import io.reactivex.internal.operators.observable.ObservableLift;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface JobsApi {
    @GET("positions.json")
    Call<ArrayList<Job>> getJobs(@Query("description") String desc , @Query("location") String loc);
}

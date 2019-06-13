package com.sahar.jobfinder.Utilities.Network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitConnection {
    public String base_url;
            //"https://jobs.github.com";

    public RetrofitConnection() {

    }

    public void setBase_url(String base_url){
        this.base_url = base_url ;
    }
    private Retrofit getRetrofitInstance() {

        return new Retrofit.Builder()
                .baseUrl(base_url).addConverterFactory(GsonConverterFactory.create()).build();
    }

    public JobsApi getRetrofitService(){
        return getRetrofitInstance().create(JobsApi.class);
    }
}

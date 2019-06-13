package com.sahar.jobfinder.Screens.JobsScreen.JobsView;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.sahar.jobfinder.Model.Job;
import com.sahar.jobfinder.R;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private ArrayList<Job> jobsList ;
    private Context context ;

    public Adapter() {
    }

    public Adapter(ArrayList<Job> mDataset, Context context){
        jobsList = mDataset;
        this.context = context ;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = (View) LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.cardview,viewGroup,false);

        Adapter.ViewHolder viewHolder = new Adapter.ViewHolder(view);
        return viewHolder ;
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Job job = jobsList.get(i);
        TextView nameTV = viewHolder.view.findViewById(R.id.jobNameTV);

        TextView companyTV = viewHolder.view.findViewById(R.id.companyNameTV);

        TextView creationDate = viewHolder.view.findViewById(R.id.jobDateTV);

        nameTV.setText(job.getTitle());
        companyTV.setText(job.getCompany());
        creationDate.setText(job.getCreated_at());
        ImageView img = viewHolder.view.findViewById(R.id.jobIconIV);
        Glide.with(context)
                .load(job.getCompany_logo()).apply(RequestOptions.circleCropTransform())
                .into(img);

    }

    @Override
    public int getItemCount() {
        return jobsList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public View view ;

        public ViewHolder(View view) {
            super(view);
            this.view = view;
        }
    }
}

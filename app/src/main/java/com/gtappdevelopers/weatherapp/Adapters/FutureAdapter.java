package com.gtappdevelopers.weatherapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.gtappdevelopers.weatherapp.Domains.FutureDomain;
import com.gtappdevelopers.weatherapp.Domains.Hourly;
import com.gtappdevelopers.weatherapp.R;

import java.util.ArrayList;

public class FutureAdapter extends RecyclerView.Adapter<FutureAdapter.viewholder> {
 ArrayList<FutureDomain> items;
 Context context;
    @NonNull
    @Override
    public FutureAdapter.viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate= LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_future,parent,false);
        context=parent.getContext();
        return new viewholder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull FutureAdapter.viewholder holder, int position) {
    holder.dayTxt.setText(items.get(position).getDay());
    holder.statusTxt.setText(items.get(position).getStatus());
    holder.highTxt.setText(items.get(position).getHighTemp()+"°");
    holder.lowTxt.setText(items.get(position).getLowTemp()+"°");
        int drawableResourceId=holder.itemView.getResources()
                .getIdentifier(items.get(position).getPicPath(),"drawable",holder.itemView.getContext().getPackageName());
        Glide.with(context)
                .load(drawableResourceId)
                .into(holder.pic);
    }

    public FutureAdapter(ArrayList<FutureDomain > items) {
        this.items = items;
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class viewholder extends RecyclerView.ViewHolder{

        TextView dayTxt,statusTxt,lowTxt,highTxt;
        ImageView pic;
        public viewholder(@NonNull View itemView) {
            super(itemView);

            dayTxt=itemView.findViewById(R.id.dayTxt);
            statusTxt=itemView.findViewById(R.id.statusTxt);
            pic=itemView.findViewById(R.id.pic);
            lowTxt=itemView.findViewById(R.id.lowTxt);
            highTxt=itemView.findViewById(R.id.highTxt);
        }
    }
}

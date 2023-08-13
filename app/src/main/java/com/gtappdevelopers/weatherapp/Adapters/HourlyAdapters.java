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
import com.gtappdevelopers.weatherapp.Domains.Hourly;
import com.gtappdevelopers.weatherapp.R;

import java.util.ArrayList;

public class HourlyAdapters extends RecyclerView.Adapter<HourlyAdapters.viewholder> {
 ArrayList<Hourly> items;
 Context context;
    @NonNull
    @Override
    public HourlyAdapters.viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate= LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_hourly,parent,false);
        context=parent.getContext();
        return new viewholder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull HourlyAdapters.viewholder holder, int position) {
        holder.hourTxt.setText(items.get(position).getHour());
        holder.tempText.setText(items.get(position).getTemp()+"°");
        int drawableResourceId=holder.itemView.getResources()
                .getIdentifier(items.get(position).getPicPath(),"drawable",holder.itemView.getContext().getPackageName());
        Glide.with(context)
                .load(drawableResourceId)
                .into(holder.pic);
    }

    public HourlyAdapters(ArrayList<Hourly> items) {
        this.items = items;
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class viewholder extends RecyclerView.ViewHolder{
        TextView hourTxt,tempText;
        ImageView pic;
        public viewholder(@NonNull View itemView) {
            super(itemView);

            hourTxt=itemView.findViewById(R.id.hourTxt);
            tempText=itemView.findViewById(R.id.tempTxt);
            pic=itemView.findViewById(R.id.pic);
        }
    }
}

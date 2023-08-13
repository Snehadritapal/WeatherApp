package com.gtappdevelopers.weatherapp.Activitis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.provider.SyncStateContract;
import android.view.View;

import com.gtappdevelopers.weatherapp.Adapters.FutureAdapter;
import com.gtappdevelopers.weatherapp.Domains.FutureDomain;
import com.gtappdevelopers.weatherapp.R;

import java.util.ArrayList;

public class FutureActivity extends AppCompatActivity {
private RecyclerView.Adapter adapterTommorow;
public RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_future);

        initRecyclerView();
        setVariable();
    }

    private void setVariable() {
        ConstraintLayout backBtn =findViewById(R.id.backBtn);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FutureActivity.this,MainActivity.class));
            }
        });
    }

    private void initRecyclerView() {
        ArrayList<FutureDomain> items=new ArrayList<>();
        items.add(new FutureDomain("Sat","storm","storm",25,10));
        items.add(new FutureDomain("Sun","cloudy","cloudy",24,16));
        items.add(new FutureDomain("Mon","windy","windy",29,15));
        items.add(new FutureDomain("Tue","cloudy_sunny","Cloudy_Sunny",22,13));
        items.add(new FutureDomain("Wed","sunny","sunny",28,11));
        items.add(new FutureDomain("Thu","rainy","Rainy",23,12));

        recyclerView=findViewById(R.id.view2);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

        adapterTommorow=new FutureAdapter(items);
        recyclerView.setAdapter(adapterTommorow);
    }
}
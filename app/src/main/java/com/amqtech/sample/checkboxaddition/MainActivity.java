package com.amqtech.sample.checkboxaddition;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<TimeSaver> tsList = new ArrayList<>();
    private TimeSaverAdapter mAdapter;
    private TextView total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new TimeSaverAdapter(tsList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        total = (TextView) findViewById(R.id.total_tv);
        total.setText("Blahahahaha");

        prepTSData();
    }

    private void prepTSData() {
        TimeSaver ts = new TimeSaver("Get a coffee machine with a timer", "2 min", 2);
        tsList.add(ts);

        ts = new TimeSaver("Do your training at home", "8 min", 8);
        tsList.add(ts);

        ts = new TimeSaver("Buy a cheap preheating system for your car", "3 min", 3);
        tsList.add(ts);

        ts = new TimeSaver("Eat leftovers from yesterdays dinner", "5 min", 5);
        tsList.add(ts);

        ts = new TimeSaver("Brush your teeth in the shower", "2 min", 2);
        tsList.add(ts);

        ts = new TimeSaver("Do your training at home", "8 min", 8);
        tsList.add(ts);

        ts = new TimeSaver("Buy a cheap preheating system for your car", "3 min", 3);
        tsList.add(ts);

        ts = new TimeSaver("Eat leftovers from yesterdays dinner", "5 min", 5);
        tsList.add(ts);

        ts = new TimeSaver("Brush your teeth in the shower", "2 min", 2);
        tsList.add(ts);

        ts = new TimeSaver("Do your training at home", "8 min", 8);
        tsList.add(ts);

        ts = new TimeSaver("Buy a cheap preheating system for your car", "3 min", 3);
        tsList.add(ts);

        ts = new TimeSaver("Eat leftovers from yesterdays dinner", "5 min", 5);
        tsList.add(ts);

        ts = new TimeSaver("Brush your teeth in the shower", "2 min", 2);
        tsList.add(ts);

        ts = new TimeSaver("Do your training at home", "8 min", 8);
        tsList.add(ts);

        ts = new TimeSaver("Buy a cheap preheating system for your car", "3 min", 3);
        tsList.add(ts);

        ts = new TimeSaver("Eat leftovers from yesterdays dinner", "5 min", 5);
        tsList.add(ts);

        ts = new TimeSaver("Brush your teeth in the shower", "2 min", 2);
        tsList.add(ts);

        mAdapter.notifyDataSetChanged();
    }
}

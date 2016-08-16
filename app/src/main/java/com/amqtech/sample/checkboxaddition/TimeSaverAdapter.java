package com.amqtech.sample.checkboxaddition;

/**
 * Created by andrew on 8/15/16.
 */

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import java.util.List;

public class TimeSaverAdapter extends RecyclerView.Adapter<TimeSaverAdapter.MyViewHolder> {

    private List<TimeSaver> timeSaverList;

    public TimeSaverAdapter(List<TimeSaver> timeSaverList) {
        this.timeSaverList = timeSaverList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.time_saver_row, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final TimeSaverAdapter.MyViewHolder holder, int position) {
        final TimeSaver ts = timeSaverList.get(position);
        holder.title.setText(ts.getTitle());
        holder.time.setText(ts.getTime());
        holder.value = ts.getAmount();
    }

    @Override
    public int getItemCount() {
        return timeSaverList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        CheckBox time;
        int value;

        MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            time = (CheckBox) view.findViewById(R.id.time);

            time.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    //TODO: Store value of each checkbox from the list somewhere to be accessed later in the main activity.
                }
            });
        }
    }
}

package com.amqtech.sample.checkboxaddition;

/**
 * Created by andrew on 8/15/16.
 */

public class TimeSaver {

    private String title, time;
    private int amount;

    public TimeSaver(String title, String time, int amount) {
        this.title = title;
        this.time = time;
        this.amount = amount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}

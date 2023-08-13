package com.gtappdevelopers.weatherapp.Domains;

public class FutureDomain {
    private String day;
    private String picpath;
    private String status;
    private int highTemp;
    private int lowTemp;

    public FutureDomain(String day, String picpath, String status, int highTemp, int lowTemp) {
        this.day = day;
        this.picpath = picpath;
        this.status = status;
        this.highTemp = highTemp;
        this.lowTemp = lowTemp;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getPicPath() {
        return picpath;
    }

    public void setPicPath(String picpath) {
        this.picpath = picpath;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getHighTemp() {
        return highTemp;
    }

    public void setHighTemp(int highTemp) {
        this.highTemp = highTemp;
    }

    public int getLowTemp() {
        return lowTemp;
    }

    public void setLowTemp(int lowTemp) {
        this.lowTemp = lowTemp;
    }


}

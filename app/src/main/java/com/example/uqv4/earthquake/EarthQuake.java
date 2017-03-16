package com.example.uqv4.earthquake;

/**
 * Created by uqv4 on 14/03/2017.
 */

public class EarthQuake {

    private static final String LogEarthQuake="LogEarthQuake";

    private String mag;
    private String city;
    private String date;


    public EarthQuake(String iMag, String iCity, String iDate){
        mag=iMag;
        city=iCity;
        date=iDate;
    }

    // getters

    public String getMag(){
        return mag;
    }
    public String getCity(){
        return city;
    }
    public String getDate(){
        return date;
    }



}

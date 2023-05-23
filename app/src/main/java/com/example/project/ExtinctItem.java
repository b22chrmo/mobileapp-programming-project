package com.example.project;

import com.google.gson.annotations.SerializedName;

public class ExtinctItem {

    protected String ID;
    protected String name;

    @SerializedName(value = "type", alternate = "login")
    protected String login;
    @SerializedName(value = "location", alternate = "existed")
    protected String existed;
    @SerializedName(value = "company", alternate = "popularity")
    protected String genus;

    public String getName() {
        return name;
    }

    public String getExisted() {
        return existed;
    }

    public String getGenus() {
        return genus;
    }
}

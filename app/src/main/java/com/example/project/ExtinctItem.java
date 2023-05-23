package com.example.project;

public class ExtinctItem {

    private String ID;
    private String login;
    private String name;
    private String existed;
    private String genus;

    public ExtinctItem(String name) {
        this.name = name;
    }

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

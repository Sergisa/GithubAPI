package com.sergisa;

import com.google.gson.annotations.SerializedName;

public class Repo {
    @SerializedName("name")
    public String name;
    @SerializedName("id")
    public int id;
    @SerializedName("owner")
    public Owner owner;
    @SerializedName("fork")
    public boolean fork;
    @SerializedName("language")
    public String language;

    public String visibleName(){
        return "Repo " + name;
    }

    @Override
    public String toString() {
        return "Repo{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", owner=" + owner +
                '}';
    }

    static class Owner{
        @SerializedName("id")
        public int id;
        @SerializedName("login")
        public String name;


    }
}

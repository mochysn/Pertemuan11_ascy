package com.moch.Pertemuan11_ascy;

import com.google.gson.annotations.SerializedName;



public class GitUser {
    public int id;
    public String login;

    @SerializedName("avatar_url")
    public  String avatarUrl;
    public int score;
}

package com.example.starhood.recyclerviewbaseadapterexample.POJO;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by starhood on 10/12/18.
 */

public class DataClass implements Parcelable {
    private String title;
    private String disc;
    private String location;
    private String webSite;
    private int imgUrl;

    public DataClass(String title, String disc, String location, String webSite) {
        this.title = title;
        this.disc = disc;
        this.location = location;
        this.webSite = webSite;
    }

    public DataClass(){}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDisc() {
        return disc;
    }

    public void setDisc(String disc) {
        this.disc = disc;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public int getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(int imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.title);
        dest.writeString(this.disc);
        dest.writeString(this.location);
        dest.writeString(this.webSite);
        dest.writeInt(this.imgUrl);
    }

    protected DataClass(Parcel in) {
        this.title = in.readString();
        this.disc = in.readString();
        this.location = in.readString();
        this.webSite = in.readString();
        this.imgUrl = in.readInt();
    }

    public static final Creator<DataClass> CREATOR = new Creator<DataClass>() {
        @Override
        public DataClass createFromParcel(Parcel source) {
            return new DataClass(source);
        }

        @Override
        public DataClass[] newArray(int size) {
            return new DataClass[size];
        }
    };
}

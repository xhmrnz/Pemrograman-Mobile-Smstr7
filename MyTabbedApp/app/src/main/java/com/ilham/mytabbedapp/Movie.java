package com.ilham.mytabbedapp;

import android.os.Parcel;
import android.os.Parcelable;

public class Movie implements Parcelable {
    private String photo;
    private String name;
    private String description;
    private String duration;
    private String genre;
    private String director;
    private String year;

    public Movie() {

    }

    public String getPhoto() {
        return photo;
    }
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    protected Movie(Parcel in) {
        photo = in.readString();
        name = in.readString();
        description = in.readString();
        duration = in.readString();
        genre = in.readString();
        director = in.readString();
        year = in.readString();
    }

    public static final Parcelable.Creator<Movie> CREATOR = new Parcelable.Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel source) {
            return new Movie(source);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(photo);
        dest.writeString(name);
        dest.writeString(description);
        dest.writeString(duration);
        dest.writeString(genre);
        dest.writeString(director);
        dest.writeString(year);
    }
}

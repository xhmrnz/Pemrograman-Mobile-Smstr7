package com.ilham.myfoodcatalogue.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Drink implements Parcelable {

    private String name;
    private String desc;
    private String photo;
    private String harga;

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public Drink() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public static Creator<Drink> getCREATOR() {
        return CREATOR;
    }

    protected Drink(Parcel in) {
        name = in.readString();
        desc = in.readString();
        photo = in.readString();
    }

    public static final Creator<Drink> CREATOR = new Creator<Drink>() {
        @Override
        public Drink createFromParcel(Parcel in) {
            return new Drink(in);
        }

        @Override
        public Drink[] newArray(int size) {
            return new Drink[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(desc);
        parcel.writeString(photo);
    }
}

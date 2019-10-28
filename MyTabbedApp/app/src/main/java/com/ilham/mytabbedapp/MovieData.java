package com.ilham.mytabbedapp;

import java.util.ArrayList;

public class MovieData {
    public static String[][] data = new String[][]{
            {"The Avengers","1Hr 58Min","Action, Fantasy, War","Anthony Russo, Joe Russo","2017",
                    "Earth\\'s mightiest heroes must come together and learn to fight as a team if they are going to stop the mischievous Loki and his alien army from enslaving humanity.",
                    "https://m.media-amazon.com/images/M/MV5BMTg5MTE2NjA4OV5BMl5BanBnXkFtZTgwMTUyMjczMTE@._V1_UX182_CR0,0,182,268_AL_.jpg"},
            {"Avengers  Infinity War","2Hr 21Min","Action, Fantasy, War","Anthony Russo, Joe Russo","2018",
                    "The Avengers and their allies must be willing to sacrifice all in an attempt to defeat the powerful Thanos before his blitz of devastation and ruin puts an end to the universe.",
                    "https://m.media-amazon.com/images/M/MV5BMTg5MTE2NjA4OV5BMl5BanBnXkFtZTgwMTUyMjczMTE@._V1_UX182_CR0,0,182,268_AL_.jpg"},
            {"Avengers  End Game","2Hr 55Min","Action, Fantasy, War","Anthony Russo, Joe Russo","2019",
                    "After the devastating events of Avengers: Infinity War (2018), the universe is in ruins. With the help of remaining allies, the Avengers assemble once more in order to reverse Thanos actions and restore balance to the universe.",
                    "https://m.media-amazon.com/images/M/MV5BMTg5MTE2NjA4OV5BMl5BanBnXkFtZTgwMTUyMjczMTE@._V1_UX182_CR0,0,182,268_AL_.jpg"},
            {"Batman v Superman Dawn of Justice","2Hr 10Min","Action, Fantasy, Thriller","Zack Snyder","2017",
                    "Fearing that the actions of Superman are left unchecked, Batman takes on the Man of Steel, while the world wrestles with what kind of a hero it really needs.",
                    "https://images-na.ssl-images-amazon.com/images/I/51%2Bzb74v-TL.jpg"},
            {"Game of Thrones","1Hr 30Min","Drama, Thriller, Mystery","David Benioff, D.B. Weiss","2014",
                    "Nine noble families fight for control over the mythical lands of Westeros, while an ancient enemy returns after being dormant for thousands of years.",
                    "https://images-na.ssl-images-amazon.com/images/I/51%2Bzb74v-TL.jpg"},
            {"Game of Thrones Season 8","58Min","Drama, Thriller, Mystery","David Benioff, D.B. Weiss","2018",
                    "The end is coming for \"Game of Thrones,\" although not until 2019. Here\\'s what we know about Season 8 of \"Game of Thrones\" so far.",
                    "https://images-na.ssl-images-amazon.com/images/I/51%2Bzb74v-TL.jpg"}
    };

    public static ArrayList<Movie> getListData(){
        Movie movie = null;
        ArrayList<Movie> list = new ArrayList<>();
        for (String[] aData : data){
            movie = new Movie();
            movie.setName(aData[0]);
            movie.setDuration(aData[1]);
            movie.setGenre(aData[2]);
            movie.setDirector(aData[3]);
            movie.setYear(aData[4]);
            movie.setDescription(aData[5]);
            movie.setPhoto(aData[6]);

            list.add(movie);
        }
        return list;
    }
}

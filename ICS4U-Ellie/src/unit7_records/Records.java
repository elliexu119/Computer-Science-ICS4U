/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit7_records;

import java.io.RandomAccessFile;

/**
 *
 * @author 1xuell
 */
public class Records extends Parent{

    private int id;
    private String song;
    private String writer;
    private int year;
    private double rating;
    private boolean favourite;

    public Records() {
        this.id = -1;
    }
      
    public Records(String song, String writer, int year, double rating, boolean favourite) {
        this();
        this.song = song;
        this.writer = writer;
        this.year = year;
        this.rating = rating;
        this.favourite = favourite;
    }

    public void setid(int id){
        this.id = id; 
    }
    
    public void setSong(String song) {
        this.song = song;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
    }

    public int getid(){
        return id; 
    }
    public double getRating() {
        return Double.parseDouble(methodNum(rating, RATING_SIZE));
    }

    public String getSong() {
        return method(song, SONG_SIZE);
    }

    public String getWriter() {
        return method(writer, WRITER_SIZE);
    }

    public int getYear() {
        return Integer.parseInt(methodNum(year, YEAR_SIZE));
    }

    public boolean getFavourite() {
        return favourite;
    }

    public String method(String a, int b) {
        StringBuilder temp = new StringBuilder();
        if (a != null) {
            temp.append(a.trim());
        } else {
            temp.append("TBD");
        }
        temp.setLength(b);
        return temp.toString();
    }

    public String methodNum(double a, int b) {
        StringBuilder temp = new StringBuilder();
        if (a != 0) {
            temp.append(a);
        } else {
            temp.append("TBD");
        }
        temp.setLength(b);
        return temp.toString();
    }
}

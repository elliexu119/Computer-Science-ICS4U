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
public class Records {

    protected final int SONG_SIZE = 36;
    protected final int WRITER_SIZE = 15;
    protected final int YEAR_SIZE = 4;
    protected final int DURATION_SIZE = 3;
    protected final int FAVOURITE_SIZE = 10;
    protected final int RECORD_SIZE = 115; //(SONG_SIZE + WRITER_SIZE)*2 + YEAR_SIZE + RATING_SIZE + 1;
    private String song;
    private String writer;
    private int year;
    private double duration;
    private boolean favourite;
    private RandomAccessFile file;
    //private char

    public Records(String song, String writer, int year, double duration, boolean favourite) {
        this.song = song;
        this.writer = writer;
        this.year = year;
        this.duration = duration;
        this.favourite = favourite;
    }

    public Records() throws Exception {
        file = new RandomAccessFile("song_info.txt", "rw");
    }
    
    public int length()throws Exception {
        return (int) file.length(); 
    }

    public void write(Records records) throws Exception {
        file.writeChars(records.getSong());
        file.writeChars(records.getWriter());
        file.writeInt(records.getYear());
        file.writeDouble(records.getDuration());
        file.writeBoolean(records.getFavourite());
    }

    public void read(int begin, Records records) throws Exception {
        int i = begin;
        for (; i < records.SONG_SIZE * 2 + begin; i = i + 2) {
            file.seek(i);
            System.out.print(file.readChar());
        }
        System.out.println("");
        for (; i < (records.SONG_SIZE + records.WRITER_SIZE) * 2 + begin; i = i + 2) {
            file.seek(i);
            System.out.print(file.readChar());
        }
        System.out.println("");

        file.seek((records.SONG_SIZE + records.WRITER_SIZE) * 2 + begin);
        System.out.println(file.readInt());

        file.seek((records.SONG_SIZE + records.WRITER_SIZE) * 2 + records.YEAR_SIZE + begin);
        System.out.println(file.readDouble());

        file.seek((records.SONG_SIZE + records.WRITER_SIZE) * 2 + records.YEAR_SIZE + records.DURATION_SIZE + 5 + begin);
        System.out.println(file.readBoolean());
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

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
    }

    public double getDuration() {
        return Double.parseDouble(methodNum(duration, DURATION_SIZE));
    }

    public String getSong() {
        this.song = method(song, SONG_SIZE);
        return song;
    }

    public String getWriter() {
        this.writer = method(writer, WRITER_SIZE);
        return writer;
    }

    public int getYear() {
        return Integer.parseInt(methodNum(year, YEAR_SIZE));
    }

    public boolean getFavourite() {
        StringBuilder temp = new StringBuilder();
        temp.append(favourite);
        temp.setLength(FAVOURITE_SIZE);
        return Boolean.parseBoolean(temp.toString());
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit7_records;

/**
 *
 * @author 1xuell
 */
public class Records {

    protected final int RECORD_SIZE = 58;
    protected final int SONG_SIZE = 39;
    protected final int WRITER_SIZE = 15;
    protected final int YEAR_SIZE = 4; 
    private String song;
    private String writer;
    private String year; 

    public Records(String song, String writer, String year) {
        this.song = song;
        this.writer = writer;
        this.year = year;
    }

    public String getSong() {
        this.song = method(song, SONG_SIZE);
        return song;
    }

    public String getWriter() {
        this.writer = method(writer, WRITER_SIZE);
        return writer;
    }

    public String getYear() {
        method (year, YEAR_SIZE);
        return year;
    }
    
    public void together(){
        
        System.out.println(song.length());
    }
    
    public String method (String a, int b ){
        StringBuilder temp = new StringBuilder();
        if ( a != null ) {
            temp.append( a.trim() );
        } else {
            temp.append( "TBD" );
        }
        temp.setLength( b );
        return temp.toString(); 
    }
}

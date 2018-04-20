/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unti4.examples;

/**
 *
 * @author 1xuell
 */
public class BookInfo {

    private String[] chapter = {"chapter 1", "chapter 2"};
    private String title = "book";
    private String author = "you know who I am";
    private int totalPages = chapter.length * 8;
    private int edition = 1;
    private long ID =0; 
    private long genreId =0; 

    public String[] getChapter() {
        return chapter;
    }

    public void setChapter(String[] chapter) {
        this.chapter = chapter;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public long getGenreId() {
        return genreId;
    }

    public void setGenreId(long genreId) {
        this.genreId = genreId;
    }

    
}

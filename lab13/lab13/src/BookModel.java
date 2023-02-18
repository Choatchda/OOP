/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB203_80
 */
import java.util.*;
import java.io.*;
public class BookModel implements  Serializable{
    private Book book = new Book("", 0, "");
    private ArrayList books = new ArrayList();
    
    public BookModel(){
        books.add(this.book);
    }
    
    public void addBook(Book book){
        if(!books.contains(book)){
            books.add(book);
        }
    }

    public ArrayList getBooks() {
        return books;
    }

    public void setBooks(ArrayList books) {
        this.books = books;
    }
}

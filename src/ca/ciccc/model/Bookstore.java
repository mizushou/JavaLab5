package ca.ciccc.model;

import ca.ciccc.exception.InvalidArgumentException;
import ca.ciccc.exception.InvalidBookDateException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * This class represents Bookstore.<br>
 * It has attributes below.
 * <ul>
 * <li>books</li>
 * </ul>
 *
 * @author shouhei
 * @since 2018-04-24
 */
public class Bookstore {

    private ArrayList<Book> books;


    public Bookstore() {
        this.books = new ArrayList<>();
    }

    /**
     * Add Book into books
     *
     * @param first         first name
     * @param last          last name
     * @param title         title
     * @param yearPublished published year
     */
    public void addBook(Name first, Name last, String title, int yearPublished) {

        try {
            Book book = new Book(first, last, title, yearPublished);
            this.books.add(book);
        } catch (InvalidArgumentException e) {
            System.out.println(e.getMessage());
        } catch (InvalidBookDateException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {

        }

    }

    /**
     * Add Biography into books
     *
     * @param first         first name
     * @param last          last name
     * @param title         title
     * @param yearPublished published year
     * @param subject       subject
     */
    public void addBiography(Name first, Name last, String title, int yearPublished, Name subject) {
        try {
            Book biography = new Biography(first, last, title, yearPublished, subject);
            this.books.add(biography);
        } catch (InvalidArgumentException e) {
            System.out.println(e.getMessage());
        } catch (InvalidBookDateException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {

        }
    }

    /**
     * Display books before sorting  and after sorting.
     */
    public void displayBooks() {
        ArrayList<Book> copy = copyArrayList(getBooks());
        // Before sorting
        System.out.println("------Berore------");
        displayArrayList(copy);
        System.out.println();
        Collections.sort(copy);
        // After sorting
        System.out.println("------After------");
        displayArrayList(copy);
    }

    private ArrayList<Book> copyArrayList(ArrayList<Book> org) {
        ArrayList<Book> copy = new ArrayList<>();
        for (Book book : org) {
            copy.add(book);
        }
        return copy;
    }

    private void displayArrayList(ArrayList<Book> src) {
        Iterator<Book> it = src.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    /**
     * Getter of books
     *
     * @return books
     */
    public ArrayList<Book> getBooks() {
        return books;
    }

    /**
     * Setter of books
     *
     * @param books
     */
    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
}

package ca.ciccc.model;

import ca.ciccc.exception.InvalidArgumentException;
import ca.ciccc.exception.InvalidBookDateException;

/**
 * This class represents Book.<br>
 * It has attributes below.
 * <ul>
 * <li>first</li>
 * <li>last</li>
 * <li>title</li>
 * <li>yearPublished</li>
 * </ul>
 *
 * @author shouhei
 * @since 2018-04-24
 */
public class Book implements Comparable<Book> {

    private Name first;
    private Name last;
    private String title;
    private int yearPublished;

    /**
     * Default constructor.
     */
    public Book() {
    }

    /**
     * Constructs a new Book object by setting initial values in specified values.<br>
     *
     * @param first         first name
     * @param last          last name
     * @param title         title
     * @param yearPublished published year
     * @throws InvalidBookDateException
     * @throws InvalidArgumentException
     */
    public Book(Name first, Name last, String title, int yearPublished) throws InvalidBookDateException, InvalidArgumentException {
        setFirst(first);
        setLast(last);
        setTitle(title);
        setYearPublished(yearPublished);
    }

    /**
     * Getter of first
     *
     * @return first
     */
    final public Name getFirst() {
        return first;
    }

    /**
     * Setter of first
     *
     * @param first first name
     * @throws InvalidArgumentException
     */
    final public void setFirst(Name first) throws InvalidArgumentException {
        if (first == null || first.getName().equals("")) {
            throw new InvalidArgumentException("Input first name is null or empty");
        }
        this.first = first;
    }

    /**
     * Getter of last
     *
     * @return last
     */
    final public Name getLast() {
        return last;
    }

    /**
     * Setter of last
     *
     * @param last last name
     * @throws InvalidArgumentException
     */
    final public void setLast(Name last) throws InvalidArgumentException {
        if (last == null || last.getName().equals("")) {
            throw new InvalidArgumentException("Input last name is null or empty");
        }
        this.last = last;
    }

    /**
     * Getter of title
     *
     * @return title
     */
    final public String getTitle() {
        return title;
    }

    /**
     * Setter of title
     *
     * @param title title name
     * @throws InvalidArgumentException
     */
    final public void setTitle(String title) throws InvalidArgumentException {
        if (title == null || title.equals("")) {
            throw new InvalidArgumentException("Input title is null or empty");
        }
        this.title = title;
    }

    /**
     * Getter of yearPublished
     *
     * @return yearPublished
     */
    final public int getYearPublished() {
        return yearPublished;
    }

    /**
     * Setter of yearPublished
     *
     * @param yearPublished published year
     * @throws InvalidBookDateException
     */
    final public void setYearPublished(int yearPublished) throws InvalidBookDateException {
        if (yearPublished > 2017) {
            throw new InvalidBookDateException("Input published year is greater than 2017");
        }
        this.yearPublished = yearPublished;
    }

    /**
     * Compare by title and published year.
     *
     * @param o object
     * @return true if the given object represents a Book equivalent to this book, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (this == o) {
            return false;
        }
        if (!(o instanceof Book)) {
            return false;
        }
        Book book = (Book) o;
        if (this.getTitle().equals(book.getTitle()) && this.getYearPublished() == book.getYearPublished()) {
            return true;
        }
        return false;
    }

    /**
     * Returns a hash code for this book.
     *
     * @return a hash code value for this object
     */
    @Override
    public int hashCode() {
        int result = getTitle() != null ? getTitle().hashCode() : 0;
        result = 31 * result + getYearPublished();
        return result;
    }

    /**
     * Return this book's information[first, last, published year]
     *
     * @return this book's information
     */
    @Override
    public String toString() {
        return "Book class [first : " + getFirst() + "] [last : " + getLast() + "] [title : " + getTitle() + "] [yearPublished : " + getYearPublished() + "]";
    }

    /**
     * Compares two books by published year
     *
     * @param o Book
     * @return the value 0 if the argument book's published year is equal to this book's published year; a value less than 0 if this published year is more older than the argument's published year; and a value greater than 0 if this published year is more recent than the argument's published year.
     */
    @Override
    public int compareTo(Book o) {
        return this.getYearPublished() - o.getYearPublished();
    }
}

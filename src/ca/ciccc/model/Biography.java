package ca.ciccc.model;

import ca.ciccc.exception.InvalidArgumentException;
import ca.ciccc.exception.InvalidBookDateException;

/**
 * This class represents Biography. It extends Book.<br>
 * It has attributes below.
 * <ul>
 * <li>first</li>
 * <li>last</li>
 * <li>title</li>
 * <li>yearPublished</li>
 * <li>subject</li>
 * </ul>
 *
 * @author shouhei
 * @since 2018-04-24
 */
final public class Biography extends Book {

    private Name subject;

    /**
     * Default constructor.
     */
    public Biography() {

    }

    /**
     * Constructs a new Biography object by setting initial values in specified values.<br>
     *
     * @param first         first name
     * @param last          last name
     * @param title         title
     * @param yearPublished published year
     * @param subject       subject
     * @throws InvalidBookDateException
     * @throws InvalidArgumentException
     */
    public Biography(Name first, Name last, String title, int yearPublished, Name subject) throws InvalidBookDateException, InvalidArgumentException {
        super(first, last, title, yearPublished);
        this.subject = subject;
    }

    /**
     * Compare by subject.
     *
     * @param o object
     * @return true if the given object represents a Biography equivalent to this Biography, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (this == o) {
            return false;
        }
        if (!(o instanceof Biography)) {
            return false;
        }
        Biography biography = (Biography) o;
        if (this.getSubject().equals(biography.getSubject())) {
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
        int result = super.hashCode();
        result = 31 * result + subject.hashCode();
        return result;
    }

    /**
     * Getter of subject
     *
     * @return subject
     */
    public Name getSubject() {
        return subject;
    }

    /**
     * Setter of subject
     *
     * @param subject subject
     */
    public void setSubject(Name subject) {
        this.subject = subject;
    }
}

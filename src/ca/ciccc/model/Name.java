package ca.ciccc.model;

/**
 * This class represents Name.<br>
 * It has attributes below.
 * <ul>
 * <li>name</li>
 * </ul>
 *
 * @author shouhei
 * @since 2018-04-24
 */
public class Name {

    String name;


    /**
     * Default constructor.
     *
     * @param name
     */
    public Name(String name) {
        setName(name);
    }

    /**
     * Getter of name
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter of name
     *
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Compare by name.
     *
     * @param o object
     * @return true if the given object represents a Name equivalent to this name, false otherwise
     */
    @Override
    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }
        if (this == o) {
            return false;
        }
        if (!(o instanceof Name)) {
            return false;
        }
        Name name = (Name) o;
        if (this.getName().equals(name.getName())) {
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
        return getName() != null ? getName().hashCode() : 0;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

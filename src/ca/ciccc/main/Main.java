package ca.ciccc.main;

import ca.ciccc.model.Bookstore;
import ca.ciccc.model.Name;

public class Main {

    public static void main(String[] args) {

        Bookstore bookstore = new Bookstore();

        bookstore.addBook(new Name("Shouhei"), new Name("Mizuno"), "AAA", 2020);
        bookstore.addBook(new Name(""), new Name("Hayama"), "BBB", 1998);
        bookstore.addBook(new Name("Kunihiro"), new Name(""), "CCC", 2006);
        bookstore.addBook(new Name("Ayaha"), new Name("Hujii"), "", 1985);
        System.out.println();

        Bookstore bookstore2 = new Bookstore();

        bookstore2.addBook(new Name("Shouhei"), new Name("Mizuno"), "AAA", 2016);
        bookstore2.addBook(new Name("Kaoru"), new Name("Hayama"), "BBB", 1998);
        bookstore2.addBook(new Name("Kunihiro"), new Name("Ichikawa"), "CCC", 2006);
        bookstore2.addBook(new Name("Ayaha"), new Name("Hujii"), "DDD", 1985);

        bookstore2.displayBooks();

        Bookstore bookstore3 = new Bookstore();

        bookstore3.addBook(new Name("Shouhei"), new Name("Mizuno"), "AAA", 2016);
        bookstore3.addBook(new Name("Kaoru"), new Name("Hyama"), "AAA", 2016);

        System.out.println();
        System.out.println("equals test");
        System.out.println(bookstore3.getBooks().get(0).equals(bookstore3.getBooks().get(1)));

        bookstore3.addBook(new Name("Shouhei"), new Name("Mizuno"), "AAA", 2016);
        bookstore3.addBook(new Name("Kaoru"), new Name("Hyama"), "AAA", 2015);

        System.out.println();
        System.out.println("equals test");
        System.out.println(bookstore3.getBooks().get(2).equals(bookstore3.getBooks().get(3)));

        Bookstore bookstore4 = new Bookstore();
        bookstore4.addBiography(new Name("Shouhei"), new Name("Mizuno"), "AAA", 2016, new Name("animal"));
        bookstore4.addBiography(new Name("Kaoru"), new Name("Hayama"), "BBB", 1902, new Name("animal"));

        System.out.println();
        System.out.println("equals test");
        System.out.println(bookstore4.getBooks().get(0).equals(bookstore4.getBooks().get(1)));

        bookstore4.addBiography(new Name("Shouhei"), new Name("Mizuno"), "AAA", 2016, new Name("animal"));
        bookstore4.addBiography(new Name("Shouhei"), new Name("Mizuno"), "AAA", 2016, new Name("nature"));

        System.out.println();
        System.out.println("equals test");
        System.out.println(bookstore4.getBooks().get(2).equals(bookstore4.getBooks().get(3)));

    }
}

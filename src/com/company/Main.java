package com.company;

public class Main
{

    public static void main(String[] args)
    {
        Bookshelf bookshelf = new Bookshelf(125);

        System.out.println("The bookshelf contains " + bookshelf.bookCount + " books.");

        Bookshelf bookshelf2 = new Bookshelf(50);

        System.out.println("The bookshelf contains " + bookshelf2.bookCount + " books.");
    }
}

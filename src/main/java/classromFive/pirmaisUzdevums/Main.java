package classromFive.pirmaisUzdevums;

import classromFive.encapsulation.Weather;

public class Main {
    public static void main(String[] args) {
        Weather weather = new Weather();
        Author JKRowling = new Author("JK Rowling", "JK@gmail.com",'F');
        Author Rainis = new Author("Rainis", "Rainis@gmali.com", 'F');

        Cena cena = new Cena(9.99,'€');
        Book bookOne = new Book("Harry Potter", JKRowling, new Cena(15.99,'$'));
        Book bookTwo = new Book("Cits nosaukums", Rainis, cena);

        bookTwo.price.discount(30);
        System.out.println(bookTwo.toString());
        System.out.println(bookOne.toString());



    }
}

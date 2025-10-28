//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import Enum.*;
import Interfaces.Purchasable;
import classes.DigitalMagazine;
import classes.EBook;

import java.time.LocalDate;
import java.util.*;
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LocalDate a1 = LocalDate.of(2025,2,10);
        DigitalMagazine magazine = new DigitalMagazine(1,"Tokyo", 10, 0,1,a1, "Fashion");
        EBook ebook1 = new EBook(
                1,                              // id
                "The Secrets of the Universe",  // name
                19.99,                          // basePrice
                0.15,                           // currentDiscount (15% off)
                Genre.FICTION,                   // genre
                350,                            // pageCount
                true                            // isIllustrated
        );

        magazine.setBasePrice(10);
        ebook1.setBasePrice(20);
        HashSet<Purchasable> purchasables = new HashSet<>();
        purchasables.add(ebook1);
        purchasables.add(magazine);
        for (Purchasable purchasable : purchasables) {
            System.out.println(purchasable.calculatePrice());
            System.out.println(purchasable.getPriceWithtTax());
            System.out.println(purchasable.getClass().getName());
        }


    }
}
// Name: Isabella Livingston
// Date: 17 January 2023
// Description:


import java.util.ArrayList;
import java.util.Collections;

// Importing Assets
public class Main {
    public static void main(String[] args) {

        Rating r1 = new Rating();
        System.out.println("r1: " + r1);
        r1.addRating(5);
        System.out.println("r1: " + r1);
        r1.addRating(3.5);
        System.out.println("r1: " + r1);

        Rating r2 = new Rating(40, 10);

        System.out.println("r2: " + r2);
        Rating r3 = new Rating(12.75, 3);
        System.out.println("r3: " + r3);
        ArrayList<Rating> ratings = new ArrayList<>();
        ratings.add(r1);
        ratings.add(r2);
        ratings.add(r3);

        System.out.println(ratings);
        Collections.sort(ratings);


        /**
        for (Rating r: ratings) {
            System.out.println(r);
        }

         **/


    }
}
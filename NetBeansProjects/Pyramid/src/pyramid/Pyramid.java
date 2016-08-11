//Pyramid
//6/7/16
//WY
package pyramid;

import java.util.Scanner;

public class Pyramid {

    public static void main(String[] args) {
        String scan;
        int random = 0;
        int random1 = 0;
        Scanner read = new Scanner(System.in);
        System.out.println("Enter Size:");
        scan = read.next();
        int size = Integer.parseInt(scan);
        for (int i = 1; i < size + 1; i++) {
            if (i == 1) {
                random = size - 1;
                System.out.print(" ");
                for (int x = 0; x < random; x++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int x = 0; x < random; x++) {
                    System.out.print(" ");
                }
                System.out.println("");
            } else {
                if (i % 2 == 0) {
                    System.out.print(" ");
                    random = ((size * 2) - (i * 2)) / 2;
                    for (int x = 0; x < random; x++) {
                        System.out.print(" ");
                    }
                    do {
                        System.out.print("*" + " ");
                        random1 = random1 + 1;
                    } while (random1 < i);
                    for (int x = 0; x < (random - 1); x++) {
                        System.out.print(" ");
                    }
                    System.out.println("");
                } else {
                    random = (size - i);
                    for (int x = 0; x < random - 1; x++) {
                        System.out.print(" ");
                    }
                    if (i < size) {
                        System.out.print(" ");
                    }
                    do {
                        System.out.print(" " + "*");
                        random1 = random1 + 1;
                    } while (random1 != i);
                    for (int x = 0; x < random - 1; x++) {
                        System.out.print("");
                    }
                    System.out.println();
                }
                random = 0;
                random1 = 0;
            }
        }
    }
}

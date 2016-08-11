package triangle;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        String scan;
        int size;
        int counter = 0;
        int orientation;
        int random1 = 0;
        String random;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Size:");
        scan = input.next();
        size = Integer.parseInt(scan);
        Scanner read = new Scanner(System.in);
        System.out.println("Enter Orientation:");
        random = read.next();
        orientation = Integer.parseInt(random);
        switch (orientation) {
            case 1:
                for (int y = 0; y < size + 1; y++) {
                    random1 = size * 2 - y * 2;
                    for (int i = 0; i < random1; i++) {
                        System.out.print(" ");
                    }
                    for (int x = 0; x < y; x++) {
                        System.out.print("*" + " ");
                    }
                    System.out.println(" ");
                }
                break;

            case 2:
                for (int y = 0; y < size; y++) {
                    counter = counter + 1;
                    for (int x = 0; x < counter; x++) {
                        System.out.print("*" + " ");
                    }
                    System.out.println(" ");
                }
                break;

            case 3:
                counter = size + 1;
                for (int y = 0; y < size; y++) {
                    counter = counter - 1;
                    for (int x = 0; x < counter; x++) {
                        System.out.print("*" + " ");
                    }
                    System.out.println(" ");
                }
                break;
            case 4:
                random1 = size;
                for (int y = size; y > 0; y--) {
                    random1 = random1 - 1;
                    if (y == size) {
                        for (int x = 0; x < y - 1; x++) {
                            System.out.print("*" + " ");
                        }
                        System.out.print("*");
                    } else {
                        for (int z = (size * 2 - 1) - (y * 2); z > 0; z--) {
                            System.out.print(" ");
                        }
                        for (int i = random1; i >= 0; i--) {
                            System.out.print(" " + "*");
                        }
                    }
                    System.out.println("");
                }
                break;
        }
    }
}

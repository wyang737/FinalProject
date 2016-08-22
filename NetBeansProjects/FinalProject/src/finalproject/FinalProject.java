package finalproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class FinalProject {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner read = new Scanner(new File("/Users/Winston/Downloads/worldcities.txt"));
        ArrayList<String> list = new ArrayList<String>();
        while (read.hasNextLine()) {
            list.add(read.nextLine( ));
        }
        read.close();
        System.out.println(list);
    }
}
    
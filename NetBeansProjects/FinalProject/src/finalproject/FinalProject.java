package finalproject;

import java.io.BufferedReader;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;
import java.io.IOException;

public class FinalProject {

    public static void searchState(List<String> lst) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a state to search for: ");
        String input = read.next();
        for (int i = 0; i < Integer.parseInt(lst.get(0)); i++) {
            int x = (i + 1) * 6 - 4;
            String buffer = lst.get(x).replace(input.trim(), "");
            String output = buffer.replace(",", "");
            if (lst.get(x) != buffer){
            System.out.println(output);
            }
           /* if (lst.get(x).toLowerCase().contains(input)) {
                String buffer = lst.get(x).replace(input, "");
                String output = buffer.replace(",", "");
                System.out.println(output);
            } */
        }
    }

    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        FileReader input = new FileReader("/Users/Winston/Downloads/worldcities.txt");
        BufferedReader read = new BufferedReader(input);
        String line;
        while ((line = read.readLine()) != null) {
            list.add(line);
            list.add("\n");
        }
        System.out.println(list);
        searchState(list);
    }
}

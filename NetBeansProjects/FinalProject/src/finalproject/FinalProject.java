package finalproject;

import java.io.BufferedReader;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;

public class FinalProject {

    public static void searchState(List<String> lst) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a state to search for: ");
        String input = read.nextLine();
        System.out.println("");
        System.out.println("Cities in " + input + " :");
        for (int i = 0; i < Integer.parseInt(lst.get(0)); i++) {
            int x = (i + 1) * 6 - 4;
            String buffer = lst.get(x).replace(input.trim(), "");
            String output = buffer.replace(",", "");
            if (lst.get(x) != buffer) {
                System.out.println(output);
                System.out.println("ID number for " + output + ": " + i);
            }
        }
    }

    public static void searchCity(List<String> lst) {
        Scanner read = new Scanner(System.in);
        System.out.println("");
        System.out.println("Enter a city to search for: ");
        String input = read.next();
        for (int i = 0; i < Integer.parseInt(lst.get(0)); i++) {
            int x = (i + 1) * 6 - 4;
            if (lst.get(x).contains(input)) {
                System.out.println("ID number for " + input + " :" + i);
            }
        }
    }

    public static void findDistance(List<String> lst) {
        Scanner read = new Scanner(System.in);
        System.out.println("");
        System.out.println("Enter an ID (0-10) to remember: ");
        String input = read.next();
        int ID = Integer.parseInt(input);
        for (int i = 0; i < Integer.parseInt(lst.get(0)); i++) {
            if (i == ID) {
                System.out.println("Currently selected city: " + lst.get((i + 1) * 6 - 4));
            }
        }
        Scanner read1 = new Scanner(System.in);
        System.out.println("");
        System.out.println("Enter number of closest cities desired: 1-10");
        String input1 = read.next();
        List<String> buffer = new ArrayList<>(lst);
        for (int i = 62; i > 51; i--) {
            buffer.remove(62 - (62 - i) * 6);
        }
        buffer.removeAll(Collections.singleton("\n"));
        buffer.remove(0);
        List<Double> coordinates = new ArrayList<>();
        for (String s : buffer) {
            coordinates.add(Double.valueOf(s));
        }
        Double lat1 = coordinates.get(ID * 4 - ID * 2);
        Double long1 = coordinates.get((ID * 4 - ID * 2) + 1);
        List<Double> distances = new ArrayList<>();
        for (int y = 0; y < 11; y++) {
            Double lat2 = (double) y * 3 - y * 2;
            Double long2 = (double) (y * 3 - y * 2) + 1;
            // below is not my algorithm
            double theta = long1 - long2;
            double dist = Math.sin(Math.toRadians(lat1)) * Math.sin(Math.toRadians(lat2)) + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) * Math.cos(Math.toRadians(theta));
            dist = Math.acos(dist);
            dist = Math.toDegrees(dist);
            dist = dist * 60 * 1.1515;
            // above is not my algorithm
            distances.add(dist);
        }
        List<Integer> index = new ArrayList<>();
        if (Integer.parseInt(input1) == 1) {
            System.out.println("Closest City: ");
        } else {
            System.out.println("Closest Cities: ");
        }
        for (int z = 0; z < Integer.parseInt(input1); z++) {
            Double temp = distances.get(0);
            for (int a = 0; a < distances.size(); a++) {
                if (temp > distances.get(a)) {
                    temp = distances.get(a);
                }
                if (a == distances.size() - 1) {
                    index.add(distances.indexOf(temp));
                    distances.remove(temp);
                }
            }
            System.out.print(lst.get(index.get(0) * 6 + 2));
            System.out.println("");
            for (int b = 0; b < 6; b++) {
                lst.remove(index.get(0) * 6 + 2);
            }
            index.remove(0);
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
        searchCity(list);
        findDistance(list);
    }
}

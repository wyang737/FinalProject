package finalproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.IOException;
public class FinalProject {

    public static void main(String[] args) throws IOException {
      ArrayList<String> list = new ArrayList<String>();
      FileReader input = new FileReader("/Users/Winston/Downloads/worldcities.txt");
      BufferedReader read = new BufferedReader(input);
      String buffer;
      while ((buffer = read.readLine()) != null){
          list.add(read.readLine());
          list.add("\n");
      }
      System.out.println(list);
    }
}
    
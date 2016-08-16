package finalproject;

import java.io.File;
import java.util.Scanner;

public class FinalProject {

    public static void main(String[] args) {
        if (0 < args.length) {
            String filename = args[0];
            File file = new File(filename);
        }
    }
}

//Reverse String
//7/6/16
//WY
package reverse.string;

import java.util.Scanner;
/*import java.util.ArrayList;
import java.util.List;*/

public class ReverseString {
    
    public static void main(String[] args) {
        String input;
        String output = "";
        Scanner read = new Scanner(System.in);
        System.out.println("Enter String: ");
        input = read.nextLine();
        for (int counter = input.length() - 1; counter >= 0; counter--) {
            output = output + input.charAt(counter);
        }
        System.out.println("Reversed String: " + output);
        
       /* Scanner read2 = new Scanner(System.in);
        System.out.println("Please input: ");
        
        ArrayList<String> records = new ArrayList<String>();
        while (true) {
            String buffer = read2.nextLine();
            
            if (buffer.equals("stop")) {
                break ;
            }
            
            records.add(buffer);
        }
        
        System.out.println("Print the results: ");
        for (String r: records) {
            System.out.println(r);
        }*/
    }

}

/*
 * Michael Botros
 * Oct 18, 2019
 * This program prompts the user for the name of five of their friends using an array and a loop and displays a few of their names
 */

package arrayremix2;
import java.util.Scanner;
/**
 *
 * @author mibot3117
 */
public class ArrayRemix2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creating a new scanner object
        Scanner keyedInput = new Scanner (System.in);
        
        //creating an array for friends that holds five names
        String [ ] friends = new String [5];
        
        //using a for loop to prompt and recieve five strings into the friends array
        System.out.println("Enter the names of five friends:");
        for (int i = 0; i <= 4; i = i + 1)
        {
            friends[i] = keyedInput.nextLine();
        }
        
        //outputting the desired names
        System.out.println("The second, third and fourth names listed were:");
        System.out.println("Second: " + friends[1]);
        System.out.println("Third: " + friends[2]);  
        System.out.println("Fourth: " + friends[3]);  
    }
    
}

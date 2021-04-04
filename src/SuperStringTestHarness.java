/*Lab purpose: The class named SuperStringTestHarness is to test two static methods of SuperString.
* We will test method named printFiveWords(String fiveWords) and method named holdData(String str,int length,char keyChar)
* Author:Dan Zhao
* Date: Nov 26th 2020
* Time: Nov 26th 2020 11:24pm
* */
//import the util Scanner and InputMismatchException class.
import java.util.InputMismatchException;
import java.util.Scanner;
public class SuperStringTestHarness {
    public static void main(String[] args) {

        //test the printFiveWords method.
        Scanner in = new Scanner(System.in);
        System.out.println("Please input the passing String for the printFiveWords method of class SuperString.");

        SuperString.printFiveWords(in.nextLine());

        //test the holdDate method.
        try {
            Scanner in2 = new Scanner(System.in);
            System.out.println("Please input a String a int and a character in separate line for the holdData method of class SuperString");
            String[] dataArray = SuperString.holdData(in2.nextLine(), in2.nextInt(), in2.next().charAt(0)).dataArray();

            for (int i = 0; i < dataArray.length; i++) {
                System.out.println(dataArray[i]);
            }
        }
        catch (InputMismatchException e){
            System.out.println("Please input right type arguments");

        }



    }
}

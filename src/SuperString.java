/*Lab purpose: The class named SuperString represents a SuperString object.
 * The class has no instance variables,setters,getters and constructor.
 * The class has two static methods,the first static method named printFiveWords is will
 * take one String argument made up of 5 possible words
 * from mylist of 10 words that I make up. that range from 2-4 characters in length.
 * These 5 words are concatenated with no spaces form the argument for the method.
 * The purpose of the method is to look through the single string argument and
 * identify the five words based upon the list of 10 possible words and print out
 * each word found on a separate line.
 * the second static method named holdData is to break the string up into substrings of
 * a length equal to the int argument (which must not be greater then the length of the
 * String argument) and return the result to the caller a HoldingInformation Object  of holding the information to be returned.
 *
 * Author: Dan Zhao
 * Date: Nov 26th 2020
 * Time: Nov 26th 2020 9:24pm
 * */

//import the String class
import java.lang.String;
public class SuperString {
    /*First static method is for look through the single string argument and
    /identify the five words based upon the list of 10 possible words and print out
    /each word found on a separate line.*/

    public static void printFiveWords(String fiveWords) {
        //This is my 10 words list.
        String[] myList = {"For", "This", "Dog", "Cat", "Mean", "Yes", "Kind", "Hot", "Wave", "Low"};
        //convert all items in array to upeer case and copy them to myListCopy
        String[] myListCopy = new String[10];
        for (int i = 0; i < 10; i++) {
            myListCopy[i] = myList[i].toUpperCase();
        }
        //create a StringBuilder buffer.
        StringBuilder buffer = new StringBuilder(fiveWords.toUpperCase());
        //create a String array of the 5 words to print
        String[] printList = new String[5];
        //find the word which is a substring in mylist and store it in the printList array.
        for (int j=0;j<5;j++) {

            for (int i = 0; i < 10; i++) {

                if (buffer.indexOf(myListCopy[i]) == 0) {

                    buffer.delete(0, myList[i].length());
                    printList[j]=myList[i];
                    break;
                }
            }

        }
        //check if the String carry same word.
        boolean sameWord = true;

        for(int i=0;i<4;i++){
            for(int j=i+1;j<5;j++){
                if(printList[i]==printList[j]){
                    sameWord=false;
                }
            }

        }
        /*if the buffer dosent's has word anymore and the printlist has 5 word
         and there's no same word in the passing string,print the printList,
        otherwise, print input is not valid.
         */

        if(buffer.length()==0&&printList[4]!=null&&sameWord){


            for (int i =0;i<5;i++){
                System.out.println(printList[i]);
            }
        }
        else{

            System.out.println("You input wrong String.");
        }

    }
    // the second static method which returns HoldingInformation object to hold the data



    public static HoldingInformation holdData(String str,int length,char keyChar){

        HoldingInformation container = new HoldingInformation(str,length,keyChar);
        return container;
    }



}


/*lab purpose: this class named HoldingInformation is to store data
* the class has three states named passingString, substringLength and keyChar
* the class has a constructor with three arguments.
* the class has a method named dataArray return a string array to store Strings.
* the method breaks the passing string up into substrings of a length equal to the
* int argument and each substring will begin at the location of the occurrence of
* the char that is passed in as the third argument.we will store all the substring
* in the returning String array.
* Author: Dan Zhao
* *Date: Nov 26th 2020
* Time: Nov 26th 2020 11:44pm
* */
public class HoldingInformation {
    //three states
    private String passingString;
    private int substringLength;
    private char keyChar;

    //constructor with three arguments
    public HoldingInformation(String passingStr,int lengthOfsubstring,char charOfKey){
        passingString=passingStr;
        substringLength=lengthOfsubstring;
        keyChar=charOfKey;
    }
    /* the method breaks the passing string up into substrings of a length equal to the
    * int argument and each substring will begin at the location of the occurrence of
    * the char that is passed in as the third argument.we will store all the substring
    * in the returning String array.*/

    public String[] dataArray(){
        //get the returning array's length
        int newArraylength =0;
        //convert string to a char array
        char [] charArray = passingString.toLowerCase().toCharArray();
        for (int i =0;i<=passingString.length()-substringLength;i++){
            if(charArray[i]==Character.toLowerCase(keyChar)) {
                newArraylength++;

            }
        }
        //create the returning array.
        String []container1= new String[newArraylength];
        //store all substring to the returning array.
        int containerIndex=0;
        for (int i =0;i<=passingString.length()-substringLength;i++){
            if(charArray[i]==Character.toLowerCase(keyChar)) {
                container1[containerIndex]= new String(charArray,i,substringLength);
                container1[containerIndex]=container1[containerIndex].toUpperCase();
                containerIndex++;
            }
        }

        /*if the substring's length is bigger than the string's length, then print the invalid input,
        otherwise, if the returning array's length is 0,then there's no key char in the passing string*/
        if(passingString.length()<substringLength){
            System.out.println("Please input valid String and int.");
        }else{
            if (newArraylength==0){
                System.out.println("There is no passing character in the passing string");
            }
        }

       return container1;
    }



}

package com.example.stringReverse;
//Without any built-in functions
public class FirstWay {
    public static char[] reverseString(String string){
        int length = string.length();
        char[] arr = new char[length];
        int j =0;
        for(int i= length-1; i>=0;i--){
            arr[j] = string.charAt(i);
            j++;
        }
        return arr;
    }
    public static void main(String[] args){
        for (char s : FirstWay.reverseString("I am a string")) {
            System.out.print(s);
        }

    }
}

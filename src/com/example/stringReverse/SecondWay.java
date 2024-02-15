package com.example.stringReverse;
//With string builder
public class SecondWay {

    public static StringBuilder reverseString(String string){
        StringBuilder stringBuilder = new StringBuilder(string);
        stringBuilder.reverse();
        return stringBuilder;
    }
    public static void main(String[] args){
        System.out.println(SecondWay.reverseString("I am a string"));
    }
}

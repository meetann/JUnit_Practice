package com.stackroute.junitdemo;

public class StringConverter {
    public String concatAndToUpperCase(String input1, String input2){
        String concatedString = input1.concat(input2);
        return concatedString.toUpperCase();
    }

    public String convertToUpperCase(String input1){
        if(input1==null){
            return "Please provide normal value!";
        }
        return input1.toUpperCase();

    }


}

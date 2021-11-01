package com.example.demo;

import java.util.ArrayList;
import java.util.List;



public class Validator {

    static Boolean Validator(String input)
    {
        ArrayList<String> openingBracket = new ArrayList<>();

        for(int i = 0; i < input.length(); i++)
        {
            if(input.charAt(i) == '(') {
                openingBracket.add(Character.toString(input.charAt(i)));
            }

            else if(input.charAt(i) == ')') {

                if(openingBracket.size() != 0 && openingBracket.get(openingBracket.size()-1).equals("(") && input.charAt(i) == ')')
                {
                    openingBracket.remove(openingBracket.size()-1);
                }
                else
                {
                    return false;
                }
            }

        }

        return openingBracket.size() == 0;
    }
}

package com.nuovonet.rest;

import com.fasterxml.jackson.databind.PropertyNamingStrategy.PropertyNamingStrategyBase;

public class MyPascalCaseStrategy extends PropertyNamingStrategyBase
{
    /**
     * Converts camelCase to PascalCase
     * 
     * For example, "userName" would be converted to
     * "UserName".
     *
     * @param input formatted as camelCase string
     * @return input converted to PascalCase format
     */
    @Override
    public String translate(String input) {
//    	System.out.println(input);
        if (input == null || input.length() == 0){
            return input; // garbage in, garbage out
        }
        // Replace first lower-case letter with upper-case equivalent
        char c = input.charAt(0);
        if (Character.isUpperCase(c)) {
        	return input;
        }
        char uc = Character.toUpperCase(c);
        if (c == uc) {
            return input;
        }
        StringBuilder sb = new StringBuilder(input);
        sb.setCharAt(0, uc);
        return sb.toString();
    }
}
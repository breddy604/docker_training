package com.cisco.training.docker.code;

public class Contest {

    public String decimalToBinay(int n){
        
        String toReturn = "";
        while(true){
            int reminder = n%2;
            toReturn = reminder + toReturn;
            n = n/2;
            if(n == 0){
                break;
            }
        }
        
        return toReturn;
    }
}

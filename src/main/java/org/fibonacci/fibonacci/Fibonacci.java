package org.fibonacci.fibonacci;

public class Fibonacci {

    public int compute(int value){
        if(value<0){
            throw new RuntimeException("Error: value negative");
        }
        int result=0;
        if(value==1){
            result=1;
        }else{
            int minusTwo=0;
            int minusOne=1;
            for(int i=1; i<value; i++){
                result=minusOne+minusTwo;
                minusTwo=minusOne;
                minusOne=result;
            }
        }
        return result;
    }
}

package org.fibonacci.fibonacci;
/**
 * Class providing a method that computes the number
 * of the Fibonacci series given an integer
 *
 * @author Carmen Gonzalez Ortega
 */
public class Fibonacci {

    public int compute(int value){
        if(value<0){
            throw new RuntimeException("Error: negative value");
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

package Calcul;

import java.util.Arrays;

public class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }//Somme

    public int minus(int a, int b) {
        return a - b;
    } //soustraction

    public int divide(int a, int b) {
        return a / b;
    }// Division

    public int multiply(int a, int b) {
        return a * b ;
    } //Multiplication

    public int min(int a, int b){
        return Math.min(a,b);
    } //minimun entre a et b

    public int max(int a, int b){
        return Math.max(a,b);
    } //maximum entre a et b
    public int minElement(int[] list)//Minimum d'element d'un tableau
    {
        if(list.length>=0)
            Arrays.sort(list);
        return  list[0];

    }
    public int maxElement(int[]list)//Maximum d'element d'un tableau
    {
        if(list.length>0)
            Arrays.sort(list);
        return  list[list.length-1];
    }
}

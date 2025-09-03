package com.company.java003_ex;
import java.util.Scanner;
public class CastingEx001_1{
    public static void main(String[] args){

        int num1, num2;


        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자입력1>"); num1 = scanner.nextInt();
        System.out.print("숫자입력2>"); num2 = scanner.nextInt();

        double result = 0.00;
        		
        result = (double) num1 / num2;

        System.out.printf("%d / %d = %.2f ",  num1, num2, result);
        
    }

}
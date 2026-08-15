package org.example;

import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Write any number");
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("Given Number is Even");
        }
        else{
            System.out.println("Given Number is Odd");
        }

    }
}

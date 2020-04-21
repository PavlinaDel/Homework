package domashnaa;

import java.util.Scanner;


public class Zadacha1 {
    public Zadacha1(){

    }
    public static void main (String[] args) {
        perimeter();
        face();

    }
    public static void perimeter(){
        System.out.println ("Enter a value for a: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println ("Enter a value for b: ");
        new Scanner(System.in);
        int b = scan.nextInt();
        int P= 2*(a+b);
        System.out.println("The perimeter of the rectangle is: " + P);

    }
    public static void face(){
        System.out.println("Enter a value for a");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println ("Enter a value for b: ");
        new Scanner(System.in);
        int b = scan.nextInt();
        int S = a*b;
        System.out.println ("The face of the rectangle is:" + S);
    }
}

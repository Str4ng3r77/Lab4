package Problema4;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args){
        probl4();
    }
    private static void probl4(){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Introduceti latimea: ");
        int w= scanner.nextInt();
        System.out.print("Introduceti lungimea: ");
        int l= scanner.nextInt();
        Rectangle r=new Rectangle(w,l);
        System.out.print("Aria dreptunghiului este: ");
        System.out.println(r.aria());
        System.out.print("Perimetrul dreptunghiului este: ");
        System.out.println(r.perimetru());
    }

}

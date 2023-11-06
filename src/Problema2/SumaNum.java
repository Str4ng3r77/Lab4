package Problema2;

import java.util.Scanner;
public class SumaNum {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Introduceti numarul: ");
        int n=scanner.nextInt();
        int sum=0;
        while(n!=0){
            sum=sum+n%10;
            n=n/10;
        }
        System.out.println("Suma cifrelor numarului este: "+ sum);
    }
}

package Problema1;
import java.util.Scanner;
public class Mijloccuv {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Introduceti cuvantul: ");
        String cuvant = scanner.next();
        int n=cuvant.length();
        if(n%2==0){
            String rez= cuvant.substring(n/2-1,n/2+1);
            System.out.println(rez);
        }
        if(n%2==1){
            char caracter = cuvant.charAt(n/2);
            System.out.println(caracter);
        }
    }
}
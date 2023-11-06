package Problema5;

import java.util.Arrays;

public class test3 {
    public static void main(String[] args){
        probl5();
    }
    public static void probl5(){
        Person pers1 = new Person();
        Person pers2 =new Person();
        pers1.setName("Sergiu");
        pers1.setEmail("@yahoo.com");

        Student student = new Student();
        int[] aux = {10, 9, 5, 7};
        student.setGrades(aux);
        pers2.setName("Malin");
        pers2.setEmail("@hotmail.com");

        Profesor prof = new Profesor();
        String[] courses = {"Romana", "Matematica","Informatica"};
        prof.setCourses(courses);

        System.out.print("Emailul studentului este: ");
        System.out.println(pers1.getName()+pers1.getEmail());
        System.out.println("Notele studentului sunt: "+Arrays.toString(student.getGrades()));
        System.out.println("Emailul profesorului este: "+pers2.getName()+pers2.getEmail());
        System.out.println("Materiile pe care le preda profesorul sunt: "+Arrays.toString(prof.getCourses()));
    }
}

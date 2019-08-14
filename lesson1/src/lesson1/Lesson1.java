/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson1;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author trantathoang
 */
public class Lesson1 {

    private static double x;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        double a  = 3 ;//undefined
//        double b ;
//        double c ;
//        String e = "Abc" ;
//        //+,-,*,/,%
//        boolean f = true ;
//        double x ;
//        b = 2;
//        c = a + b ;
//        //a*x + b = 0;
//        x=-b/a;
//        
//        System.out.println(e);
//        System.out.println(x);
//        double  a = 1;
//        double   b = 2;
//        String p ="le duc thang";
//        
//        double c ;
//        c = a%b ;
//        
//        //System.out.println(a+p) ;
//        Scanner sc = new Scanner(System.in);
//        
//        int z;
//        System.out.println("Nhap vao gia tri cua z:");
//        z= sc.nextInt();
//        System.out.println("Gia tri cua z la:"+z);
        Scanner ka = new Scanner(System.in);

        double h;
        double t;
        double e;
        double k;

        System.out.println("Nhap vao gia tri cua h:");
        h = ka.nextDouble();

        System.out.println("Nhap vao gia tri cua t :");
        t = ka.nextDouble();

        System.out.println("Nhap vao gia tri cua e :");
        e = ka.nextDouble();

        System.out.println("Nhap vao gia tri cua k :");
        k = ka.nextDouble();
        x=(h+t+e)/k;
        System.out.println("x=(h+t+e)/k");
        System.out.println("Gia tri cua x la:"+x);

    }

}

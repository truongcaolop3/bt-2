/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Bt2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a ,b ,c;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập a");
        a = sc.nextDouble();
        System.out.println("nhập b");
        b = sc.nextDouble();
        System.out.println("nhập c");
        c = sc.nextDouble();
        
        if (a > b){
            System.out.println("The greatest: " + a);
        }else if ( b > c ){
            System.out.println("The greatest:" + b);
        }else System.out.println("The greatest:" + c);
        sc.close();
    }
}

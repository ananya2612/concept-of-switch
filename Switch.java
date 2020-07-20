/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Switch;

import java.util.Scanner;

/**
 *
 * @author ananya jajala
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int choice;
        System.out.println("Pick one: hi\t2. Hey\t3.hello\t");
        Scanner s=new Scanner(System.in);
        choice = s.nextInt();
        switch(choice)
        {
            case 1 : System.out.println("You Said Hi");
                   break;
            case 2 : System.out.println("You Said Hey");
                   break;
            case 3 : System.out.println("You Said Hello");
                   break;    
            default : System.out.println("Invalid choice.");
        }
    }   
}
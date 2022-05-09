/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hoang Do Gia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Manager m= new Manager();
    
        System.out.print("Enter string: ");
        String input = m.checkInputString();
        System.out.println(m.printReverse(input));
    }

}

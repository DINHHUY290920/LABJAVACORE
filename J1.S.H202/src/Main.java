
import java.util.Scanner;

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
    //in ngược lại các ký tự vừa nhập, chứ ý giải thích hàm có tên printReverse thì phải print ko được return
    public static void printReverse(String str){
        String reverse = "";
        for (int i = str.length()-1; i >=0; i--) {
            reverse = reverse+str.charAt(i);
        }
        System.out.println(reverse);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter string:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();
        if (!str.isEmpty()) {
            printReverse(str);
        }
                
    }
    
}

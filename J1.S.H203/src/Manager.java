
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
public class Manager {

    private Scanner sc = new Scanner(System.in);
    // cái này check input vào phải là chữ cái, nên hiểu hàm này đi, cái này lúc nào chả phải dùng
    public String checkInputString() {
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty.");
                System.out.print("Try again: ");
            } else {
                return result;
            }
        }
    }
    //In dảo ngược lại các cụm từ vừa nhập, chú ý split là tách chuỗi vừa nhập thành các chuỗi nhỏ, nó tách dựa trên dấu cách, nếu ko hiểu tìm từ split java đọc
    public String printReverse(String input) {
        
        String[] spliter = input.split("\\s+");
        String result = "";
        String lastword = spliter[spliter.length-1];
       
        for (int i = 0; i < spliter.length; i++) {
           result= spliter[i] +" "+result;
        }
        return result = result.substring(0,1).toUpperCase() + result.substring(1);
    }
      
}

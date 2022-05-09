package Main;


import entity.User;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dinhh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    // bài này chủ yếu dùng hàm check ko hiểu thì meet t giải thich cho
    public static void main(String[] args) {
        ArrayList<User> listUser = new ArrayList<>();
        listUser.add(new User("1234567890", "1234abcd"));
        DataInput in = new DataInput();
        LoginSystem loginSystem = new LoginSystem(listUser);
        System.out.println("1. Vietnamese");
        System.out.println("2. English");
        System.out.println("3. Exit");
        System.out.print("Your choice: ");
        int choice = in.inputChoice(1, 3);
        switch (choice) {
            case 1: {
                loginSystem.changeLanguage(1);
                break;
            }
            case 2: {
                loginSystem.changeLanguage(2);
                break;
            }
            case 3: {
                return;
            }
        }
        loginSystem.login();
    }
    
}

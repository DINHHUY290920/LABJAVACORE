
import jdk.nashorn.internal.parser.Scanner;

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
    //bài này b gửi t chắc b biết review ròi 
    public static int secondHalfLetters(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.toLowerCase(s.charAt(i)) >= 'n') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(secondHalfLetters("ruminates"));
    }
}

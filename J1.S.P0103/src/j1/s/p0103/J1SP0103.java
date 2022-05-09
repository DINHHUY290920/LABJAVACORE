/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0103;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class J1SP0103 {

    static Scanner sc = new Scanner(System.in);

    static public String checkDate(String mess) {
        SimpleDateFormat sdformat = new SimpleDateFormat("dd/MM/yyyy");
        sdformat.setLenient(false);
        Date date;
        do {
            System.out.print(mess);
            try {
                date = sdformat.parse(sc.nextLine());
                String strDate = sdformat.format(date);
                return strDate;
            } catch (ParseException e) {
                System.out.println("Invalid date input, date must be dd/MM/yyyy");
            }
        } while (true);
    }
    //bài này chỉ là so sánh 2 ngày vừa nhập thôi nó có 3 ttrường hợp
    public static void main(String[] args) {
        String date1 = checkDate("Please enter date with format [dd/MM/yyyy]: ");
        String date2 = checkDate("Please enter date with format [dd/MM/yyyy]: ");
        //trường hợp ngày 1 lớn hơn ngày 2: ngày 1 suất hiện trước ngày 2
        if (date1.compareTo(date2) > 0) {
            System.out.println("Date 1 is after date 2");
        } 
        //trường hợp ngày 1  là ngày 2
        else if (date1.compareTo(date2) == 0) {
            System.out.println("Date 1 is  date 2");
        } 
        //trường hợp ngày 1 nhỏ ngày 2: ngày 1 suất hiện sau ngày 2
        else if (date1.compareTo(date2) < 0) {
            System.out.println("Date 1 before date 2");
        }
    }

}

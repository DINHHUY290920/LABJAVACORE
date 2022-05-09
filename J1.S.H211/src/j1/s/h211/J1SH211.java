/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.h211;

import java.util.Scanner;

/**
 *
 * @author dinhh
 */
public class J1SH211 {

    //bài này giải thích khá là khó, bên class ArayIntList là t đi tham khảo code trên mạng
    //thì bài này là có 1 chuỗi mảng có số lượng phần tử chẵn, ko nhập nha
    //VD: test(new int[] {4, 2, 5, 4}); trong mảng này có số lượng phần tử là 4
    //có 4 phần tử là  4  2  5   4
    //      vị trí    :0  1   2   3
    //vị trí chẵn sẽ là số lần suất hiện của vị trí lẻ
    //vị trí chẵn 0 có value là 4 thì sẽ có 4 lần suất hiện số 2 ở vị trí lẻ 1
    //vị trí chẵn sẽ là số lần suất hiện của vị trí lẻ
    //vị trí chẵn 2 có value là 5 thì sẽ có 5 lần suất hiện số 4 ở vị trí lẻ 3
    //đây là t giải thích đề bài cho b hiểu
    public static void main(String[] args) {
        test(new int[] {});
        test(new int[] {3, 8});
        test(new int[] {4, 2, 5, 4});
        test(new int[] {0, 7, 2, 1, 1, 2});
        test(new int[] {5, 42, 13, 2, 0, 5, 3, 7});
        test(new int[] {5, 2, 2, -5, 4, 3, 2, 4, 1, 1, 1, 0, 2, 17});

    }

    public static void test(int[] data) {
        ArrayIntList list1 = new ArrayIntList();
        for (int n : data) {
            list1.add(n);
        }
        System.out.println("list of pairs = " + list1);
        ArrayIntList list2 = list1.fromCounts();
        System.out.println("expanded list = " + list2);
        System.out.println();
    }

}

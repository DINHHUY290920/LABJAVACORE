/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.h211;

/**
 *
 * @author dinhh
 */
class ArrayIntList {
    // cái này là tăng số lượng các phần tử lên 
    //chú ý cái size 2++ là mỗi lần tăng số lượng phần tử thì cái size của mảng phải tăng lên, nếu ko tăng thì ko chứa đucợ, nó sẽ đè chồng chéo lên nhau và khả năng là lỗi
    public ArrayIntList fromCounts() {
        ArrayIntList result = new ArrayIntList();
        int size2 = 0;
        for (int i = 0; i < size; i += 2) {
            for (int j = 0; j < elementData[i]; j++) {
                result.elementData[size2] = elementData[i + 1];
                size2++;
            }
        }
        result.size = size2;
        return result;
    }

    private final int[] elementData; 
    private int size;          

    public static final int DEFAULT_CAPACITY = 100;


    public ArrayIntList() {
        elementData = new int[DEFAULT_CAPACITY];
        size = 0;
    }
    //cái này cũng quan trọng này, phải chuển mảng về dạng string nếu ko là nó lỗi đấy, b thử xóa đi chạy code với code hoàn chỉnh là thấy khác nhau ngay thôi
    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        } else {
            String result = "[" + elementData[0];
            for (int i = 1; i < size; i++) {
                result += ", " + elementData[i];
            }
            result += "]";
            return result;
        }
    }

    public void add(int value) {
        elementData[size] = value;
        size++;
    }
}
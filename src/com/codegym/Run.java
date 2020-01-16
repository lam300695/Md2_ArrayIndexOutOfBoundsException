package com.codegym;

public class Run {
    public static void main(String[] args) {
        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException();
        Integer[] list = arrayIndexOutOfBoundsException.List();
        System.out.println("Mang sau sap xep la :");
        arrayIndexOutOfBoundsException.Sort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        int result = arrayIndexOutOfBoundsException.Find(list,12);
        try {
            System.out.println("vi tri index cua 5 la : " + result);
        }catch (Exception e){
            System.err.println("Vuot qua gia tri mang");
        }
    }
}

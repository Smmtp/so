package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Выберете порядок рортировки '1' - прямой , '2' - обратный , '3' - оба " );
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x == 1) {
            SortArray.rightSort();
        }
        if (x == 2) {
            SortArray.reversSort();
        }
        if(x == 3){
            SortArray.rightSort();
            SortArray.reversSort();
        }
    }


}

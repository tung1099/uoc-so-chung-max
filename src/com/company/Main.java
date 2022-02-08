package com.company;

import java.util.Scanner;

public class Main {

                public static void main(String[] args) {
            // write your code here
                    int num1, num2;
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Nhập số thứ nhất:");
                    num1 = scanner.nextInt();
                    System.out.println("Nhập số thứ hai:");
                    num2 = scanner.nextInt();

                    while (num1 != num2) {
                        if(num1 > num2)
                            num1 -= num2;
                        else
                            num2 -= num1;
                }
                    System.out.printf("Ước chung lớn nhất là %d ", num1);
        }
    }


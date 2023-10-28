package org.example;

public class W02_PrintingPatterns {
    public static void trianglePattern1(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                count++;
                System.out.print(count + " ");
            }
            System.out.println();
        }
    }

    public static void trianglePattern2(int n) {
        for (int i = 0; i < n; i++) {
            int currentValue = 1;
            for (int j = 1; j <= i; j++) { //Loop for blank space
                System.out.print(currentValue + " ");
                currentValue = currentValue * (i- j) / j;//Print Space
            }
            System.out.println(); //Newline
        }
    }
    public static void main(String[] args) {
        trianglePattern1(5);
        trianglePattern2(5);
    }
}

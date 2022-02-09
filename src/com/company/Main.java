package com.company;

public class Main {

    public static void main(String[] args) {
	    int num1 = 7;
        int num2 = 7;
        int answer1;
        int answer2;
        boolean answer3;

        answer1 = multNumbers(num1);
        System.out.println("når vi ganger num1 med 7 får vi " + answer1);

        answer2 = addNumbers(num1, num2);
        System.out.println("når vi tilføjer num1 og num2 får vi: " + answer2);

        answer3 = equalNumbers(num1, num2);
        System.out.println(" num1 og num2 er ens: " + answer3);
    }

    public static int multNumbers(int a) {
        // en metode som tager en enkelt parameter
        //vi fortæller med int at vi gerne vil have en int retur + der skal ske en udregning med et resultat
        int ans = a * 7;

        return ans;
    }
    public static int addNumbers(int x, int y) {
        //forventer to interges
        int ans = x + y;

        return ans;
    }

    public static boolean equalNumbers (int r, int t) {
        if(r == t) return true;

        else return false;
    }
}

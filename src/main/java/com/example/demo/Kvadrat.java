package com.example.demo;

import java.util.Scanner;

public class Kvadrat {




    public static void function() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сторона квадрата ff:");
        int ak = scanner.nextInt();
        //Периметр
        int Pk = 4 * ak;
        System.out.println("Периметр:" + Pk);
        //Площадь
        int Sk = ak * ak;
        System.out.println("Площадь:" + Sk);
        //Диагональ
        double d = ak * Math.sqrt(2);
        System.out.println("Диагональ:" + d);



        System.out.println("Сторона квадрата а2:");
        int ak2 = scanner.nextInt();
        //Периметр
        int Pk2 = 4 * ak2;
        System.out.println("Периметр:" + Pk2);
        //Площадь
        int Sk2 = ak2 * ak2;
        System.out.println("Площадь:" + Sk2);
        //Диагональ
        double d2 = ak2 * Math.sqrt(2);
        System.out.println("Диагональ:" + d2);


        System.out.println("Сторона квадрата а3:");
        int ak3 = scanner.nextInt();
        //Периметр
        int Pk3 = 4 * ak3;
        System.out.println("Периметр:" + Pk3);
        //Площадь
        int Sk3 = ak3 * ak3;
        System.out.println("Площадь:" + Sk3);
        //Диагональ
        double d3 = ak3 * Math.sqrt(2);
        System.out.println("Диагональ:" + d3);

        int A = (ak * ak2 * ak3) /3;
        System.out.println("Средняя площадь квадратов " + A);
    }

    private int ak;
    private int Pk;
    private int Sk;
    private  double d;
    private int ak2;
    private int Pk2;
    private int Sk2;
    private  double d2;
    private int ak3;
    private int Pk3;
    private int Sk3;
    private  double d3;

    public Kvadrat(int ak, int pk, int sk, double d, int ak2, int pk2, int sk2, double d2, int ak3, int pk3, int sk3, double d3) {
        this.ak = ak;
        Pk = pk;
        Sk = sk;
        this.d = d;
        this.ak2 = ak2;
        Pk2 = pk2;
        Sk2 = sk2;
        this.d2 = d2;
        this.ak3 = ak3;
        Pk3 = pk3;
        Sk3 = sk3;
        this.d3 = d3;
    }

    public Kvadrat() {
    }

    public int getAk() {
        return ak;
    }

    public void setAk(int ak) {
        this.ak = ak;
    }

    public int getPk() {
        return Pk;
    }

    public void setPk(int pk) {
        Pk = pk;
    }

    public int getSk() {
        return Sk;
    }

    public void setSk(int sk) {
        Sk = sk;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public int getAk2() {
        return ak2;
    }

    public void setAk2(int ak2) {
        this.ak2 = ak2;
    }

    public int getPk2() {
        return Pk2;
    }

    public void setPk2(int pk2) {
        Pk2 = pk2;
    }

    public int getSk2() {
        return Sk2;
    }

    public void setSk2(int sk2) {
        Sk2 = sk2;
    }

    public double getD2() {
        return d2;
    }

    public void setD2(double d2) {
        this.d2 = d2;
    }

    public int getAk3() {
        return ak3;
    }

    public void setAk3(int ak3) {
        this.ak3 = ak3;
    }

    public int getPk3() {
        return Pk3;
    }

    public void setPk3(int pk3) {
        Pk3 = pk3;
    }

    public int getSk3() {
        return Sk3;
    }

    public void setSk3(int sk3) {
        Sk3 = sk3;
    }

    public double getD3() {
        return d3;
    }

    public void setD3(double d3) {
        this.d3 = d3;
    }
}
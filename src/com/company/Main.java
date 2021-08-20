package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Matematik Notunuzu Giriniz: ");
        int mat = input.nextInt();
        System.out.println(" Fizik Notunuzu Giriniz: ");
        int fizik = input.nextInt();
        System.out.println(" Kimya Notunuzu Giriniz: ");
        int kimya = input.nextInt();
        System.out.println(" Türkçe Notunuzu Giriniz: ");
        int turkce = input.nextInt();
        System.out.println(" Tarih Notunuzu Giriniz: ");
        int tarih = input.nextInt();
        System.out.println(" Müzik Notunuzu Giriniz: ");
        int muzik = input.nextInt();
        int toplam = mat + fizik + kimya + turkce + tarih + muzik;
        double ortalama = (double)(toplam / 6);
        String sonuc = ortalama >= 60.0D ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(sonuc);
    }
}

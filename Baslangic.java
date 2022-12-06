package Giris;

import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {
        /*  Soru-9 Yarıçapı r, merkez açısının ölçüsü a olan daire diliminin alanı bulan programı yazınız.
        pi = 3.14
        formul = (pi*(r*r)*a)/360
        */

        Scanner i = new Scanner(System.in);
        double pi = Math.PI;
        double r , a, formul;

        System.out.print("Yaricapi giriniz : ");
        r = i.nextDouble();
        System.out.print("Merkez acisini giriniz : ");
        a = i.nextDouble();

        formul = (pi*(r*r)*a)/360;
        System.out.println("Sonuc : " + formul);

    }
}

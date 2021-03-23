package latihanmg_2;

import java.util.Scanner;

public class latihan_2B {

    public static void main(String[] args) {
        // membuat variabel dan nama scanner
        String lampu;
        Scanner scan = new Scanner(System.in);
        // mengambil input 
        System.out.print(" Inputkan Nama Warna : ");
        lampu = scan.nextLine();

        // membuat switch case
        switch (lampu) {
            case "merah":
                System.out.println("Lampu merah, berhenti");
                break;

            case "kuning":
                System.out.println("Lampu kuning, harap hati-hati!");
                break;

            case "hijau":
                System.out.println("Lampu hijau, silahkan jalan!");

                break;

            default:
                System.out.println("warna lampu salah!");

        }

    }
}

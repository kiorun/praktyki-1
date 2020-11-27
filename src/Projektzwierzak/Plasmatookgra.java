package Projektzwierzak;
import java.util.Random;
import java.util.Scanner;

public class Plasmatookgra {
    Scanner scan = new Scanner(System.in);
    public void yeah() {
    Random rand1 = new Random();
    kiomon deemon = new kiomon();
    kiomon Plasmatook = new kiomon();
    kiomon spookman = new kiomon();
    spookman.setInfo("Spookman",25);
    deemon.setInfo("Deemon", 20);
    Plasmatook.setInfo("Plasmatook", 20);
    while(true) {
        System.out.print("Podaj nazwe potwora którego chcesz wybrać" + "\n" + (char) 27 + "[01;96m" + deemon.nazwa + "\n" + Plasmatook.nazwa + "\n" + spookman.nazwa + "\n" + "lub zakończ by wyłączyć program" + "\n" + (char) 27 + "[00;00m");

        String v = scan.nextLine();

        switch (v) {
            case "Deemon":

                System.out.println("wybierz drugiego potwora" + "\n" + (char) 27 + "[01;96m" + "Plasmatook" + "\n" + "Spookman" + "\n" + (char) 27 + "[00;00m");
                String ere = scan.nextLine();
                switch (ere) {
                    case "Plasmatook":
                        System.out.println((char) 27 + "[01;95m   Walka się rozpoczyna" + (char) 27 + "[00;00m");
                        int st2 = deemon.stamina;
                        int st1 = Plasmatook.stamina;
                        while ((st1 > 1) || (st2 > 1)) {


                            System.out.println((char) 27 + "[01;32m" + "gracz Deemon wybiera atak" + "\n" + "\n" + "niespodzianka-(losowe obrażenia 0-10)" + "\n" + "kradzież-(zabiera 1-4 punków życia przeciwnika) " + "\n" + "ognia!- (3 ataki o obrażenia 1-3)" + (char) 27 + "[00;00m");
                            String dere = scan.nextLine();
                            switch (dere) {
                                case "niespodzianka":
                                    int a = rand1.nextInt(10);
                                    st1 = st1 - a;
                                    System.out.println((char) 27 + "[01;32m" + "\n" + "atak zadał  " + a + " obrażeń" + (char) 27 + "[00;00m");
                                    System.out.println((char) 27 + "[01;94m" + "\n" + "Plasmatook zostało tyle życia " + st1 + (char) 27 + "[00;00m");
                                    break;
                                case "kradzież":
                                    int b = rand1.nextInt(4) + 1;
                                    st1 = st1 - b;
                                    st2 = st2 + b;
                                    System.out.println((char) 27 + "[01;32m" + "\n" + "atak zadał  " + b + " obrażeń" + "i uleczył Deemona o " + b + (char) 27 + "[00;00m");
                                    System.out.println((char) 27 + "[01;94m" + "\n" + "Plasmatook zostało tyle życia " + st1 + (char) 27 + "[00;00m");
                                    break;
                                case "ognia!":

                                    int c1 = rand1.nextInt(3) + 1;
                                    int c2 = rand1.nextInt(3) + 1;
                                    int c3 = rand1.nextInt(3) + 1;
                                    int c = c1 + c2 + c3;
                                    st1 = st1 - c;
                                    System.out.println((char) 27 + "[01;32m" + "\n" + "atak zadał  " + c1 + " " + c2 + " " + c3 + " =" + "\n" + "[" + c + "] obrażeń" + (char) 27 + "[00;00m");
                                    System.out.println((char) 27 + "[01;94m" + "\n" + "Plasmatook zostało tyle życia " + st1 + (char) 27 + "[00;00m");
                                    break;
                            }


                            if (st1 <= 0)
                                System.out.println((char) 27 + "[01;32m" + "gracz Deemon WYGRAŁ" + "\n" + (char) 27 + "[00;00m");
                            if (st1 <= 0) break;


                            System.out.println((char) 27 + "[01;94m" + "gracz Plasmatook wybiera atak" + "\n" + "\n" + "laser-(6 obrażeń) " + "\n" + "samonaprawa-(leczy o 9)" + "\n" + "fullauto-(seria pieciu posisków)" + "\n" + (char) 27 + "[00;00m");
                            String dere1 = scan.nextLine();
                            switch (dere1) {
                                case "laser":
                                    int a = 6;
                                    st2 = st2 - a;
                                    System.out.println((char) 27 + "[01;94m" + "\n" + "atak zadał  " + a + " obrażeń" + (char) 27 + "[00;00m");
                                    System.out.println((char) 27 + "[01;32m" + "\n" + "Deemon zostało tyle życia " + st2 + (char) 27 + "[00;00m");
                                    break;
                                case "samonaprawa":
                                    int b = 9;
                                    st1 = st1 + b;
                                    System.out.println((char) 27 + "[01;94m" + "\n" + "uleczony zostałeś o" + b + (char) 27 + "[00;00m");
                                    System.out.println((char) 27 + "[01;32m" + "\n" + "Deemon zostało tyle życia " + st2 + (char) 27 + "[00;00m");
                                    break;
                                case "fullauto":
                                    int c1 = rand1.nextInt(2) + 1;
                                    int c2 = rand1.nextInt(2) + 1;
                                    int c3 = rand1.nextInt(2) + 1;
                                    int c4 = rand1.nextInt(2) + 1;
                                    int c5 = rand1.nextInt(2) + 1;
                                    int c = c1 + c2 + c3 + c4 + c5;
                                    st2 = st2 - c;
                                    System.out.println((char) 27 + "[01;32m" + "\n" + "atak zadał  " + c1 + " " + c2 + " " + c3 + " " + c4 + " " + c5 + "=" + "\n" + "[" + c + "] obrażeń" + (char) 27 + "[00;00m");
                                    System.out.println((char) 27 + "[01;32m" + "\n" + "Deemon zostało tyle życia " + st2 + (char) 27 + "[00;00m");
                                    break;
                            }

                            if (st2 <= 0)
                                System.out.println((char) 27 + "[01;94m" + "gracz Plasmatook WYGRAŁ" + "\n" + (char) 27 + "[00;00m");
                            if (st2 <= 0) break;
                        }
                        break;


                    case "Spookman":
                        System.out.println((char) 27 + "[01;95m   Walka się rozpoczyna" + (char) 27 + "[00;00m");

                        int st3 = deemon.stamina;
                        int st4 = spookman.stamina;
                        while ((st3 > 1) || (st4 > 1)) {
                            System.out.println((char) 27 + "[01;32m" + "gracz Deemon wybiera atak" + "\n" + "\n" + "niespodzianka-(losowe obrażenia 0-10)" + "\n" + "kradzież-(zabiera 1-4 punków życia przeciwnika) " + "\n" + "ognia!- (3 ataki o obrażenia 1-3)" + (char) 27 + "[00;00m");
                            String dere = scan.nextLine();
                            switch (dere) {
                                case "niespodzianka":
                                    int a = rand1.nextInt(10);
                                    st4 = st4 - a;
                                    System.out.println((char) 27 + "[01;32m" + "\n" + "atak zadał  " + a + " obrażeń" + (char) 27 + "[00;00m");
                                    System.out.println((char) 27 + "[01;95m" + "\n" + "Spookman zostało tyle życia " + st4 + (char) 27 + "[00;00m");
                                    break;
                                case "kradzież":
                                    int b = rand1.nextInt(4) + 1;
                                    st4 = st4 - b;
                                    st3 = st3 + b;
                                    System.out.println((char) 27 + "[01;32m" + "\n" + "atak zadał  " + b + " obrażeń" + "i uleczył Deemona o " + b + (char) 27 + "[00;00m");
                                    System.out.println((char) 27 + "[01;95m" + "\n" + "Spookman zostało tyle życia " + st4 + (char) 27 + "[00;00m");
                                    break;
                                case "ognia!":

                                    int c1 = rand1.nextInt(3) + 1;
                                    int c2 = rand1.nextInt(3) + 1;
                                    int c3 = rand1.nextInt(3) + 1;
                                    int c = c1 + c2 + c3;
                                    st4 = st4 - c;
                                    System.out.println((char) 27 + "[01;32m" + "\n" + "atak zadał  " + c1 + " " + c2 + " " + c3 + " =" + "\n" + "[" + c + "] obrażeń" + (char) 27 + "[00;00m");
                                    System.out.println((char) 27 + "[01;95m" + "\n" + "Spookman zostało tyle życia " + st4 + (char) 27 + "[00;00m");
                                    break;
                            }


                            if (st4 <= 0)
                                System.out.println((char) 27 + "[01;32m" + "gracz Deemon WYGRAŁ" + "\n" + (char) 27 + "[00;00m");
                            if (st4 <= 0) break;

                            System.out.println((char) 27 + "[01;95m" + "gracz Spookman wybiera atak" + "\n" + "\n" + "szpon-( obrażenia 8) " + "\n" + "furia-(seria 4 ataków) " + "\n" + "kradzież-(zabiera 1-4 punków życia przeciwnika)  " + (char) 27 + "[00;00m");
                            String dere1 = scan.nextLine();
                            switch (dere1) {
                                case "szpon":
                                    int a = 8;
                                    st3 = st3 - a;
                                    System.out.println((char) 27 + "[01;95m" + "\n" + "atak zadał  " + a + " obrażeń" + (char) 27 + "[00;00m");
                                    System.out.println((char) 27 + "[01;32m" + "\n" + "Deemon zostało tyle życia " + st3 + (char) 27 + "[00;00m");
                                    break;
                                case "furia":
                                    int c1 = rand1.nextInt(4);
                                    int c2 = rand1.nextInt(4);
                                    int c3 = rand1.nextInt(4);
                                    int c4 = rand1.nextInt(4);
                                    int c = c1 + c2 + c3 + c4;
                                    st3 = st3 - c;
                                    System.out.println((char) 27 + "[01;95m" + "\n" + "atak zadał  " + c1 + " " + c2 + " " + c3 + " " + c4 + "=" + "\n" + "[" + c + "] obrażeń" + (char) 27 + "[00;00m");
                                    System.out.println((char) 27 + "[01;32m" + "\n" + "Deemon zostało tyle życia " + st3 + (char) 27 + "[00;00m");
                                    break;
                                case "kradzież":
                                    int b = rand1.nextInt(4) + 1;
                                    st4 = st4 + b;
                                    st3 = st3 - b;
                                    System.out.println((char) 27 + "[01;95m" + "\n" + "atak zadał  " + b + " obrażeń" + "i uleczył Spookman o " + b + (char) 27 + "[00;00m");
                                    System.out.println((char) 27 + "[01;32m" + "\n" + "Deemon zostało tyle życia " + st3 + (char) 27 + "[00;00m");
                                    break;
                            }
                            if (st3 <= 0)
                                System.out.println((char) 27 + "[01;95m" + "gracz Spookman WYGRAŁ" + "\n" + (char) 27 + "[00;00m");
                            if (st3 <= 0) break;
                        }
                }
                break;

            case "Plasmatook":
                System.out.println("wybierz drugiego potwora" + "\n" + (char) 27 + "[01;96m" + "Deemon" + "\n" + "Spookman" + "\n" + (char) 27 + "[00;00m");
                String ere1 = scan.nextLine();
                switch (ere1) {
                    case "Deemon":
                        System.out.println((char) 27 + "[01;95m   Walka się rozpoczyna" + (char) 27 + "[00;00m");
                        int st21 = deemon.stamina;
                        int st11 = Plasmatook.stamina;
                        while ((st11 > 1) || (st21 > 1)) {

                            System.out.println((char) 27 + "[01;94m" + "gracz Plasmatook wybiera atak" + "\n" + "\n" + "laser-(6 obrażeń) " + "\n" + "samonaprawa-(leczy o 9)" + "\n" + "fullauto-(seria pieciu posisków)" + "\n" + (char) 27 + "[00;00m");
                            String dere1 = scan.nextLine();
                            switch (dere1) {
                                case "laser":
                                    int a = 6;
                                    st21 = st21 - a;
                                    System.out.println((char) 27 + "[01;94m" + "\n" + "atak zadał  " + a + " obrażeń" + (char) 27 + "[00;00m");
                                    System.out.println((char) 27 + "[01;32m" + "\n" + "Deemon zostało tyle życia " + st21 + (char) 27 + "[00;00m");
                                    break;
                                case "samonaprawa":
                                    int b = 9;
                                    st11 = st11 + b;
                                    System.out.println((char) 27 + "[01;94m" + "\n" + "uleczony zostałeś o" + b + (char) 27 + "[00;00m");
                                    System.out.println((char) 27 + "[01;32m" + "\n" + "Deemon zostało tyle życia " + st21 + (char) 27 + "[00;00m");
                                    break;
                                case "fullauto":
                                    int c1 = rand1.nextInt(2) + 1;
                                    int c2 = rand1.nextInt(2) + 1;
                                    int c3 = rand1.nextInt(2) + 1;
                                    int c4 = rand1.nextInt(2) + 1;
                                    int c5 = rand1.nextInt(2) + 1;
                                    int c = c1 + c2 + c3 + c4 + c5;
                                    st21 = st21 - c;
                                    System.out.println((char) 27 + "[01;32m" + "\n" + "atak zadał  " + c1 + " " + c2 + " " + c3 + " " + c4 + " " + c5 + "=" + "\n" + "[" + c + "] obrażeń" + (char) 27 + "[00;00m");
                                    System.out.println((char) 27 + "[01;32m" + "\n" + "Deemon zostało tyle życia " + st21 + (char) 27 + "[00;00m");
                                    break;
                            }

                            if (st21 <= 0)
                                System.out.println((char) 27 + "[01;94m" + "gracz Plasmatook WYGRAŁ" + "\n" + (char) 27 + "[00;00m");
                            if (st21 <= 0) break;


                            System.out.println((char) 27 + "[01;32m" + "gracz Deemon wybiera atak" + "\n" + "\n" + "niespodzianka-(losowe obrażenia 0-10)" + "\n" + "kradzież-(zabiera 1-4 punków życia przeciwnika) " + "\n" + "ognia!- (3 ataki o obrażenia 1-3)" + (char) 27 + "[00;00m");
                            String dere = scan.nextLine();
                            switch (dere) {
                                case "niespodzianka":
                                    int a = rand1.nextInt(10);
                                    st11 = st11 - a;
                                    System.out.println((char) 27 + "[01;32m" + "\n" + "atak zadał  " + a + " obrażeń" + (char) 27 + "[00;00m");
                                    System.out.println((char) 27 + "[01;94m" + "\n" + "Plasmatook zostało tyle życia " + st11 + (char) 27 + "[00;00m");
                                    break;
                                case "kradzież":
                                    int b = rand1.nextInt(4) + 1;
                                    st11 = st11 - b;
                                    st21 = st21 + b;
                                    System.out.println((char) 27 + "[01;32m" + "\n" + "atak zadał  " + b + " obrażeń" + "i uleczył Deemona o " + b + (char) 27 + "[00;00m");
                                    System.out.println((char) 27 + "[01;94m" + "\n" + "Plasmatook zostało tyle życia " + st11 + (char) 27 + "[00;00m");
                                    break;
                                case "ognia!":

                                    int c1 = rand1.nextInt(3) + 1;
                                    int c2 = rand1.nextInt(3) + 1;
                                    int c3 = rand1.nextInt(3) + 1;
                                    int c = c1 + c2 + c3;
                                    st11 = st11 - c;
                                    System.out.println((char) 27 + "[01;32m" + "\n" + "atak zadał  " + c1 + " " + c2 + " " + c3 + " =" + "\n" + "[" + c + "] obrażeń" + (char) 27 + "[00;00m");
                                    System.out.println((char) 27 + "[01;94m" + "\n" + "Plasmatook zostało tyle życia " + st11 + (char) 27 + "[00;00m");
                                    break;
                            }


                            if (st11 <= 0)
                                System.out.println((char) 27 + "[01;32m" + "gracz Deemon WYGRAŁ" + "\n" + (char) 27 + "[00;00m");
                            if (st11 <= 0) break;

                        }
                        break;
                    case "Spookman":
                        System.out.println((char) 27 + "[01;95m   Walka się rozpoczyna" + (char) 27 + "[00;00m");
                        int st5 = spookman.stamina;
                        int st6 = Plasmatook.stamina;
                        while ((st5 > 1) || (st6 > 1)) {

                            System.out.println((char) 27 + "[01;94m" + "gracz Plasmatook wybiera atak" + "\n" + "\n" + "laser-(6 obrażeń) " + "\n" + "samonaprawa-(leczy o 9)" + "\n" + "fullauto-(seria pieciu posisków)" + "\n" + (char) 27 + "[00;00m");
                            String dere1 = scan.nextLine();
                            switch (dere1) {
                                case "laser":
                                    int a = 6;
                                    st5 = st5 - a;
                                    System.out.println((char) 27 + "[01;94m" + "\n" + "atak zadał  " + a + " obrażeń" + (char) 27 + "[00;00m");
                                    System.out.println((char) 27 + "[01;95m" + "\n" + "Spookman zostało tyle życia " + st5 + (char) 27 + "[00;00m");
                                    break;
                                case "samonaprawa":
                                    int b = 9;
                                    st6 = st6 + b;
                                    System.out.println((char) 27 + "[01;94m" + "\n" + "uleczony zostałeś o" + b + (char) 27 + "[00;00m");
                                    System.out.println((char) 27 + "[01;95m" + "\n" + "Spookman zostało tyle życia " + st5 + (char) 27 + "[00;00m");
                                    break;
                                case "fullauto":
                                    int c1 = rand1.nextInt(2) + 1;
                                    int c2 = rand1.nextInt(2) + 1;
                                    int c3 = rand1.nextInt(2) + 1;
                                    int c4 = rand1.nextInt(2) + 1;
                                    int c5 = rand1.nextInt(2) + 1;
                                    int c = c1 + c2 + c3 + c4 + c5;
                                    st5 = st5 - c;
                                    System.out.println((char) 27 + "[01;32m" + "\n" + "atak zadał  " + c1 + " " + c2 + " " + c3 + " " + c4 + " " + c5 + "=" + "\n" + "[" + c + "] obrażeń" + (char) 27 + "[00;00m");
                                    System.out.println((char) 27 + "[01;95m" + "\n" + "Spookman zostało tyle życia  " + st5 + (char) 27 + "[00;00m");
                                    break;
                            }

                            if (st5 <= 0)
                                System.out.println((char) 27 + "[01;94m" + "gracz Plasmatook WYGRAŁ" + "\n" + (char) 27 + "[00;00m");
                            if (st5 <= 0) break;


                            System.out.println((char) 27 + "[01;95m" + "gracz Spookman wybiera atak" + "\n" + "\n" + "szpon-( obrażenia 8) " + "\n" + "furia-(seria 4 ataków) " + "\n" + "kradzież-(zabiera 1-4 punków życia przeciwnika)  " + (char) 27 + "[00;00m");
                            String dere = scan.nextLine();
                            switch (dere) {
                                case "szpon":
                                    int a = 8;
                                    st6 = st6 - a;
                                    System.out.println((char) 27 + "[01;95m" + "\n" + "atak zadał  " + a + " obrażeń" + (char) 27 + "[00;00m");
                                    System.out.println((char) 27 + "[01;94m" + "\n" + "Plasmatook zostało tyle życia  " + st6 + (char) 27 + "[00;00m");
                                    break;
                                case "furia":
                                    int c1 = rand1.nextInt(4);
                                    int c2 = rand1.nextInt(4);
                                    int c3 = rand1.nextInt(4);
                                    int c4 = rand1.nextInt(4);
                                    int c = c1 + c2 + c3 + c4;
                                    st6 = st6 - c;
                                    System.out.println((char) 27 + "[01;95m" + "\n" + "atak zadał  " + c1 + " " + c2 + " " + c3 + " " + c4 + "=" + "\n" + "[" + c + "] obrażeń" + (char) 27 + "[00;00m");
                                    System.out.println((char) 27 + "[01;94m" + "\n" + "Plasmatook zostało tyle życia " + st6 + (char) 27 + "[00;00m");
                                    break;
                                case "kradzież":
                                    int b = rand1.nextInt(4) + 1;
                                    st6 = st6 - b;
                                    st5 = st5 + b;
                                    System.out.println((char) 27 + "[01;95m" + "\n" + "atak zadał  " + b + " obrażeń" + "i Spookman  o " + b + (char) 27 + "[00;00m");
                                    System.out.println((char) 27 + "[01;94m" + "\n" + "Plasmatook zostało tyle życia " + st6 + (char) 27 + "[00;00m");
                                    break;
                            }
                            if (st6 <= 0)
                                System.out.println((char) 27 + "[01;95m" + "gracz Spookman WYGRAŁ" + "\n" + (char) 27 + "[00;00m");
                            if (st6 <= 0) break;

                        }
                        break;
                }
                break;
            case "Spookman":
                System.out.println("wybierz drugiego potwora" + "\n" + (char) 27 + "[01;96m" + "Deemon" + "\n" + "Plasmatook" + "\n" + (char) 27 + "[00;00m");
                String ere3 = scan.nextLine();
                switch (ere3) {
                    case "Plasmatook":
                        System.out.println((char) 27 + "[01;95m   Walka się rozpoczyna" + (char) 27 + "[00;00m");
                        int st5 = spookman.stamina;
                        int st6 = Plasmatook.stamina;
                        while ((st5 > 1) || (st6 > 1)) {
                            System.out.println((char) 27 + "[01;95m" + "gracz Spookman wybiera atak" + "\n" + "\n" + "szpon-( obrażenia 8) " + "\n" + "furia-(seria 4 ataków) " + "\n" + "kradzież-(zabiera 1-4 punków życia przeciwnika)  " + (char) 27 + "[00;00m");
                            String dere = scan.nextLine();
                            switch (dere) {
                                case "szpon":
                                    int a = 8;
                                    st6 = st6 - a;
                                    System.out.println((char) 27 + "[01;95m" + "\n" + "atak zadał  " + a + " obrażeń" + (char) 27 + "[00;00m");
                                    System.out.println((char) 27 + "[01;94m" + "\n" + "Plasmatook zostało tyle życia  " + st6 + (char) 27 + "[00;00m");
                                    break;
                                case "furia":
                                    int c1 = rand1.nextInt(4);
                                    int c2 = rand1.nextInt(4);
                                    int c3 = rand1.nextInt(4);
                                    int c4 = rand1.nextInt(4);
                                    int c = c1 + c2 + c3 + c4;
                                    st6 = st6 - c;
                                    System.out.println((char) 27 + "[01;95m" + "\n" + "atak zadał  " + c1 + " " + c2 + " " + c3 + " " + c4 + "=" + "\n" + "[" + c + "] obrażeń" + (char) 27 + "[00;00m");
                                    System.out.println((char) 27 + "[01;94m" + "\n" + "Plasmatook zostało tyle życia " + st6 + (char) 27 + "[00;00m");
                                    break;
                                case "kradzież":
                                    int b = rand1.nextInt(4) + 1;
                                    st6 = st6 - b;
                                    st5 = st5 + b;
                                    System.out.println((char) 27 + "[01;95m" + "\n" + "atak zadał  " + b + " obrażeń" + "i Spookman  o " + b + (char) 27 + "[00;00m");
                                    System.out.println((char) 27 + "[01;94m" + "\n" + "Plasmatook zostało tyle życia " + st6 + (char) 27 + "[00;00m");
                                    break;
                            }
                            if (st6 <= 0)
                                System.out.println((char) 27 + "[01;95m" + "gracz Spookman WYGRAŁ" + "\n" + (char) 27 + "[00;00m");
                            if (st6 <= 0) break;

                            System.out.println((char) 27 + "[01;94m" + "gracz Plasmatook wybiera atak" + "\n" + "\n" + "laser-(6 obrażeń) " + "\n" + "samonaprawa-(leczy o 9)" + "\n" + "fullauto-(seria pieciu posisków)" + "\n" + (char) 27 + "[00;00m");
                            String dere1 = scan.nextLine();
                            switch (dere1) {
                                case "laser":
                                    int a = 6;
                                    st5 = st5 - a;
                                    System.out.println((char) 27 + "[01;94m" + "\n" + "atak zadał  " + a + " obrażeń" + (char) 27 + "[00;00m");
                                    System.out.println((char) 27 + "[01;95m" + "\n" + "Spookman zostało tyle życia " + st5 + (char) 27 + "[00;00m");
                                    break;
                                case "samonaprawa":
                                    int b = 9;
                                    st6 = st6 + b;
                                    System.out.println((char) 27 + "[01;94m" + "\n" + "uleczony zostałeś o" + b + (char) 27 + "[00;00m");
                                    System.out.println((char) 27 + "[01;95m" + "\n" + "Spookman zostało tyle życia " + st5 + (char) 27 + "[00;00m");
                                    break;
                                case "fullauto":
                                    int c1 = rand1.nextInt(2) + 1;
                                    int c2 = rand1.nextInt(2) + 1;
                                    int c3 = rand1.nextInt(2) + 1;
                                    int c4 = rand1.nextInt(2) + 1;
                                    int c5 = rand1.nextInt(2) + 1;
                                    int c = c1 + c2 + c3 + c4 + c5;
                                    st5 = st5 - c;
                                    System.out.println((char) 27 + "[01;32m" + "\n" + "atak zadał  " + c1 + " " + c2 + " " + c3 + " " + c4 + " " + c5 + "=" + "\n" + "[" + c + "] obrażeń" + (char) 27 + "[00;00m");
                                    System.out.println((char) 27 + "[01;95m" + "\n" + "Spookman zostało tyle życia  " + st5 + (char) 27 + "[00;00m");
                                    break;
                            }

                            if (st5 <= 0)
                                System.out.println((char) 27 + "[01;94m" + "gracz Plasmatook WYGRAŁ" + "\n" + (char) 27 + "[00;00m");
                            if (st5 <= 0) break;
                        }
                        break;


                    case "Deemon":
                        System.out.println((char) 27 + "[01;95m   Walka się rozpoczyna" + (char) 27 + "[00;00m");

                        int st3 = deemon.stamina;
                        int st4 = spookman.stamina;
                        while ((st3 > 1) || (st4 > 1)) {
                            System.out.println((char) 27 + "[01;95m" + "gracz Spookman wybiera atak" + "\n" + "\n" + "szpon-( obrażenia 8) " + "\n" + "furia-(seria 4 ataków) " + "\n" + "kradzież-(zabiera 1-4 punków życia przeciwnika)  " + (char) 27 + "[00;00m");
                            String dere1 = scan.nextLine();
                            switch (dere1) {
                                case "szpon":
                                    int a = 8;
                                    st3 = st3 - a;
                                    System.out.println((char) 27 + "[01;95m" + "\n" + "atak zadał  " + a + " obrażeń" + (char) 27 + "[00;00m");
                                    System.out.println((char) 27 + "[01;32m" + "\n" + "Deemon zostało tyle życia " + st3 + (char) 27 + "[00;00m");
                                    break;
                                case "furia":
                                    int c1 = rand1.nextInt(4);
                                    int c2 = rand1.nextInt(4);
                                    int c3 = rand1.nextInt(4);
                                    int c4 = rand1.nextInt(4);
                                    int c = c1 + c2 + c3 + c4;
                                    st3 = st3 - c;
                                    System.out.println((char) 27 + "[01;95m" + "\n" + "atak zadał  " + c1 + " " + c2 + " " + c3 + " " + c4 + "=" + "\n" + "[" + c + "] obrażeń" + (char) 27 + "[00;00m");
                                    System.out.println((char) 27 + "[01;32m" + "\n" + "Deemon zostało tyle życia " + st3 + (char) 27 + "[00;00m");
                                    break;
                                case "kradzież":
                                    int b = rand1.nextInt(4) + 1;
                                    st4 = st4 + b;
                                    st3 = st3 - b;
                                    System.out.println((char) 27 + "[01;95m" + "\n" + "atak zadał  " + b + " obrażeń" + "i uleczył Spookman o " + b + (char) 27 + "[00;00m");
                                    System.out.println((char) 27 + "[01;32m" + "\n" + "Deemon zostało tyle życia " + st3 + (char) 27 + "[00;00m");
                                    break;
                            }
                            if (st3 <= 0) System.out.println((char) 27 + "[01;95m" + "gracz Spookman WYGRAŁ" + "\n" + (char) 27 + "[00;00m");
                            if (st3 <= 0) break;
                            System.out.println((char) 27 + "[01;32m" + "gracz Deemon wybiera atak" + "\n" + "\n" + "niespodzianka-(losowe obrażenia 0-10)" + "\n" + "kradzież-(zabiera 1-4 punków życia przeciwnika) " + "\n" + "ognia!- (3 ataki o obrażenia 1-3)" + (char) 27 + "[00;00m");
                            String dere = scan.nextLine();
                            switch (dere) {
                                case "niespodzianka":
                                    int a = rand1.nextInt(10);
                                    st4 = st4 - a;
                                    System.out.println((char) 27 + "[01;32m" + "\n" + "atak zadał  " + a + " obrażeń" + (char) 27 + "[00;00m");
                                    System.out.println((char) 27 + "[01;95m" + "\n" + "Spookman zostało tyle życia " + st4 + (char) 27 + "[00;00m");
                                    break;
                                case "kradzież":
                                    int b = rand1.nextInt(4) + 1;
                                    st4 = st4 - b;
                                    st3 = st3 + b;
                                    System.out.println((char) 27 + "[01;32m" + "\n" + "atak zadał  " + b + " obrażeń" + "i uleczył Deemona o " + b + (char) 27 + "[00;00m");
                                    System.out.println((char) 27 + "[01;95m" + "\n" + "Spookman zostało tyle życia " + st4 + (char) 27 + "[00;00m");
                                    break;
                                case "ognia!":

                                    int c1 = rand1.nextInt(3) + 1;
                                    int c2 = rand1.nextInt(3) + 1;
                                    int c3 = rand1.nextInt(3) + 1;
                                    int c = c1 + c2 + c3;
                                    st4 = st4 - c;
                                    System.out.println((char) 27 + "[01;32m" + "\n" + "atak zadał  " + c1 + " " + c2 + " " + c3 + " =" + "\n" + "[" + c + "] obrażeń" + (char) 27 + "[00;00m");
                                    System.out.println((char) 27 + "[01;95m" + "\n" + "Spookman zostało tyle życia " + st4 + (char) 27 + "[00;00m");
                                    break;

                            }
                            if (st4 <= 0)
                                System.out.println((char) 27 + "[01;32m" + "gracz Deemon WYGRAŁ" + "\n" + (char) 27 + "[00;00m");
                            if (st4 <= 0) break;
                        }
                }
                break;
            case "zakończ": System.out.println("Kończe program");
                break;

            default:
                System.out.println((char) 27 + "[01;31m" + "\n" + "NIE wybrałeś żadnego potwora " + "\n" + (char) 27 + "[00;00m");
                yeah();

        }

        if (v.equals("zakończ")) break;
        System.out.println((char) 27 + "[01;32m" + "Możesz zagrać teraz ponownie" + "\n" + (char) 27 + "[00;00m");
         }
}
}

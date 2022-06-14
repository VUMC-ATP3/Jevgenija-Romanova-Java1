package homework;

import java.util.Scanner;

public class LoopHomeWork {

    public static void main(String[] args) {

        // 1.
        System.out.println("1.Uzdevums");

        int summa = 0;
        Scanner scanner = new Scanner(System.in);
        int skaitlis;
        while (summa <= 100) {
            System.out.println("Ievadiet veselu skaitli:");
            skaitlis = scanner.nextInt();
            summa = summa + skaitlis;
        }
        System.out.println(summa + " Gatavs!");


        // 2.

        System.out.println("2.Uzdevums");

        int num = 29, i = 2;
        boolean flag = false;
        while (i <= num / 2) {
            // condition for nonprime number
            if (num % i == 0) {
                flag = true;
                break;
            }

            ++i;
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");


        //3.

        System.out.println("3.Uzdevums");

        int[] skaitli = {1, 4, 8, 10, 12, 16};
        String[] ielas = {"Brīvinas", "Čaka", "Skolas ", "Ropažu", "Deglava"};
        char[] burti = {'a', 'b', 'c', 'd', 'e'};

        //while
        int a = 0;
        while (a < skaitli.length) {
            System.out.println(skaitli[a]);
            a = a + 1;
        }

        int b = 0;
        while (b < ielas.length) {
            System.out.println(ielas[b]);
            b = b + 1;
        }

        int c = 0;
        while (c < burti.length) {
            System.out.println(burti[c]);
            c = c + 1;
        }

        //Do while
        int aw = 0;
        do {
            System.out.println(skaitli[aw]);
            aw = aw + 1;
        } while (aw < (skaitli.length));

        int bw = 0;
        do {
            System.out.println(ielas[bw]);
            bw = bw + 1;
        } while (bw < (ielas.length));

        int cw = 0;
        do {
            System.out.println(burti[cw]);
            cw = cw + 1;
        } while (cw < (burti.length));

        //For loop
        for (int j = 0; j < skaitli.length; j++) {
            System.out.println(skaitli[j]);
        }

        for (int j = 0; j < ielas.length; j++) {
            System.out.println(ielas[j]);
        }

        for (int j = 0; j < burti.length; j++) {
            System.out.println(burti[j]);
        }

        //For each
        for (int af : skaitli) {
            System.out.println(af);
        }

        for (String bf : ielas) {
            System.out.println(bf);
        }

        for (char cf : burti) {
            System.out.println(cf);
        }


        //4.uzdevums
        System.out.println("4.Uzdevums");{
        int[] skaitluMasivs = new int[100];
        int paraSkatislis = 2;
        for (int masivaIndeks = 0; masivaIndeks < skaitluMasivs.length; masivaIndeks++) {
            skaitluMasivs[masivaIndeks] = masivaIndeks;
            System.out.print(paraSkatislis + " ");
            paraSkatislis = paraSkatislis + 2;
        }}


        //5.uzdevums

        {
            int number = 4, s = 1;
            long faktorial = 1;
            while (s <= number) {
                faktorial *= s;
                s++;
            }
            System.out.println("5.Uzdevums");
            System.out.printf("Faktoriāls skaitlim %d = %d", number, faktorial);
        }


        //6.uzdevums

        final int pin = 9999;
        int meginajumi = 0;
        int parole;
        System.out.println("6.Uzdevums");

        while (meginajumi < 3) {
            meginajumi++;
            System.out.println(meginajumi + ". Ievadi lūdzu pin kodu!");
            parole = scanner.nextInt();
            if (pin == parole) {
                System.out.println("PIN ir pieņemts, laipni lūdzam atpakaļ!");
                break;
            } else {
                System.out.println("Nepareizs PIN, mēģiniet vēlreiz!");
            }
        }
        if (meginajumi >= 3) {
            System.out.println("Atvainojiet, bet jūs esat bloķēts!");
        }

    }

}

package homeworkTwo;

import java.util.Scanner;

public class HomeWorkTwo {


    public static void main(String[] args) {
        pirmieUzdevumi();
        printBusinessCard();
        printBusinessCard();
        printBusinessCard();
        printBusinessCardTwo("Līga", "Kalniņa", "+371 12312313", "1965");
        printBusinessCardTwo("Juris", "Vitols", "+371 5142431", "1930");
        int summa = sum(2, 4);
        System.out.println(summa);
        double average = average(555.55, 99999.99, 333.33);
        System.out.println(average);

    }


    public static void pirmieUzdevumi() {
        //
        System.out.println("1. uzdevums!");
        int x = 10;
        System.out.println(x > 0);
        System.out.println(x < 0);
        System.out.println(x > 5 && x <= 10);
        System.out.println(!(x <= 5 && x < 10));
        System.out.println(x == 0 && x == 10);
        System.out.println(x * x > 10);

        //
        System.out.println("2. uzdevums!");

        int mēnesis = 13;
        String month;

        switch (mēnesis) {
            case 1:
                month = "Janvāris";
                break;
            case 2:
                month = "Februāris";
                break;
            case 3:
                month = "Marts";
                break;
            case 4:
                month = "Aprīlis";
                break;
            case 5:
                month = "Maijs";
                break;
            case 6:
                month = "Jūnijs";
                break;
            case 7:
                month = "Jūlijs";
                break;
            case 8:
                month = "Augusts";
                break;
            case 9:
                month = "Septembris";
                break;
            case 10:
                month = "Oktobris";
                break;
            case 11:
                month = "Novembris";
                break;
            case 12:
                month = "Decembris";
                break;
            default:
                month = "Mēnesis neeksistē";
        }
        System.out.println("Mēnesis = " + month);


        //
        System.out.println("3. uzdevums!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadi pirmo skaitli ");
        int a = scanner.nextInt();
        System.out.println("Ievadi otro skaitli");
        int b = scanner.nextInt();
        System.out.println("Ievadi trešo skaitli");
        int c = scanner.nextInt();
        if ((a > b) && (a > c)) {
            System.out.println(a + " ir lielākais skatlis");
        } else if ((b > a) && (b > c)) {
            System.out.println(b + " ir lielākais skatlis");
        } else if ((c > a) && (c > b)) {
            System.out.println(c + " ir lielākais skatlis");
        }


        //

        System.out.println("4. uzdevums!");
        String gaisma = "Zaļa";
        System.out.println("Pieeju pie luksofora");
        if (gaisma.equals("Zaļa")) {
            System.out.println("Deg zaļa - Ejam!");
        } else if (gaisma.equals("Dzeltena")) {
            System.out.println("Deg Dzeltena - Gaidām zaļo gaismu!");
        } else if (gaisma.equals("Sarkana")) {
            System.out.println("Deg Sarkana - Gaidām zaļo gaismu!");
        } else {
            System.out.println("Luksafors nedarbojas. Pārliecinieties, vai pāreja ir droša, tad šķērsojiet to");
        }

        //
        System.out.println("5. uzdevums!");
    }


    public static void printBusinessCard() {
        System.out.println("Vizītkarte");
        System.out.println("##########");
        System.out.println("Vārds: Jānis");
        System.out.println("Uzvārds: Bērziņš");
        System.out.println("Telefona nr.: +371 12345678");
        System.out.println("Dzimšanas gads: 1990");
        System.out.println("##########");
    }


    // 6.uzdevums

    public static void printBusinessCardTwo(String name, String surname, String number, String dateOfBirth) {
        System.out.println("Vizītkarte");
        System.out.println("##########");
        System.out.println("Vārds: " + name + "\nUzvārds: " + surname + "\nTelefona nr: " + number + "\nDzimšanas gads: " + dateOfBirth);
        System.out.println("##########");
    }

    // 7.uzdevums

    public static int sum(int x, int y) {
        int skaitluSumma = x + y;
        return skaitluSumma;

    }

    // 8.uzdevums

    public static double average(double skaitlisViens, double skaitlisDivi, double skaitlisTris) {


        double SkaitluSumma = skaitlisViens + skaitlisDivi + skaitlisTris;
        double skaitlAverage = SkaitluSumma / 3;
        return skaitlAverage;

    }
}

























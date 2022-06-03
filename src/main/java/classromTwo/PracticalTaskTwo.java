package classromTwo;
import java.util.Scanner;
public class PracticalTaskTwo {



    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadi savu vardu!");
        String name = scanner.nextLine();
        System.out.println("Ievadi savu vecumu");
        int age = scanner.nextInt();

        System.out.println("Esi Sveicinats: %s" + name);
        System.out.println("Jusu vecums ir:" + age);

        System.out.println("Ievadi skaitli 1!");
        int skaitlis1 = scanner.nextInt();
        System.out.println("Ievadi skaitli 2!");
        int skaitlis2 = scanner.nextInt();
        int Summa = skaitlis1 + skaitlis2;
        System.out.println("Summa = " + Summa);
    }


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int a = 5;
            int b = 10;
            int c = 5;
            System.out.println(b > a); //true
            System.out.println(a > b); //false
            //Mazak
            System.out.println(a < b); //true
            System.out.println(a < b); //false
            //Vienads
            System.out.println(a == c); //true
            System.out.println(a == b);//false
            System.out.println(b == c);//false
            // nav vienads
            System.out.println(a != b);//true
            System.out.println(a != c);//false

            //mazak vienads
            System.out.println(a <= c);//true
            //lielaks vienads
            System.out.println(b >= c);//false

            int vecums = 18;
            boolean vaiDrikstBalsot = (vecums >= 18);
            System.out.println("Vai cilveks driks balsot?" + vaiDrikstBalsot);


            int e = 4;

            boolean vaiIrPatiess = ((e < 5) && (e < 10));
            System.out.println(vaiIrPatiess);

            e = 5;
            vaiIrPatiess = ((e < 5) && (e < 10));
            System.out.println(vaiIrPatiess);

            vaiIrPatiess = ((e < 5) || (e < 10));
            System.out.println(vaiIrPatiess);

            e = 5;
            vaiIrPatiess = ((e < 5));
            System.out.println(vaiIrPatiess);

            System.out.println(!(false == true));


            int vecumsDivi = 17;
            if (vecumsDivi >= 18) {

                System.out.println("Cilveks drikst balsot");
            } else {

            }
            System.out.println("Kods turpinas");
            System.out.println("Ievadi savu vecumu...");
            int vecumsTris = scanner.nextInt();
            if (vecumsTris >= 18) {
                System.out.println("Cilveks drikst balsot");
            } else {
                System.out.println("Cilveks nedrikst balsot");
            }
            System.out.println("Kods turpinas");

            System.out.println("Ievadi skaitli");
            int skaitlisViens = scanner.nextInt();
            if (skaitlisViens == 10) {
                System.out.println("Printejam Skaitlis 10");
            } else if (skaitlisViens == 15) {
                System.out.println("Printejam Skaitlis 15");
            } else if (skaitlisViens == 20) {
                System.out.println("Printejam Skaitlis 20");
            } else {
                System.out.println("Skaitlis ir nezinams");
            }
            System.out.println("Kods turpinas");

            //Janodefine cilveks
            //Cilveka vecums
            //cilveka dzimums - V vai S
            //Sieviete drikst doties pensija no 60 gadiem
            //Virietis driskt doties pensija no 65 gadiem


            int vecumsPensija = 66;
            char dzimums = 'S';

            if (dzimums == 'V' && vecumsPensija >= 65) {
                System.out.println("Vīrieši drīkst doties pensijā no 65");
            } else if (dzimums == 'S' && vecumsPensija >= 60) {
                System.out.println("Sievietes drīkst doties pensijā no 60");
            } else {
                System.out.println("Jūs nedrīkstat doties pensijā");

            }
                int diena = 3;
                String dienasVards;

                switch(diena) {
                    case 1:
                        dienasVards="Pirmdiena";
                        break;
                    case 2:
                        dienasVards="Otrdiena";
                        break;
                    case 3:
                        dienasVards="Trešdiena";
                        break;
                    case 4:
                        dienasVards="Ceturdiena";
                        break;
                    case 5:
                        dienasVards="Piektdiena";
                        break;
                    case 6:
                        dienasVards="Sestdiena";
                        break;
                    case 7:
                        dienasVards="Svētdiena";
                        break;
                    default:
                        dienasVards="Nezināma diena";
                }

            System.out.println("Lūdzu ievadiet skaitli");
            int skaitlis= scanner.nextInt();
            if (skaitlis>0) {
                System.out.println("Skaitlis lielāks par nulli");
            } else {
                System.out.println("Skaitlis ir mazāks par 0");
            }



            int skaitlisJauns = 5;
            if(skaitlisJauns%2==0){
                System.out.println("Skaitlis ir para skaitlis");
            }else{
                System.out.println("Skaitlis ir nepara skaitlis");
            }



        }









            }





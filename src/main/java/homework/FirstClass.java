package homework;

public class FirstClass {
    int x;

    public static void main(String[] args) {
        country();
        exampleOne();
        exampleTwo();
        exampleThree();
    }

    public static void country() {
//Valsts

        String Valsts = "Andora";
        int IedzivotajuSkaits = 85082;
        int Platiba = 468;
        String Galvaspilseta = "Andora";
        String Valoda = "Katalāņu valodā";
        boolean ESdalibvalsts = true;
        char Valuta = '€';

        System.out.println("Valsts Nosaukums-" + Valsts);
        System.out.println("Iedzīvotaju skaits-" + IedzivotajuSkaits);
        System.out.println("Platība-" + Platiba);
        System.out.println("Galvaspilsēta-" + Galvaspilseta);
        System.out.println("Oficiāla valoda-" + Valoda);
        System.out.println("Vai ir ES dalībvalsts-" + ESdalibvalsts);
        System.out.println("Valūta-" + Valuta);

        System.out.println("Andoras platība ir " + Platiba + "km² un to ietekmē mērenās joslas klimats." + " Atrodas Pireneju kalnos.\n" + Valsts + " ar " + IedzivotajuSkaits + " iedzīvotājiem ir piecdesmitā " + "lielākā valsts Eiropā." + "\n");

    }
//Skaitļi
        public static void exampleOne() {
        //1
        int summa;
        int starpiba;
        int reizinajums;
        double dalijums;
        int atlikums;
        int x = 10;
        int y = 5;

        summa = x + y;
        starpiba = x - y;
        reizinajums = x * y;
        dalijums = x / y;
        atlikums = 12 % 5;

//        int rezultats = z/x;
        System.out.println("DALIT = " + x / y);


        int skaitlis = 9999;
        System.out.println("Ja atbilde ir 0, sis ir para skaitlis " + skaitlis % 2);

        System.out.println("SUMMA " + summa);
        System.out.println("Starpiba " + starpiba);
        System.out.println("Reizinājums " + reizinajums);
        System.out.println("Dalījums " + dalijums);
        System.out.println("Atlikums " + atlikums + "\n");

    }

    public static void exampleTwo() {


        //2

        int x = 8;
        int y = 4;
        int z = 2;
        int summa = x + y;
        int starpiba = x - y;
        int reizinajums = x * z;
        double dalijums = x / y;

        System.out.println("8+4=" + summa);
        System.out.println("8-4=" + starpiba);
        System.out.println("8*2=" + reizinajums);
        System.out.println("8/4=" + dalijums);

        int rezultats = (x * z * y / z - (x + y) + (x - y)) / y;
        System.out.println("(8*2*4/2-(8+4)+(8-4))/4=" + rezultats + "\n");



    }
    public static void exampleThree(){
   //3
        int x = 50;
        int y = 25;
        int z = 5;
        int summa = x + y;
        int starpiba = x - y;
        int reizinajums = x * z;
        double dalijums = x / y;

        System.out.println("50+25 Summa =" + summa);
        System.out.println("50-25 Starpiba=" + starpiba);
        System.out.println("50*5 Reizinājum=" + reizinajums);
        System.out.println("50/25 Dalījums=" + dalijums);

        int rezultats = (x * z * y / z - (x + y) + (x - y)) / y;
        System.out.println("(x * z * y / z - (x + y) + (x - y)) / y = Rezultats =" + rezultats + "\n");


    }
}





package classroomFour;

public class Main {
    public static void main(String[] args) {
        House majaViens = new House(9, true,false, "Balta", "Skolas", 21);
        majaViens.printHouse();

        House majaDivi = new House(22, false, true,"Zila", "Stabu", 33);
        majaDivi.printHouse();


        Velosipeds zzk = new Velosipeds();
        zzk.bremzuTips = 'D';
        zzk.printetAtrumu();
        System.out.println(zzk.atrums);
        System.out.println("Cilveks uzkapj uz velosipeda un min pedalus");
        zzk.spiestPedalus();
        zzk.spiestPedalus();
        zzk.spiestPedalus();
        zzk.spiestPedalus();
        zzk.printetAtrumu();
        System.out.println("Velo atrums ir" + zzk.atrums);
        System.out.println("Vajag bremzēt");
        zzk.bremzet();
        zzk.bremzet();
        System.out.println("Velo atrums" + zzk.atrums);
        Velosipeds merida = new Velosipeds();
        merida.bremzuTips = 'V';
        System.out.println("Velo atrums ir" + merida.atrums);
        merida.printetAtrumu();

        Zivs Karpa = new Zivs();
        Karpa.suga = "Karpa";
        Karpa.jurasZivs = false;
        Karpa.saldudensZivs = true;
        Karpa.svars = 1;
        System.out.println("Zivju suga" + Karpa.suga);
        System.out.println("Vai jūras zivs? " + Karpa.jurasZivs);
        System.out.println("Vai saldūdens zivs? " + Karpa.saldudensZivs);
        System.out.println("Karpa svars ir " + Karpa.svars + " kg.");


        Rinkis mansRinkis = new Rinkis();
        System.out.println(mansRinkis.PI);
        mansRinkis.radiuss = 5;
        System.out.println(mansRinkis.radiuss);
        System.out.println(mansRinkis.aprekinatLaukumu());

        Rinkis mansRinkisDivi = new Rinkis();
        System.out.println(mansRinkisDivi.PI);
        mansRinkisDivi.radiuss = 50;
        System.out.println(mansRinkisDivi.radiuss);
        System.out.println(mansRinkisDivi.aprekinatLaukumu());
        System.out.println(mansRinkisDivi.aprekinatRinkaLinijasGarumu());
        mansRinkis.prinCreatedTime();
        mansRinkisDivi.prinCreatedTime();


        Rinkis mansRinkis3 = new Rinkis(12.3);

        System.out.println(mansRinkis3.laukums);
        System.out.println(mansRinkis3.rinkaLinijasGarums);



        Suns reksis = new Suns();
        reksis.vaiRej = false;
        reksis.name = "Dingo";
        System.out.println(reksis.vaiRej);
        reksis.astesGarums = 10;
        System.out.println(reksis.name);

        Animal dzivnieks = new Animal();
        dzivnieks.name = "Dzivnieks";













    }
}

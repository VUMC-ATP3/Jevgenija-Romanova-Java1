package homework.classHomework;

public class Main {
    public static void main(String[] args) {
        System.out.println("Pirmais trīsstūris");
        Trissturis trissturisA = new Trissturis();
        trissturisA.malaA = 15;
        trissturisA.malaB = 25;
        trissturisA.malaC = 15;
        System.out.println("Trijstūra laukums " + trissturisA.aprekinatLaukumu());
        System.out.println("Vai trīsstūris ir vienādmalu - " + trissturisA.vienadMala());
        System.out.println("Vai trīsstūris ir vienādsānu - " + trissturisA.vienadSanu());


        System.out.println("Otrais trīsstūris");
        Trissturis trissturisB = new Trissturis(5,5,5);
        System.out.println("Trijstūra laukums " + trissturisB.aprekinatLaukumu());
        System.out.println("Vai trīsstūris ir vienādmalu - " + trissturisB.vienadMala());
        System.out.println("Vai trīsstūris ir vienādsānu - " + trissturisB.vienadSanu());

    }
}

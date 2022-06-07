package classroomFour;

public class House {
    int stavuSkaits;
    boolean irLifts;
    boolean irAutoStavvieta;
    String krasa;
    String ielasNosaukums;
    int majasNumurs;

    public House(int stavuSkaits, boolean irLifts, boolean irAutoStavvieta, String krasa, String ielasNosaukums, int majasNumurs) {
        this.stavuSkaits = stavuSkaits;
        this.irLifts = irLifts;
        this.irAutoStavvieta = irAutoStavvieta;
        this.krasa = krasa;
        this.ielasNosaukums = ielasNosaukums;
        this.majasNumurs = majasNumurs;
    }

    public void printHouse(){
        System.out.println("Majas adrese ir" + adrese());
        System.out.println("Maja ir" + krasa + "krasa");
        System.out.println("Maja ir" + stavuSkaits + " stavu skaits");
    }

    public String adrese(){
        return ielasNosaukums + " " + majasNumurs;

    }



}

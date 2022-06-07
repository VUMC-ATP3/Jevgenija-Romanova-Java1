package classroomFour;

import java.sql.Timestamp;

public class Rinkis {
    final double PI = 3.14;
    double radiuss;
    double laukums;
    double rinkaLinijasGarums;
    Timestamp timestamp;


    Rinkis(){
        System.out.println("Mes veidojam Rinki..");
        Long datetime = System.currentTimeMillis();
        timestamp = new Timestamp(datetime);

    }
    Rinkis(double padotaisRadiuss){
        radiuss = padotaisRadiuss;
        laukums = aprekinatLaukumu();
        rinkaLinijasGarums = aprekinatRinkaLinijasGarumu();
    }



    public void prinCreatedTime(){
        System.out.println(timestamp);
    }


    public double aprekinatLaukumu() {
        System.out.println("Aprekinat rinka laukumu");
        return Math.pow(radiuss, 2) * PI;
    }
    public double aprekinatRinkaLinijasGarumu(){
        System.out.println("Aprekinat rinka linijas garumu");
        return 2 * Math.PI * radiuss;
    }


}

package classromFive.encapsulation;

public class Main {
    public static void main(String[] args) {
        Weather weather = new Weather();
        weather.printWeather();
        //weather.metodeDivi(); - private
        weather.metodeTris();

        Human cilveks = new Human();
        Human cilveks2 = new Human();
        Human cilveks3 = new Human(12,154,"Lola");

        System.out.println(cilveks3.toString());
        cilveks3.setAge(10);
        System.out.println(cilveks3.getAge());

        Rinkis rinkis = new Rinkis();
        rinkis.setRadiuss(5);
        Rinkis rinkis2 = new Rinkis();
        rinkis2.setKrasa("zala");










    }
}

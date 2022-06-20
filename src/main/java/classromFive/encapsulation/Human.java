package classromFive.encapsulation;

public class Human {
    private int age;
    private double height;
    private String name;

    private String personalCode;

    Human() {
        System.out.println("Uztaisisim jauno cilveku");
    }

    public Human(int age, double height, String name) {
        this.age = age;
        this.height = height;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Vecums nevar but mazaks par 0");
        } else {
            this.age = age;
        }


    }
}

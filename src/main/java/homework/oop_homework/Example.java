package homework.oop_homework;

import java.util.Date;

public class Example {
    public static void main(String[] args) {
        //1
        Customer customer = new Customer("Jevgenija");
        customer.setMember(true);
        customer.setMemberType("Premium");
        System.out.println("Apmeklētājam, Premiumm biedrs " + customer.toString());

        Visit visit = new Visit(customer, new Date());
        visit.setServiceExpense(100);
        visit.setProductExpense(50);
        System.out.println("Apmeklējums" + visit.toString());


        //2
        Customer customerTwo = new Customer("Olga");
        customer.setMember(false);
        customer.setMemberType("nav biedrs");
        System.out.println("Apmeklētājs, nav kluba biedrs " + customerTwo.toString());

        Visit visitTwo = new Visit(customerTwo, new Date());
        visit.setServiceExpense(100);
        visit.setProductExpense(50);
        System.out.println("Apmeklējums " + visitTwo.toString());

        //3
        Customer customerThree = new Customer("Jeļena");
        customer.setMember(true);
        customer.setMemberType("Gold");
        System.out.println("Apmeklētājam, Gold biedrs " + customerThree.toString());

        Visit visitThree = new Visit(customerThree, new Date());
        visit.setServiceExpense(100);
        visit.setProductExpense(50);
        System.out.println("Apmeklējums " + visitThree.toString());


        //4
        Customer customerFour = new Customer("Zane");
        customer.setMember(true);
        customer.setMemberType("Silver");
        System.out.println("Apmeklētājam, Silver biedrs " + customerFour.toString());

        Visit visitFour = new Visit(customerFour, new Date());
        visit.setServiceExpense(100);
        visit.setProductExpense(50);
        System.out.println("Apmeklējums " + visitFour.toString());


    }
}

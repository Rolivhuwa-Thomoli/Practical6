

public class TestSalesperson2 {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Salesperson[] salesperson = new Salesperson[10];
        System.out.printf("%9s%20s%n","ID NUMBER", "Sales");
        for (int i = 0; i < 10; i++) {
            salesperson[i] = new Salesperson(i+111,25000+i*5000);
            System.out.printf("%9d%20.2f%n",salesperson[i].getIDNumber(),salesperson[i].getAnnualSalesAmount());
        }
    }
}
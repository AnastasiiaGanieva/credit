public class Main {

    public static void main(String[] args) {
        CreditPaymentService a = new CreditPaymentService();
        System.out.println(a.calculate(1000000, 12, 9.99));
        System.out.println(a.calculate(1000000, 24, 9.99));
        System.out.println(a.calculate(1000000, 36, 9.99));
    }
}

public class CreditPaymentService {
    public int calculate(int summaCr, int srok, double percenSt) {
        double r = (double) ((percenSt / 100) / 12);
        int platej = (int) (summaCr * ((r * Math.pow((1 + r), srok)) / (Math.pow((1 + r), srok) - 1)));
        return platej;
    }
}

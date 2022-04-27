public class CreditPaymentService {
    public int calculate(int k, double p, int m) {
        double monthlyPercent = (p / 12) / 100;
        double d = Math.pow(1 + monthlyPercent, m);


        return (int) (k * (monthlyPercent * d) / (d - 1));

    }
}

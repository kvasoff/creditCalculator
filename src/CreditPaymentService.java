public class CreditPaymentService {
    public int calculate(int amountCredit, double percent, int months) {
        double monthlyPercent = (percent / 12) / 100;
        double formula = Math.pow(1 + monthlyPercent, months);


        return (int) (amountCredit * (monthlyPercent * formula) / (formula - 1));

    }
}

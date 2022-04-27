public class Main {
    public static void main(String[] args) {
        CreditPaymentService creditPaymentService = new CreditPaymentService();
        int monthlyPaymentOne = creditPaymentService.calculate(1_000_000, 9.99, 12);
        System.out.println("Ваш ежемесячный платеж: " + monthlyPaymentOne);

        int monthlyPaymentTwo = creditPaymentService.calculate(1_000_000, 9.99, 24);
        System.out.println("Ваш ежемесячный платеж: " + monthlyPaymentTwo);

        int monthlyPaymentThree = creditPaymentService.calculate(1_000_000, 9.99, 36);
        System.out.println("Ваш ежемесячный платеж: " + monthlyPaymentThree);

    }
}

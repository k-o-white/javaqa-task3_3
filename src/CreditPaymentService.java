public class CreditPaymentService {
    public int calculate(int amount, int yearsCount, double interestRate) {
        double interestRateInMonth = (interestRate / 100) / 12;
        int monthsCount = yearsCount * 12;
        double payment = (amount * interestRateInMonth) / (1 - Math.pow((1 + interestRateInMonth), -monthsCount));
        return (int) payment;
    }
}

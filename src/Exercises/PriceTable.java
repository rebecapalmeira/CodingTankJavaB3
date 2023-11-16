package Exercises;

public class PriceTable {
    private double loan, interestRate, monthlyInstallment, outstandingBalance;
    private int timeToPay;

    public void askLoanValue() {
        System.out.println("Qual o valor do financiamento que você deseja contratar?");
    }

    public void askInterestRate() {
        System.out.println("Qual a taxa de juros anual em porcentagem?");
    }

    public void askTimeToPay() {
        System.out.println("Enquanto tempo deseja pagar? Informe em meses: ");
    }

    public void setLoan(double loan) {
        this.loan = loan;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void setTimeToPay(int timeToPay) {
        this.timeToPay = timeToPay;
    }

    private void setInitialOutstandingBalance() {
        this.outstandingBalance = this.loan;
    }

    private double calculateMonthlyInstallment() {
        this.monthlyInstallment = this.loan *
                (Math.pow(1 + this.interestRate/100, this.timeToPay) * this.interestRate/100) / (Math.pow(1 + this.interestRate/100, this.timeToPay) -1);
        return this.monthlyInstallment;
    }

    private double recalculateOutstandingBalance(double interest) {
        return this.outstandingBalance -= calculateAmortization(interest);
    }

    private double calculateAmortization(double interest) {
        return this.monthlyInstallment - interest;
    }
    private double calculateInterest() {
        return this.outstandingBalance * (this.interestRate/100);
    }
    public void generatePriceTable() {
        setInitialOutstandingBalance();
        double totalPaidInInterest = 0.0;
        double totalPaid = this.loan;
        double totalPaidInAmortization = 0.0;

        System.out.printf("Valor fixo da parcela: R$ %.2f | Saldo devedor total R$ %.2f\n\n",
                calculateMonthlyInstallment(), this.loan);

        for(int counter = 1; counter <= this.timeToPay; counter++) {
            double interest = calculateInterest();
            double amortization = calculateAmortization(interest);
            double remainingOutstandingBalance = recalculateOutstandingBalance(interest);
            System.out.printf("Parcela %d | Juros: R$ %.2f | Amortização: R$ %.2f | Saldo devedor: R$ %.2f\n",
                    counter, interest, amortization, remainingOutstandingBalance
            );

            totalPaid += interest;
            totalPaidInInterest += interest;
            totalPaidInAmortization += amortization;
        }

        System.out.printf("\nTotal pago: %.2f | Total pago de juros: R$ %.2f | Total pago em amortização: R$ %.2f \n",
                totalPaid, totalPaidInInterest, totalPaidInAmortization
        );
    }
}

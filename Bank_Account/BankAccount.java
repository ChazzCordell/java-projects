class BankAccount {
  public double checkingBalance;
  public double savingsBalance;
  public static int numberOfAccounts = 0;
  public static double totalHoldings = 0;

  public BankAccount() {
    BankAccount.numberOfAccounts +=1;
    this.checkingBalance = 0;
    this.savingsBalance = 0;
  }

  public void deposit(double amount, String account){
    if (account == "checking") {
      this.checkingBalance += amount;
    }
    else {
      this.savingsBalance += amount;
    }
    this.totalHoldings += amount;
  }

  public void withdraw(double amount, String account){
    if (account == "checking") {
      if(amount > this.checkingBalance) {
        System.out.println("Insufficient Funds");
        return;
      }
      this.checkingBalance -= amount;
    }
    else {
      if(amount > this.savingsBalance) {
        System.out.println("Insufficient Funds");
        return;
      }
      this.savingsBalance -= amount;
    }
    this.totalHoldings -= amount;
  }

  public double getCheckingBalance() {
    return this.checkingBalance;
  }
  public double getSavingsBalance() {
    return this.savingsBalance;
    }
}

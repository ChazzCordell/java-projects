class TestBankAccount {
  public static void main(String[] args) {
    BankAccount chazzBankAccount = new BankAccount();
    chazzBankAccount.deposit(600,"savings");
    chazzBankAccount.withdraw(100,"savings");

    System.out.println(chazzBankAccount.getCheckingBalance());
    System.out.println(chazzBankAccount.getSavingsBalance());
  }
}

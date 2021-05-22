public class Operations {
  
  private float transactionAmount;


  /**
   * First, write a method that intakes the amount from the main Bank Account class.
   * This method will then perform a deposit (transaction amount minus the account balance). 
   * This method will only take one parameter, the transaction amount.
   * 
   * First, the method will check whether or not it meets the requirements. Such as not letting the user deposit anything less than $1.
   * 
   * If the transaction amount meets these requirements, the transaction amount will be deposited in to the account.
   * 
   * First, the method will perform the following checklist:
   * 
   * * If the account balance after the transaction is less than or equal to $0, alert the user of the account balance.
   * 
   */

   public static float deposit(float transactionAmount, float accountBalance) {

      if (transactionAmount < 1) {
        System.out.println("Deposits valued less than $1 are not accepted.");
        return accountBalance;
      } else {
        accountBalance += transactionAmount;
        return accountBalance;
      }
   }

    /**
    * Secondly, write a method that intakes the amount from the main Bank Account class.
    * 
    * This method will only take one parameter, the transaction amount.
    * 
    * This method will be used to perform withdrawls (the transaction amount added onto the account balance). 
    * 
    * * If the account balance contains less than the transaction amount AND the account balance is less than zero (0), deny the transaction
    * * If the account balance after the transaction is less than or equal to $-1, deny the transaction.
    * * If the account balance after the transaction is less than $50, perform the transaction AND alert the user of the low balance.
    * 
    * 
    */

    public static float withdraw(float transactionAmount, float accountBalance) {

      if ((accountBalance < transactionAmount) && (accountBalance < 0)) {
        System.out.println("Please enter an amount greater than your available balance");
        return accountBalance;
      } else if (accountBalance - transactionAmount <= -1) {
        System.out.println("This account has been overdrafted. Please pay off the balance");
        return accountBalance;
      } else if (accountBalance - transactionAmount <= 50) {
        accountBalance -= transactionAmount;
        System.out.println("ALERT! Please be aware that your current balance is $" + accountBalance + ". Proceed with caution to avoid an overdraft.");
        return accountBalance;
      } else {
        accountBalance -= transactionAmount;
        return accountBalance;
      }

    }


}

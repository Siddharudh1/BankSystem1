public class ATM {
	public static AccountOperation acc = null;
	public static void viewBalance(String username,long pin) {
		for(Account ele : acc.L1) {
			if(ele.getUsername().contains(username) && pin == Account.getPin()){
				System.out.println("Current balnce is : "+ele.getBalance());
			}
			else throw new IllegalArgumentException("Username or pin mismatch");
		}
	}
	
	public static void withdrawMoney(String username,long pin,double amount) {
		for(Account ele : acc.L1) {
			if(ele.getUsername().contains(username) && pin == Account.getPin() && amount > ele.getBalance()){
				double bal = ele.getBalance();
				ele.setBalnce(bal - amount);
				System.out.println("balance is :"+bal);
			}
			else throw new IllegalArgumentException("Username or pin mismatch or insufficient money to withdraw");
		}
	}
}

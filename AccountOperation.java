
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class AccountOperation {
	static List<Account> L1 = new ArrayList<Account>();
	
	public static void CreateCustomerAccount(String FirstName,String Username,String LastName,int Age,String Address,String MobileNumber,String EMailID,String Dateofbirth) {
		long pin = (long) (Math.random()*10000);
		System.out.println("Pin generated randomly "+pin);
		long accNumber = (long)(Math.random()*1000000000);
		System.out.println("Account Number :"+accNumber);
		Account a1 =new Account(FirstName,Username,LastName,Age,Address,MobileNumber,EMailID,Dateofbirth,accNumber,pin);
		L1.add(a1);
	}
	
	public static void addMoney(String username,double amount) {
		for(Account ele : L1) {
			if(ele.getUsername().equals(username)) {
				double bal = ele.getBalance(); 
				ele.setBalnce(bal+amount); 
				System.out.println("Amount credited : "+ele.getBalance());
			}
			else throw new IllegalArgumentException("USERNAME MISMATCH.....");
		}
	}

	public static void withDrawMoney(String username,double amount) {
		for(Account ele : L1) {
			if(ele.getUsername().equals(username) && amount < ele.getBalance()) {
				double bal = ele.getBalance();
				ele.setBalnce(bal - amount);
				System.out.println("Amount "+amount+ "withdraw successfully ");
			}
			else 
				throw new IllegalArgumentException("USERNAME MISMATCH..... or insufficient balance to withdraw");
		}
	}
	public static void closeAccount(String userName, long l) {
		java.util.Iterator<Account> it = L1.iterator();
		
		while (it.hasNext()) {
			Account ele = it.next();
			if(ele.getUsername().equals(userName) && ele.getPin() == l) {
				it.remove();
			}
		}
		System.out.println("The user account got successfully deactivated...");	
	}
}

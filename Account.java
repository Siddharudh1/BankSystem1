
public class Account {
	private String FirstName;
	private static String Username;
	private String LastName;
	private int Age;
	private String Address;
	private String MobileNumber;
    private String EMailID;
	private String Dateofbirth;
	private long AccountNumber;
	private double Minbalance,balance;
	private static long pin;
	public static long getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public double getMinbalance() {
		return Minbalance;
	}
	public void setMinbalance(double minbalance) {
		if(minbalance < 0 )
			throw new IllegalArgumentException("Balnce should not be less than zero");
		else Minbalance = minbalance;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalnce(double balance) {
		if(balance<0)
			throw new IllegalArgumentException("Balnce should not be less than zero");
		else this.balance = balance;
	}
	public long getAccountNumber() {
		return AccountNumber;
	}

	public Account(String firstName, String username, String lastName, int age, String address, String mobileNumber,
			String eMailID, String dateofbirth,long accNumber,long pin2) {
		super();
		FirstName = firstName;
		Username = username;
		LastName = lastName;
		Age = age;
		Address = address;
		MobileNumber = mobileNumber;
		EMailID = eMailID;
		Dateofbirth = dateofbirth;
		this.AccountNumber = accNumber;
		this.pin =pin2;
	}
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		if(firstName.contains(null) &&firstName.trim().equals(" "))
			throw new IllegalArgumentException("firstName should not be null or empty");
		else FirstName = firstName;
	}
	public static String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		if(username.contains(null) && username.trim().equals(" "))
			throw new IllegalArgumentException("username should not be null or empty");
		else Username = username;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		if(lastName.contains(null) && lastName.trim().equals(" "))
			throw new IllegalArgumentException("username should not be null or empty");
		else LastName = lastName;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		if(age < 0 || age > 100)
			throw new IllegalArgumentException("Age should be greater than zero");
		else Age = age;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		if(address.contains(null) && address.trim().equals(" "))
			throw new IllegalArgumentException("address should not be null or empty");
		Address = address;
	}
	public String getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		if(mobileNumber.length() > 10)
			throw new IllegalArgumentException("invalid mobile numnber");
		else MobileNumber = mobileNumber;
	}
	public String getEMailID() {
		return EMailID;
	}
	public void setEMailID(String eMailID) {
		if(eMailID.contains(null) && eMailID.trim().equals(" "))
			throw new IllegalArgumentException("eMailID should not be null or empty");
		else EMailID = eMailID;
	}
	public String getDateofbirth() {
		return Dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
		Dateofbirth = dateofbirth;
	}
	
}

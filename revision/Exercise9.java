package revision;
abstract class Bank{
	protected int balance;
	abstract void getBalance();
}
class BankA extends Bank{
	void getBalance() {
		balance = 100;
		System.out.println("Bank A : $"+balance);
	}
}
class BankB extends Bank{
	void getBalance() {
		balance = 150;
		System.out.println("Bank B : $"+balance);
	}
}
class BankC extends Bank{
	void getBalance() {
		balance = 200;
		System.out.println("Bank C : $"+balance);
	}
}
public class Exercise9 {
	public static void main(String args[]) {
		BankA a = new BankA();
		a.getBalance();
		BankB b = new BankB();
		b.getBalance();
		BankC c = new BankC();
		c.getBalance();
		
	}

}

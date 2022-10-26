package week3.day1;

public class AxisBank {
	public void deposit() {
		System.out.println("AxisBank class --> Deposit Over ridden");
	}

	public static void main(String[] args) {

		AxisBank Object = new AxisBank();
		Object.deposit();

		Object.saving();
		Object.fixed();
	}

	private void fixed() {

		System.out.println("Fixed------> Account balance is 22,459.97");

	}

	private void saving() {

		System.out.println("savings----> Fixed deposit : 5800");

	}
}

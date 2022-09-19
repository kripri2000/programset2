package interfaceex;

interface RBIBank{
	float rateOfInterest();
}

class SBI implements RBIBank{
	public float rateOfInterest() {
		return 9.15f;
	}
}
class ICI implements RBIBank{
	public float rateOfInterest() {
		return 9.7f;
	}
}

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RBIBank rbi = new SBI();
		System.out.println("Rate of Interest : "+ rbi.rateOfInterest());

	}

}

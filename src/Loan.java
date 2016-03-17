
public class Loan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PersnonalLoa pl= new DerivedLoan();
		System.out.println(pl.calculate(3));
		pl.displayLoanType();
				
	}

}

class PersnonalLoa
{
	private void displayLoanType()
	{
		System.out.println("Personal loan");
	}
	
	int calculate(int i)
	{
		return i*3;
	}
	
}

class DerivedLoan extends PersnonalLoa
{
	private void displayLoanType()
	{
		System.out.println("Derived loan");
	}
	
	void test()
	{
		System.out.println("Test");
	}
	int calculate(int i)
	{
		return i*3*4;
	}
}
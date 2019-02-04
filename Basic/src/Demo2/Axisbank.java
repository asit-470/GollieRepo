package Demo2;

public class Axisbank implements Usbank,Indiabank{

	@Override
	public void homeloan() {
		// TODO Auto-generated method stub
		System.out.println("indiabank home loan");
	}

	@Override
	public void educationloan() {
		// TODO Auto-generated method stub
		System.out.println("indiabank education loan");
	}

	@Override
	public void carloan() {
		// TODO Auto-generated method stub
		System.out.println("indiabank car loan");
	}

	@Override
	public void credit() {
		// TODO Auto-generated method stub
		System.out.println("Us bank credit");
	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("Us bank debit");
	}

	@Override
	public void trading() {
		// TODO Auto-generated method stub
		System.out.println("us bank treading");
	}
	public void insurance() {
		System.out.println("own method axis bank insurance");
	
	}

}

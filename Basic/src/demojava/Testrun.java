package demojava;

public class Testrun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bmw b=new Bmw() ;//static pollymerpyism
	b.start();
	b.stop();
	b.threadsafty();
    b.refuel();
    System.out.println("*****************************************************************************");
    System.out.println("*****************************************************************************");	
    Car c=new Car();
    c.start();
c.stop();
c.refuel();

   System.out.println("*****************************************************************************");
   System.out.println("*****************************************************************************");
   Car c1= new Bmw();
    c1.start();
    c1.stop();
    c1.refuel();


}}

package Basicabstraction;

public class Testabstract extends Shape 
    {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Shape s=new Testabstract();
		
		s.color();
		s.drawing();
	}

	@Override
	void drawing() 
	{
		// TODO Auto-generated method stub
		System.out.println("drawing---------------");
	}

}

package demojava;

public class Constructureconcept {
public Constructureconcept(){
		System.out.println("defult constructor");
	}
public Constructureconcept(int i){
	System.out.println(i);
}
public Constructureconcept(int k,int q){
	System.out.println(k+"   --  "+q);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructureconcept c=new Constructureconcept();
		Constructureconcept c1=new Constructureconcept(10);
		Constructureconcept c2=new Constructureconcept(10,11);
	}
	
	
}

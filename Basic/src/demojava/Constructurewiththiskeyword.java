package demojava;

public class Constructurewiththiskeyword {
String name;
int age;
public Constructurewiththiskeyword(String name,int age) {
	//this.name=name;
	//this.age=age;
System.out.println(name);
System.out.println(age);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructurewiththiskeyword t = new Constructurewiththiskeyword("asit",28);
	}

}

package demojava;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList arr =new ArrayList();//non generic 

arr.add(100);
arr.add(200);
arr.add(300);
arr.add(400);
arr.add(500);
arr.add(600);
arr.add(700);
arr.add(800);
//System.out.println(arr.size());

arr.add("Asit");
arr.add("Kumar");
arr.add("Nayak");
//System.out.println(arr.size());
for(int i=0;i<arr.size();i++) {
	System.out.println(arr.get(i));
	ArrayList<Integer> arr1=new ArrayList<Integer>();//generic array list
	arr1.add(12);
	arr1.add(13);
	for(int j=0;j<arr1.size();j++) {
		System.out.println(arr1.get(j));
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^");
		ArrayList<String> arr5=new ArrayList<String>();//generic array list
		arr5.add("asit");
		arr5.add("kumar");
		arr5.add("Nayak");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^");
		ArrayList<String> arr6=new ArrayList<String>();//generic array list
		arr6.add("qa");
		arr6.add("QA");
		arr6.add("Qc");
		arr5.addAll(arr6);
		//for(int m=0;m<arr5.size();m++)
		//{
		//	System.out.println(arr5.get(m));
		//}
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>");
		Iterator<String> it=arr5.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
	}
}
	}

}

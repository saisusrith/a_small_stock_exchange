import java.util.*;
import java.io.*;
import java.util.Vector;

class sai{
public int t0;
public int texp;
public String name;
public String type;
public int quantity;
public String productname;
public int price;
public String partial;
public boolean partial1;
}

class sai1 extends sai implements Runnable{
public Vector<sai> vin=new Vector<sai>();
public void run(){
int i=0;

HashMap<String,Boolean> hm =new  HashMap<String,Boolean>();
hm.put("T",true);
hm.put("F",false);

	
    try{
	FileInputStream inputfile =new FileInputStream("input1.txt");
	
	Scanner v = new Scanner(inputfile);

	while(v.hasNext())
	{

		sai object = new sai();
		object.t0=v.nextInt();
		object.name=v.next();
		object.texp=v.nextInt();
		object.type=v.next();
		object.quantity=v.nextInt();
		object.productname=v.next();
		object.price=v.nextInt();
		object.partial=v.next();
		object.partial1 = hm.get(object.partial);
		vin.add(object);

		}


	}
	
	
		catch(InputMismatchException bbbbb)
		{
		System.out.println("wrong format");
		}
	catch(FileNotFoundException aaaaa)
	{
	System.out.println("file not found");
}
/*
catch(FileNotFoundException aaaaa)
{
System.out.println("file not found");
}
*/
//  sai dummy = new sai();

//   Iterator<sai> it= vin.iterator();
//   while(it.hasNext()){
//  dummy = it.next();
//  System.out.println(dummy.t0+" "+dummy.name);
// } 

}

}

















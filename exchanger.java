import java.util.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;



/*
public cleanup(long t , long p)

public static void cleaner(Queue<vineet> six)
{


Iterator<sai> lit = six.iterator();
// ListIterator<sai> lit = fg.listIterator();
while(lit.hasNext())
{


System.out.println(lit.next().name);

}
}


public static void cleaner(Queue<sai> six)
{

Iterator<sai> lit = six.iterator();
// ListIterator<sai> lit = fg.listIterator();
while(lit.hasNext())
{


System.out.println(lit.next().name);

}
}*/
class exchanger extends cleanup implements Runnable
{

	
 	//cleanup xyz1 = new cleanup();
//  	Thread tclean = new Thread(xyz1);

	public static int update(int a,int b){
        
	int c = b-a;
	return c;
	}
	 Vector<sai> vtra=new Vector<sai>();
	public exchanger(Vector<sai> asdf)
	{
	vtra = asdf;

	}
	  public long t = 0L;
	  public long p = 0L;

	 Vector<Integer> tet = new Vector<Integer>();
	public Vector<Integer> tet1 = new Vector<Integer>();
	public  Vector<Integer> tet2 = new Vector<Integer>();

	public void run(){
		int i=0;
		int jkl=0;
		Queue<sai> sellingqueue = new LinkedList<sai>();
		Queue<sai> buyingqueue = new LinkedList<sai>();
		int len = vtra.size();
		sai dummy = new sai();
		int d1=0;
	// 	System.out.println((it1.next()).name);
		t= System.currentTimeMillis();
		Iterator<sai> it1 = vtra.iterator();
			
		while(it1.hasNext()){		  
			  dummy = it1.next();
			  int d=dummy.t0;
			  int xyz=update(d1,d);
			  try{
				Thread.sleep(xyz*1000);
			  }

			  catch(InterruptedException blabla){
			  
			  }
			  
			  
		// 	  System.out.println(dummy.name);
			  
			  
			  if((dummy.type).equals("buy")){
				buyingqueue.add(dummy);
// 				System.out.println("its buy one");
				
                                     tet1.add(dummy.t0+dummy.texp);	  
			  }
			  else{
				sellingqueue.add(dummy);
// 				System.out.println("its sell");
				tet2.add(dummy.t0+dummy.texp);
			}
			
			p=System.currentTimeMillis()-t;
//			System.out.println(p);

			
			
			if(buyingqueue.size()>0){
// 			System.out.println("going in buy");
			 cleaner1(buyingqueue,p,t,tet1);}
			
			if(sellingqueue.size()>0){
// 			System.out.println("going in sell");

			cleaner2(sellingqueue,p,t,tet2);
			}
			/*exchanging algo to be made*/
			
			
			
		d1=d;
		jkl++;
		}
	}
}



	

	
	
	
	
	
	
	
	
	
	
	

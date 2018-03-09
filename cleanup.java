import java.util.*;
import java.lang.*;

class cleanup  implements Runnable
{

public  static void cleaner1(Queue<sai> buyingqueue,long p, long t, Vector<Integer> tet1)
{
Iterator<sai> lit = buyingqueue.iterator();
// System.out.println(p);

// System.out.println(lit.next().name);
int j=0;
      sai dummy = new sai();
	while(lit.hasNext()){
	dummy =lit.next();
	if(tet1.get(j)*1000<p){
	System.out.println("dequeued buying queue expired element "+dummy.name);
	
	lit.remove();
	tet1.remove(j);
	j--;
	}
	j++;
	}
// 	else continue;
 }
      
public  static void cleaner2(Queue<sai> sellingqueue,long p, long t,Vector<Integer> tet2)
{
Iterator<sai> lit = sellingqueue.iterator();
// System.out.println(p);

// System.out.println(lit.next().name);
int j=0;
      sai dummy = new sai();
      while(lit.hasNext()){
      	dummy =lit.next();

	if(tet2.get(j)*1000<p){
	
	System.out.println("dequeued selling queue expired element "+dummy.name);
	    lit.remove();
	    tet2.remove(j);
	   j--;
	}
	 j++;
// 	else continue;
      }	
}


// ListIterator<sai> lit = fg.listIterator();

public void run()
{
System.out.println("cleanup Thread");
}


}



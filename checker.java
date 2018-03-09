import java.util.*;
import java.io.*;
import java.lang.*;
public class checker{

// public static Vector<vineet> vin2 = new Vector<vineet>();

public static void main(String args[]){
 vineet1 objk = new vineet1();
Thread t1 = new Thread(objk);
t1.start();

try{

t1.join();
/*
Thread.sleep(1000);
System.out.println(Thread.currentThread().getName());
}*/
catch(InterruptedException bb)
{
System.out.println("really");
}

exchanger exchangethread = new exchanger(objk.vin);
Thread t2 = new Thread(exchangethread);

cleanup clr=new cleanup();
// exch.p,exch.t);
// ,exch.tet1,exch.tet2);

// vin2 = objk.vin;
t2.start();

Thread t3=new Thread(clr);
t3.start();
}

}

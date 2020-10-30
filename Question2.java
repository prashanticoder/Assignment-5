import java.util.*;
class Multithread implements Runnable
{ 
int a;
public Multithread(int a){
    this.a = a;
}

public void run()
{
    add();
}

public void add()
{
    Random rand = new Random();
    int  n = rand.nextInt(10) + 1;
    System.out.println("number generated:" + n); 
    synchronized (this)
    {
    	a+=n;
    }
}
}
public class Question2 {
public static void main(String[] args) {
	int base = 0;
	Multithread sum1 = new Multithread(base);
    Thread t1 = new Thread(sum1);
    Thread t2 = new Thread(sum1);
    Thread t3 = new Thread(sum1);
    Thread t4 = new Thread(sum1);
    Thread t5 = new Thread(sum1);
    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();
    try {
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    System.out.print("result: " + sum1.a);
}
}


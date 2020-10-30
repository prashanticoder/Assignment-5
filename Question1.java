class MultiThreading implements Runnable
{
	private Thread thread;

	@Override
	public void run() {
		for(int i=0;i<100;i++)
		{
		System.out.println("thread name:"+Thread.currentThread().getName()+":"+i);
		
	}
	}
	
}
public class Question1 {
public static void main(String[] args) {
	MultiThreading job=new MultiThreading();
	Thread thread1=new Thread(job,"thread1 name");
	Thread thread2=new Thread(job,"thread2 name");
	Thread thread3=new Thread(job,"thread3 name");
	thread1.start();
	thread2.start();
	thread3.start();
	
}
}

package Multithreading;

public class Multithreading1 extends Thread{

public void run() {
	
System.out.println("i am running");
String name= Thread.currentThread().getName();
System.out.println("run thread "+name);


for(int i=0;i<10;i++)
{
	System.out.println(name+" "+i + "playing music");
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}

public static void main(String[] args) {

	Multithreading1 d=new Multithreading1();
	d.start();
	//d.run();
	
	String name= Thread.currentThread().getName();
	System.out.println("main thread "+name);

	for(int i=0;i<10;i++)
	{
		System.out.println(name+" "+i+" counting score");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	}
}

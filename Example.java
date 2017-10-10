package threadexample;
//here we cretaed package as my which that organizes a set of related classes and interfaces.
public class Example extends Thread {
//An interface can extends another interface in the same way class can extend the class
//The extends keyword extend an interface and the child interface inherits the methods of parent
//interface
//created class names as Example which extends thread to implement thread class
	public void run()
	//extending the thread class is required to override run() method
	//here it contains actual logic to run
	//public keyword is used in the declaration of a class,method or 
	//field;public classes,method and fields can be accessed by the 
	//members of any class.
	//void is used to define the return type of the method
	//public void run-if this thread object was instantiated using a runnable 
	//target, the run() method is invoked on that runnable
	
	/*here we create run method which will execute when thread is
	 * Called
	 */
	
	{
/*the code is prone to exceptions is placed in the try block
*when exception occurs that exception occurred is handled by the 
*catch block associated with it
*/
		for(int n=1;n<=10;n++){
			//loop will go for 10 times
			//here sleep() it makes current executing thread to sleep
			//for a specified interval of time. Time is in milli seconds.
			//sleep method throws InterruptedException
			try
		{
				Thread.sleep(3000);
	//here thread will sleep for every given no.of seconds
		}
		catch(InterruptedException e)
		{
	//if not it will get interrupted or terminated		
		}
//system is final class
//out is a static member of system class and type printStream
//println is method of printStream class.ln means nextline
				
		System.out.println("Welcome to Acadgild");
		//it will print for 3 seconds
	}
}
	public static void main(String[] args) {
		//static is used for memory management
		//void is used to define the return type of the method
		//String[] args is actually an array of java.lang.String type and it's name is args here
			
		// TODO Auto-generated method stub
		Example object=new Example();//new object is created
		object.start();//thread gets started.
	}

}
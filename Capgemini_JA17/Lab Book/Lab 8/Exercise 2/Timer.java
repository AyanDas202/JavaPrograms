package Lab8;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author AYAN
 *
 */

public class Timer implements Runnable{
	
	// synchronized display method to display the present time 
	public synchronized void display() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		System.out.println(sdf.format(date));
	}
	
	@Override
	public void run() {
		System.out.print("Time Now : ");
		while(true) {
			try {
				display();
				Thread.sleep(5000);
				System.out.print("Time after 5 seconds : ");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
  //main method
	public static void main(String[] args) {
    
		Timer threadtimer=new Timer();
		Thread thread=new Thread(threadtimer);
		thread.start();
	}
}
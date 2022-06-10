package pkg;
import java.util.Scanner;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Time {
    

	int secondsPassed = 100;
	Timer r = new Timer();
	TimerTask t = new TimerTask(){
		public void run(){
			secondsPassed--;
			System.out.println("You have: " + secondsPassed + " seconds left.");
		}
	};
	
	public void countTime(){
	   	r.scheduleAtFixedRate(t,1000,1000);
	}
}
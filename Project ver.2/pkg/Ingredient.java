package pkg;
import java.util.Scanner;
import java.util.Random;

public class Ingredient {
	String name;
	int amount; 
	
	public Ingredient(String a, int b){
		name = a;
		amount = b;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAmount(){
		return amount;
	}
	
	public void addAmount(int c){
		amount = amount + c;
	}
	
}




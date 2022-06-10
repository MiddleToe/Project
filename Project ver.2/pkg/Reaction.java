package pkg;
import java.util.Scanner;
import java.util.Random;

public class Reaction {
	
	String catalyst;
	String reagentOne;
	String reagentTwo;
	int oneAmount;
	int twoAmount;
	String product;
	
	public Reaction(Ingredient a, Ingredient b, Ingredient c){
	    reagentOne = a.getName();
	    reagentTwo = b.getName();
	    catalyst = c.getName();
	    oneAmount = a.getAmount();
	    twoAmount = b.getAmount();
	}
	
	public Reaction(Ingredient a, Ingredient b){
	    reagentOne = a.getName();
	    reagentTwo = b.getName();
	    oneAmount = a.getAmount();
	    twoAmount = b.getAmount();
	}
	
	public boolean Synthesize(){
	    if(catalyst.equals("Thorium Dioxide")){
	        if(reagentOne.equals("Phenylacetic Acid")){
	            if(reagentTwo.equals("Acetic Acid")){
	            	product = "Phenylacetone";
	                return true;
	            }
	        }
	    }
	    else{
	        return false;
	    }
	    return false;
	}
	
	public boolean React(){
	    if(catalyst.equals("Aluminosilicate")){
	        if(reagentOne.equals("Ammonia")){
	            if(reagentTwo.equals("Methanol")){
	            	product = "Methylamine";
	                return true;
	            }
	        }
	    }
	    else{
	        return false;
	    }
	    return false;
	}
	public String getProduct(){
		return product;
	}
	
	public String getReagentOne(){
		return reagentOne;
	}
	public String getReagentTwo(){
		return reagentTwo;
	}
	
	public int getOneAmount(){
		return oneAmount;
	}
	
	public int getTwoAmount(){
		return twoAmount;
	}
}



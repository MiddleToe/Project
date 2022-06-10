package pkg;
import java.util.Scanner;
import java.util.Random;


public class Meth {
    
   int purity;
   int amount;
   int price;
   
    
		public Meth(Phenylacetone a, Methylamine b){
			purity = 100 - (a.getContamination() + b.getContamination());
			amount = (a.getAmount() + b.getAmount())/2;
		}
		
		public int getPurity(){
		    return purity;
		}
		
		public int getAmount(){
		    return amount;
		}
		
		public int getPrice(){
			price = (purity * 10)*amount;
			return price;
		}
}



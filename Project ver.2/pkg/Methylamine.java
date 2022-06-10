package pkg;
import java.util.Scanner;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Methylamine{
    
    String name;
    int amount;
    Random rand = new Random();
    int contamination = rand.nextInt(10)+1;
    
    public Methylamine(Reaction a){
        name = "Methylamine";
        amount = (a.getOneAmount() + a.getTwoAmount())/2;
    }
    
    
    public String getName(){
        return name;
    }
    
    public int getAmount(){
        return amount;
    }
    
    public int getContamination(){
        return contamination;
    }
    
    

}
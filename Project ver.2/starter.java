import pkg.*;
import java.util.Scanner;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Make sure to type in lowercase only");
	System.out.println("Press s to begin cooking your first ingredient, Phenylacetone.");
	String aa = sc.nextLine();
		if(aa.equals("s")){
				System.out.println("You have begun cooking Phenylacetone.");
				System.out.println("Now choose a catalyst. Press a to choose Benzene, b to choose Aluminosilicate, and c to choose Thorium Dioxide.");
				String cc = sc.nextLine();
				if(cc.equals("a")){
					System.out.println("You have chosen Benzene.");
					System.out.println("Now choose a pair of reactants.");
					System.out.println("Press a for Hydrochloric acid and sulfuric acid, b for Phenylacetic and Acetic Acid, and c for oxalic and carbonic acid.");
					String dd = sc.nextLine();
					System.out.println("Your reactants and catalyst have reacted and exploded! You have died in the process.");
				}
				else if(cc.equals("b")){
					System.out.println("You have chosen Aluminosilicate.");
					System.out.println("Now choose a pair of reactants.");
					System.out.println("Press a for Hydrochloric acid and sulfuric acid, b for Phenylacetic and Acetic Acid, and c for oxalic and carbonic acid.");
					String dd = sc.nextLine();
					System.out.println("Your reactants and catalyst have reacted and exploded! You have died in the process.");
				}
				else if(cc.equals("c")){
					System.out.println("You have chosen Thorium Dioxide.");
					Ingredient a = new Ingredient("Thorium Dioxide", 5);
					System.out.println("Now choose a pair of reactants.");
					System.out.println("Press a for Hydrochloric acid and sulfuric acid, b for Phenylacetic and Acetic Acid, and c for oxalic and carbonic acid.");
					String dd = sc.nextLine();
					Ingredient b = new Ingredient("Phenylacetic Acid", 5);
					Ingredient c = new Ingredient("Acetic Acid", 5);	
						if(dd.equals("b")){
							Reaction q = new Reaction(b,c,a);
							Phenylacetone p = new Phenylacetone(q);
							System.out.println(p.getName() + " has been created, with a contamination of " + p.getContamination() + "%.");
							System.out.println("Now choose a catalyst for your Methylamine.");
							System.out.println("Press a to choose the remaining Benzene or b to choose the remaining Aluminosilicate.");
							String ee = sc.nextLine();
								if(ee.equals("a")){
								System.out.println("How choose your reactants. Press a to pick the Ammonia and Methanol, b for Hydrogen Peroxide and Isopropyl Alcohol, and c for Hydrazine and Sodium Carbonate.");
								String ff = sc.nextLine();
								System.out.println("Your reactants have spontaneously combused, killing you in the process!");
								}
								else if(ee.equals("b")){
								Ingredient o = new Ingredient("Aluminosilicate",5);
								System.out.println("How choose your reactants. Press a to pick the Ammonia and Methanol, b for Hydrogen Peroxide and Isopropyl Alcohol, and c for Hydrazine and Sodium Carbonate.");
								Ingredient m = new Ingredient("Ammonia",5);
								Ingredient n = new Ingredient("Methanol",5);
								String ff = sc.nextLine();
									if(ff.equals("a")){
										Reaction r = new Reaction(m,n,o);
										Methylamine g = new Methylamine(r);
										System.out.println(g.getName() + " has been created with a contamination of " + g.getContamination() + "%.");
										System.out.println("You now have created Meth!");
											Meth y = new Meth(p,g);
											System.out.println("You have created " + y.getAmount() + " pounds of meth.");
											System.out.println("It is worth " + y.getPrice() + " dollars.");
										
										}
									else{
										System.out.println("Your reactants reacted with your catalyst but it blew up! You died.");
									}
								}
						}
				}
				
			}

	
	
	
	
	
	








	




	
	
	
	}
}

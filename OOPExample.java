
import java.util.Scanner;
public class OOPExample {
    public static void main(String[] args){
    	boolean endgame=false;
    	boolean cheatmode = false;
    	while(!endgame){
    		
    		CPU cpu1=new CPU();
    		Scanner sc1 = new Scanner(System.in);
        	boolean validmove = false;
        	boolean exit = false;
        	String userMove ="";
        	while(!validmove){
        		System.out.println("Input your move (rock, paper or scissors): ");
        		userMove=sc1.nextLine();
        		userMove=userMove.toLowerCase();
        		if(userMove.equals("end")) {
        			endgame=true; break;
        		}
        		else if(userMove.equals("cheatmode")){
        			while(!exit){
        				System.out.println("Please input the key:");
            			userMove=sc1.nextLine();
            			if(userMove.equals("Mavericrab")){
            				System.out.println("You are the boss!");
            				cheatmode=true;
            				exit=true;
            			}
            			else if(userMove.equals("endcheatmode")){
            				System.out.println("You are a honest person!");
            				cheatmode=false;
            				exit=true;
            			}
            			else if(userMove.equals("exit")){
            				System.out.println("Maybe next time!");
            				exit=true;
            			}
            			else{
            			    System.out.println("You got the wrong key!");
            			}
        			}
        			
        		}
        		else if(userMove.equals("rock")||userMove.equals("paper")||userMove.equals("scissors")) {
        			validmove=true;	
        		}
      
        	}
        	
        	if(!endgame){
        		String CPUMove = cpu1.getCPUMove(cheatmode,userMove);
        	    cpu1.comparemoves(CPUMove, userMove);
        	}
        	else System.out.println("See you next time!");
    	}
    	
    	
    }
}

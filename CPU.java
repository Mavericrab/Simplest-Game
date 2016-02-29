
public class CPU {

	public String getCPUMove(boolean cheatmode,String userMove) {
		int choice=(int) Math.floor(Math.random()*3);
		String CPUMove=new String();
		if(!cheatmode){
			switch (choice){
			case 0:CPUMove="rock";break;
			case 1:CPUMove="paper";break;
			default:CPUMove="scissors";break;
			}
		}
		else {
			if(userMove.equals("paper")) CPUMove="rock";
			if(userMove.equals("rock")) CPUMove="scissors";
			if(userMove.equals("scissors")) CPUMove="paper";
		}
		return CPUMove;
	}

	public void comparemoves(String CPUMove, String userMove) {
		System.out.println("Let's see who's gonna win!");
		if(CPUMove.equals(userMove)) outputmoves(CPUMove,"Tie!");
		else if(CPUMove.concat(userMove).equals("rockpaper")||CPUMove.concat(userMove).equals("paperscissors")||CPUMove.concat(userMove).equals("scissorsrock")) outputmoves(CPUMove,"You win!");
		else if(userMove.concat(CPUMove).equals("rockpaper")||userMove.concat(CPUMove).equals("paperscissors")||userMove.concat(CPUMove).equals("scissorsrock")) outputmoves(CPUMove,"I win!");
	}
	public void outputmoves(String cpuout, String status){
		System.out.println("I played "+cpuout+"."+status+"\n");		
	}

}

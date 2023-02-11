package jdr;
import java.util.Scanner;
import entity.Hero;
import entity.Monster;

public class Main{
	 public static void main(String[] args) {	
		 
			//*****************************************************************************
			//**************************     Initialisation     ***************************
			//*****************************************************************************
		 
		 char[][] mapentity = {
				 {'/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','S',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','P',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/',},
		 };
		 
		 char[][] map = {
				 {'/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/',},
				 {'/','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','/',},
				 {'/','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','/',},
				 {'/','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','/',},
				 {'/','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','/',},
				 {'/','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','/',},
				 {'/','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','/',},
				 {'/','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','/',},
				 {'/','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','/',},
				 {'/','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','/',},
				 {'/','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','/',},
				 {'/','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','/',},
				 {'/','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','/',},
				 {'/','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','/',},
				 {'/','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','/',},
				 {'/','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','/',},
				 {'/','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','/',},
				 {'/','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','/',},
				 {'/','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','/',},
				 {'/','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','/',},
				 {'/','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','/',},
				 {'/','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','/',},
				 {'/','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','/',},
				 {'/','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','/',},
				 {'/','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','/',},
				 {'/','.','.','.','.','.','.','.','.','.','.','.','.','X','X','.','.','.','.','.','.','.','.','.','.','.','.','.','.','/',},
				 {'/','.','.','.','.','.','.','.','.','.','.','.','.','X','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','/',},
				 {'/','.','.','.','.','.','.','.','.','.','.','.','.','X','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','/',},
				 {'/','.','.','.','.','.','.','.','.','.','.','.','.','X','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','/',},
				 {'/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/',},
		 };
		 
		 boolean ConstantMap = true;
		 boolean IsClass = false;
		 boolean SlimeFight = false;
		 
		 Monster Slime1 = new Monster('S', "Slime1", 26, 15, 10, 40, 0);
		 
		 
		 
		 
		//*****************************************************************************
		//****************************     Difficulty     *****************************
		//*****************************************************************************	
		 	boolean DIfficulty = false;
	        while (DIfficulty == false) {
	        	
				Scanner scan4 = new Scanner(System.in);
		        System.out.print("\n");
		        System.out.print("choisisez le niveau de difficulté : ");
		        System.out.print("\n");
		        System.out.print("- Easy");
		        System.out.print("\n");
		        System.out.print("- Normal");
		        System.out.print("\n");
		        System.out.print("- Hard");
		        System.out.print("\n");
		        String Diff = scan4.nextLine();
		        
		        if (Diff.equals("Easy")) {
		        	DIfficulty = true;
		        }
		        if (Diff.equals("Normal")) {
		        	DIfficulty = true;
		        }
		        if (Diff.equals("Hard")) {
		        	DIfficulty = true;
		        }
		        
	        }
		 
		 
//*****************************************************************************
//*******************************     HERO     ********************************
//*****************************************************************************	
	        while (IsClass == false) {
				Scanner scan = new Scanner(System.in);
		        System.out.print("\n");
		        System.out.print("choisisez votre classe : ");
		        System.out.print("\n");
		        System.out.println("- Paladins");
		        System.out.println("- Archer");
		        System.out.println("- Chevalier");
		        System.out.println("- Mage");
		        System.out.println("- Assassin");
		        System.out.print("\n");
		        System.out.println("if you want more information on the class tape 'NameClass info'");
		        System.out.print("\n");
		        String classs = scan.nextLine();
		        
		        if (classs.equals("Paladins")){Hero Hero = new Hero('P',"Paladins",28,15,20,120,50);IsClass = true;}
		        if (classs.equals("Paladins info")){System.out.println("Dommage : 20, LifePoint : 120 defence : 50, good at sword and user of heal magic");}
		        
		        if (classs.equals("Archer")){Hero Hero = new Hero('P',"Archer",28,15,40,80,20);IsClass = true;}
		        if (classs.equals("Archer info")){System.out.println("Dommage : 20, LifePoint : 120 defence : 50, powerfull user of magic");}
		        
		        if (classs.equals("Chevalier")){Hero Hero = new Hero('P',"Chevalier",28,15,30,100,40);IsClass = true;}
		        if (classs.equals("Chevalier info")){System.out.println("0,0,30,100,40");}
		        
		        if (classs.equals("Mage")){Hero Hero = new Hero('P',"Mage",28,15,40,70,0);IsClass = true;}
		        if (classs.equals("Mage info")){System.out.println("Dommage : 40, LifePoint : 70 defence : 0, powerfull user of magic");}
		        
		        if (classs.equals("Assassin")){Hero Hero = new Hero('P',"Assassin",28,15,50,80,0);IsClass = true;}
		        if (classs.equals("Assassin info")){System.out.println("0,0,50,80,0");}
	        } 
	        
	        
//*****************************************************************************
//**************************     Introduction     *****************************
//*****************************************************************************        
	        
	        System.out.print("\n");
	        System.out.print("Bienvenue au monde de blablablabla");
	        System.out.print("\n");
	        
//*****************************************************************************
//******************************     WHILE     ********************************
//*****************************************************************************
		 while (true){
			 
	//*****************************************************************************
	//******************************     FIGHT     ********************************
	//*****************************************************************************
			 if(SlimeFight){
				 System.out.print("Oh no ! a slime bloc your way ?");
				 while(true) {
					 System.out.print("\n");
					 System.out.print("              ░░░░░░░░░░               |----------|");
					 System.out.print("\n");
					 System.out.print("          ░░░░        ░░░░░░           |HP :\t" + Slime1.getLife()+"|");
					 System.out.print("\n");
					 System.out.print("        ░░                  ░░         |----------|");
					 System.out.print("\n");
					 System.out.print("      ░░                    ░░░░    ");
					 System.out.print("\n");
					 System.out.print("    ░░                      ░░░░░░  ");
					 System.out.print("\n");
					 System.out.print("    ░░                        ░░░░  ");
					 System.out.print("\n");
					 System.out.print("  ░░                ░░    ░░  ░░░░░░");
					 System.out.print("\n");
					 System.out.print("  ░░                ██░░  ██    ░░░░");
					 System.out.print("\n");
					 System.out.print("  ░░                ██░░  ██    ░░░░");
					 System.out.print("\n");
					 System.out.print("  ░░            ░░            ░░░░░░");
					 System.out.print("\n");
					 System.out.print("  ░░░░░░                      ░░░░░░");
					 System.out.print("\n");
					 System.out.print("    ░░░░░░                  ░░░░░░  ");
					 System.out.print("\n");
					 System.out.print("    ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░  ");
					 System.out.print("\n");
					 System.out.print("       ░░░░░░░░░░░░░░░░░░░░░░      ");
					 System.out.print("\n");
					 System.out.print("\n");
					 
					 System.out.print("What do you want to do ?");
					 System.out.print("\n");
					 System.out.print("|--------------------------------------------|");
					 System.out.print("\n");
					 System.out.print("|     Attack    |     Inv     |     Flee     |");
					 System.out.print("\n");
					 System.out.print("|--------------------------------------------|");
					 System.out.print("\n");
					 
					 Scanner sc4 = new Scanner(System.in);
					 String str4 = sc4.nextLine();
					 
					 if(str4.equals("Attack")) {
						 
					 }
					 
					 if(str4.equals("Flee")) {
						 break;
					 }
				 }
			 }
			 
			 
			 if (ConstantMap == true) {
				 for(int i = 0;i < map.length; i += 1) {
					 for(int k = 0;k < map[i].length; k += 1) {
						 if (mapentity[i][k] != ' ') {
							 System.out.print(mapentity[i][k]);
						 }
						 else {
							 System.out.print(map[i][k]);
						 }
					 }
					 System.out.print("\n");
				 }
			 }
			 
	//*****************************************************************************
	//******************************     INPUT     ********************************
	//*****************************************************************************
	        @SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
	        System.out.print("\n");
	        System.out.println("quel action voulez vous faire :");
	        System.out.println("- move");
	        System.out.println("- inventory");
	        System.out.println("- leave (for leave the game)");
	        System.out.println("- show map");
	        System.out.println("- map info");
	        System.out.println("- constant map on/off(map will be show after at each command");
	        String str = sc.nextLine();
	        
	//*****************************************************************************
	//*****************************     OUTPUT     ********************************
	//*****************************************************************************	
	        
	    	//*****************************************************************************
	    	//*****************************     LEAVE     *********************************
	    	//*****************************************************************************	
	        if (str.equals("constant map on")){
	        	ConstantMap = true;
	        }
	        if (str.equals("constant map off")){
	        	ConstantMap = false;
	        }
	        
	    	//*****************************************************************************
	    	//*******************************     MAP     *********************************
	    	//*****************************************************************************	
	        if (str.equals("leave")){
	        	System.out.println("fin de la partie");
	        	break;
	        }
	        
	        if (str.equals("map info")){
	        	System.out.println("/ = fin de carte");
	        	System.out.println("X = mur");
	        	System.out.println("P = personnage");
	        	System.out.println("S = Slime (Monstre)");
	        }
	        
			if (str.equals("show map") || str.equals("showmap") || str.equals("map") || str.equals("MAP")|| str.equals("Map") ){
				
				 for(int i = 0;i < map.length; i += 1) {
					 for(int k = 0;k < map[i].length; k += 1) {
						 if (mapentity[i][k] != ' ') {
							 System.out.print(mapentity[i][k]);
						 }
						 else {
							 System.out.print(map[i][k]);
						 }
					 }
					 System.out.print("\n");
				 }
			}
			
			
	    	//*****************************************************************************
	    	//******************************     MOOVE     ********************************
	    	//*****************************************************************************
        	
	    	//*****************************************************************************
	    	//********************************     UP     *********************************
	    	//*****************************************************************************
        	if (str.equals("Up") || str.equals("uP") || str.equals("up") || str.equals("UP"))  {
        		if (mapentity[Hero.getPosY()-1][Hero.getPosX()-1] == 'S') {
        			SlimeFight = true;
        		}
        		
        		if (map[Hero.getPosY()-1][Hero.getPosX()-1] == 'X' || map[Hero.getPosY()-1][Hero.getPosX()-1] == '/') {
        			System.out.print("\n");
        			System.out.print("A wall block your way");
        			System.out.print("\n");}
        		else {
	        		mapentity[Hero.getPosY()][Hero.getPosX()-1] = ' ';
	        		Hero.setPosY(Hero.getPosY() - 1 );
	        		mapentity[Hero.getPosY()][Hero.getPosX()-1] = 'P';}
        	}
        	
	    	//*****************************************************************************
	    	//*******************************     DOWN     ********************************
	    	//*****************************************************************************
        	if (str.equals("Down") || str.equals("down") || str.equals("DOWN") || str.equals("DOwn")) {
        		if (map[Hero.getPosY()+1][Hero.getPosX()-1] == 'X' || map[Hero.getPosY()+1][Hero.getPosX()-1] == '/') {
        			System.out.print("\n");
        			System.out.print("A wall block your way");
        			System.out.print("\n");}
        		else {
        		mapentity[Hero.getPosY()][Hero.getPosX()-1] = ' ';
        		Hero.setPosY(Hero.getPosY() + 1 );
        		mapentity[Hero.getPosY()][Hero.getPosX()-1] = 'P';}
        		
        	}
        	
        	
	    	//*****************************************************************************
	    	//******************************     RIGHT     ********************************
	    	//*****************************************************************************
        	if (str.equals("Right") || str.equals("right") || str.equals("RIGHT") || str.equals("RIght")) {
        		if (map[Hero.getPosY()][Hero.getPosX()] == 'X' || map[Hero.getPosY()][Hero.getPosX()] == '/') {
        			System.out.print("\n");
        			System.out.print("A wall block your way");
        			System.out.print("\n");}
        		else {
        		mapentity[Hero.getPosY()][Hero.getPosX()-1] = ' ';
        		Hero.setPosX(Hero.getPosX() + 1 );
        		mapentity[Hero.getPosY()][Hero.getPosX()-1] = 'P';}
        	}
        	
        	
	    	//*****************************************************************************
	    	//*******************************     LEFT     ********************************
	    	//*****************************************************************************
        	if (str.equals("Left") || str.equals("left") || str.equals("LEFT") || str.equals("LEft") ) {
        		if (map[Hero.getPosY()][Hero.getPosX()-2] == 'X' || map[Hero.getPosY()][Hero.getPosX()-2] == '/') {
        			System.out.print("\n");
        			System.out.print("A wall block your way");
        			System.out.print("\n");}
        		else {
        		mapentity[Hero.getPosY()][Hero.getPosX()-1] = ' ';
        		Hero.setPosX(Hero.getPosX() - 1 );
        		mapentity[Hero.getPosY()][Hero.getPosX()-1] = 'P';}
        	}
        	
	    	//*****************************************************************************
	    	//******************************     ELSE     *********************************
	    	//*****************************************************************************
			if (str.equals("move")) {
	        	System.out.println("Where do you want to go ?");
	        	System.out.println("Up");
	        	System.out.println("Down");
	        	System.out.println("Right");
	        	System.out.println("Left");
	        	System.out.println("cancel (return to menu of choose)");
				Scanner sc3 = new Scanner(System.in);
		        String str3 = sc.nextLine();
		        
	        	if (str3.equals("cancel")){break;}
	        	if (str.equals("cancel")){break;}
	        	
		    	//*****************************************************************************
		    	//********************************     UP     *********************************
		    	//*****************************************************************************
	        	if (str3.equals("Up") || str3.equals("uP") || str3.equals("up") || str3.equals("UP"))  {
	        		if (map[Hero.getPosY()-1][Hero.getPosX()-1] == 'X' || map[Hero.getPosY()-1][Hero.getPosX()-1] == '/') {
	        			System.out.print("\n");
	        			System.out.print("A wall block your way");
	        			System.out.print("\n");}
	        		else {
		        		mapentity[Hero.getPosY()][Hero.getPosX()-1] = ' ';
		        		Hero.setPosY(Hero.getPosY() - 1 );
		        		mapentity[Hero.getPosY()][Hero.getPosX()-1] = 'P';}
	        	}
	        	
		    	//*****************************************************************************
		    	//*******************************     DOWN     ********************************
		    	//*****************************************************************************
	        	if (str3.equals("Down") || str3.equals("down") || str3.equals("DOWN") || str3.equals("DOwn")) {
	        		if (map[Hero.getPosY()+1][Hero.getPosX()-1] == 'X' || map[Hero.getPosY()+1][Hero.getPosX()-1] == '/') {
	        			System.out.print("\n");
	        			System.out.print("A wall block your way");
	        			System.out.print("\n");}
	        		else {
		        		mapentity[Hero.getPosY()][Hero.getPosX()-1] = ' ';
		        		Hero.setPosY(Hero.getPosY() + 1 );
		        		mapentity[Hero.getPosY()][Hero.getPosX()-1] = 'P';}
	        	}
	        	
		    	//*****************************************************************************
		    	//******************************     RIGHT     ********************************
		    	//*****************************************************************************
	        	if (str3.equals("Right") || str3.equals("right") || str3.equals("RIGHT") || str3.equals("RIght")) {
	        		if (map[Hero.getPosY()][Hero.getPosX()] == 'X' || map[Hero.getPosY()][Hero.getPosX()] == '/') {
	        			System.out.print("\n");
	        			System.out.print("A wall block your way");
	        			System.out.print("\n");}
		        		else {
		        		mapentity[Hero.getPosY()][Hero.getPosX()-1] = ' ';
		        		Hero.setPosX(Hero.getPosX() + 1 );
		        		mapentity[Hero.getPosY()][Hero.getPosX()-1] = 'P';}
	        	}
	        	
		    	//*****************************************************************************
		    	//*******************************     LEFT     ********************************
		    	//*****************************************************************************
	        	if (str3.equals("Left") || str3.equals("left") || str3.equals("LEFT") || str3.equals("LEft") ) {
	        		if (map[Hero.getPosY()][Hero.getPosX()-2] == 'X' || map[Hero.getPosY()][Hero.getPosX()-2] == '/') {
	        			System.out.print("\n");
	        			System.out.print("A wall block your way");
	        			System.out.print("\n");}
	        		else {
		        		mapentity[Hero.getPosY()][Hero.getPosX()-1] = ' ';
		        		Hero.setPosX(Hero.getPosX() - 1 );
		        		mapentity[Hero.getPosY()][Hero.getPosX()-1] = 'P';}
	        	}
	        	
			
			}//end if move
			
	 	}// end while
		 
	}// =end main
	 
}//end Main
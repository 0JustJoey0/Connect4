import java.util.Scanner;

public class Connect_4 {
	static char [][] boardGrid = 
		{ {'O','O','O','O','O','O','O'},
		  {'O','O','O','O','O','O','O'},	 
		  {'O','O','O','O','O','O','O'},
		  {'O','O','O','O','O','O','O'},
		  {'O','O','O','O','O','O','O'},
		  {'O','O','O','O','O','O','O'}};

	static char color ='R', check, check2; 
	
	static int playerInput, valid=0,column=0, exit2=0, lastRowcounter=0; 
	
	static String playerInputstring, winCheck= "!";
	
	static Scanner userinput = new  Scanner (System.in);
	
	
	
	
	
	
	public static void connectGrid(){
		System.out.println();
		System.out.println("1 2 3 4 5 6 7");
		System.out.println("-------------");
	
	  for ( int row=0; row < boardGrid.length; row++ )
	    {
	    
		for ( int col=0; col < boardGrid[row].length; col++ )
	          System.out.print( boardGrid[row][col] + " ");
		
		
		System.out.println();
		}
	  	
	}
	
	
	
	public static void checkGrid()
	{
		
		  for(int row=0;row<boardGrid.length; row++ )
		  {
			  check=(boardGrid[row][playerInput]);
			  
			  
			  if (check=='R' || check=='B')
			  {  
				 
				 boardGrid[row-1][playerInput]=color; 
			  	 break;
			  }
			  if (row==5)
				  boardGrid[row][playerInput]=color;
		  }	
		
	}
	
	
	public static void checkGridvertical()
	{
		  
		while (column<7){
				 
			  for (int row=0; row<boardGrid.length; row++)
			  {
				 
				 check2= (boardGrid[row][column]);
				 winCheck= check2 + winCheck;
				if (winCheck.contains("BBBB"))
				{ 
					exit2=1;
				}
				else if (winCheck.contains("RRRR"))
				{ 
					exit2=1; 
				}
			 }
			  column++; 
			  if (exit2==0)
				  winCheck="!"; 
			  
			 } 
		
		
		column=0; 
	
	}
	
	

	
	public static void checkGridhorizontal()
	{
	
	  for ( int row=0; row < boardGrid.length; row++ )
	    {
	    
		  for ( int col=0; col < boardGrid[row].length; col++ )
				{
				check2= (boardGrid[row][col]);
				winCheck= check2 + winCheck;
				}
			
		  	if (winCheck.contains("BBBB"))
			{ 
				exit2=1;
			}
			else if (winCheck.contains("RRRR"))
			{ 
				exit2=1; 
			}
		  	if (exit2==0)
				  winCheck="!";
	    }
	
	}
	
	public static void checkGriddiagonal1(){
 	
			int adjustment= 3; 
		 	int column2 =5; 
			int row2=5;
		
		while (column2>=0)
		{		
				 
				
				
			while (column2<boardGrid[4].length && row2>=0)
			{
				check2=boardGrid[row2][column2];
				column2++; 
				winCheck=winCheck+check2;
				row2--; 
			}
			row2=5;
			column2= column2-adjustment;
			adjustment++; 
			if (winCheck.contains("BBBB"))
			{ 
				exit2=1;
			}
			if (winCheck.contains("RRRR"))
			{ 
				exit2=1; 
			}
			if (exit2==0)
			winCheck="!"; 
		
		}
		
			
			adjustment= 1; 
			column2 =0; 
			row2=4;
			
			if (exit2 == 0)
			{
				while (row2>=0)
				{
				
		
					while (row2<boardGrid.length && row2>=0)
					{
						
						check2=boardGrid[row2][column2];
						column2++; 
						winCheck=winCheck+check2;
						row2--; 
					}
					row2=4;
					row2= row2-adjustment;
					adjustment++; 
					column2=0; 
					if (winCheck.contains("BBBB"))
					{ 
						exit2=1;
					}
					if (winCheck.contains("RRRR"))
					{ 
						exit2=1; 
					}
					if (exit2==0)
					winCheck="!"; 	
				}
		
			}
	}
	
	public static void checkGriddiagona2()
	{
			int adjustment2= 3; 
		 	int column3 =1; 
			int row3=5;
		
		while (column3>=0)
		{		
				 
				
				
			while (column3<boardGrid[4].length && row3>=0 && column3 >=0)
			{
				check2=boardGrid[row3][column3];
				column3--; 
				winCheck=winCheck+check2;
				row3--; 
			}
			row3=5;
			column3= column3+adjustment2;
			adjustment2++; 
			if (winCheck.contains("BBBB"))
			{ 
				exit2=1;
			}
			if (winCheck.contains("RRRR"))
			{ 
				exit2=1; 
			}
			if (exit2==0)
			winCheck="!"; 
		
		}
					
		 
		 
		adjustment2= 1; 
		column3= 6; 
		row3=4;
		
		if (exit2 == 0)
		{
			while (row3>=0)
			{
			
		
				while (row3<boardGrid.length && row3>=0 && column3>=0)
				{
					
					check2=boardGrid[row3][column3];
					column3--; 
					winCheck=winCheck+check2;
					row3--; 
				}
				row3=4;
				row3= row3-adjustment2;
				adjustment2++; 
				column3=6; 
				if (winCheck.contains("BBBB"))
				{ 
					exit2=1;
				}
				if (winCheck.contains("RRRR"))
				{ 
					exit2=1; 
				}
				if (exit2==0)
				winCheck="!"; 	
			}
		
		}
	}
	
	
	public static void checkGridfirstRow(){
		 
		for ( int col=0; col < 7; col++ )
			{
				check2= (boardGrid[0][col]);
				if ( check2 =='R' || check2=='B')
					{
					lastRowcounter= lastRowcounter+1;
					if (lastRowcounter ==7)
					exit2=1; 
					}
			}
		 if (lastRowcounter<7)
			 lastRowcounter=0;
		
	}
	
	public static void playerInputcheck()
	{
		  while (valid==0)
		  {
			  		
			  playerInputstring= userinput.next(); 
					switch (playerInputstring){
					
					case "1": 
						playerInput=0; 
						valid=1; 
						break; 
					case "2": 
						playerInput=1; 
						valid=1;
						break; 
					case "3": 
						playerInput=2; 
						valid=1;
						break; 
					case "4": 
						playerInput=3; 
						valid=1;
						break; 
					case "5": 
						playerInput=4; 
						valid=1;
						break; 
					case "6": 
						playerInput=5; 
						valid=1;
						break;
					case "7": 
						playerInput=6; 
						valid=1;
						break;
				   default:
						 System.out.println("Invalid Input.Please Try Again"); 
					}
				  
		  }
		  valid=0; 
		
	}
	
	
	public static void main(String[] args) {
		String playerName="Joe", playerName2="Cal", userAnswer; 
		
		int exit=0, count=0, count2=0, count3=0, twoPlayercheck=0;
		
		
		Scanner userinput = new  Scanner (System.in);
		
		System.out.println("WELCOME TO JOEY'S CONNECT 4!");
		   

		System.out.println("\nWould you like to play Two player or Computer (Enter two or com)");
		userAnswer=userinput.nextLine(); 
		
		while (!(userAnswer.equalsIgnoreCase("two")) && !(userAnswer.equalsIgnoreCase("com"))) 
				{
				System.out.println("Invaild input. Please try again.");
				userAnswer=userinput.nextLine(); 
				}
		
		if (userAnswer.equalsIgnoreCase("two"))
		{
		twoPlayercheck=1; 
		System.out.println("\nEnter name for player 1");
		playerName=userinput.nextLine(); 
		
		System.out.println("Enter name for player 2");
		playerName2=userinput.nextLine(); 
		

		System.out.println(playerName + " will be blue and " + playerName2 + " will be red.");
		
		} 
		
		else if (userAnswer.equalsIgnoreCase("com"))
			System.out.println("You will be blue and Computer will be red.");
		
		int playerInputcheck = 200, playerInputcheck2 = 200, playerInputcheckStart = 200;
		while (exit==0)
		{
			while (exit2==0)
			{
				winCheck="!";
					
					
						
					  connectGrid(); 
					  
					  
					  if (twoPlayercheck==1)
					  System.out.println("\n"+ playerName + " which column would you like to place your checker?");
					  
					  if (twoPlayercheck==0)
						  System.out.println("Your Turn: Which column would you like to place your checker?");
						  
					  
					  
					  playerInputcheck(); 
					  
					 
					 check=(boardGrid[0][playerInput]); 
					 
					 while ( check == 'R' || check=='B') 
					 {
						 System.out.println("Column Full. Please pick different column");
						 playerInputcheck();
						 check=(boardGrid[0][playerInput]);
					 }
					   color='B'; 
					  
					  
					   
					  checkGrid(); 
					  
					  checkGridfirstRow();
					  if (exit2==0)
					  checkGridvertical();
					  if (exit2==0)
					  checkGridhorizontal(); 
					  if (exit2==0)
					  checkGriddiagonal1();
					  if (exit2==0)
					  checkGriddiagona2();
					  
					  
					  
					  if (exit2==0)
					  {
						  connectGrid();
						  
						  
					
						   
						  int threeInaRow =0;
						  
						  if (twoPlayercheck==0)
						  { 
							  System.out.println("Computer Turn");
							  
						
							  count3++; 
							  
							  
							  if (count3==1)
							  {
								  playerInputcheckStart=playerInput; 
								  playerInput=2;
							  }
							  if (count3==2)
								  	{
									  playerInputcheck=playerInput; 
									  playerInput=3;
								  	} 
						
							  if (count3==3)
							  {	      playerInputcheck2=playerInput; 
							  
									  if (playerInputcheck+1==playerInput)
										  playerInput++;
									  else if (playerInputcheck==playerInput)
									  {
										  playerInput++;
									  	  playerInput--;
									  }
									  else 
									  {
										  playerInput=4;
									  	  threeInaRow=1;
									  }
							}
							  
							  if (count3==4)
							  {
								  playerInputcheck=playerInput;
								  if (playerInputcheck2+1==playerInput)
									  playerInput++;
								  else if (playerInputcheck2==playerInput || playerInputcheck2-1==playerInput || playerInputcheckStart==playerInput  )
								  {
									  playerInput++;
								  	  playerInput--;
								  }
								  
								  else if( threeInaRow==1)
									 playerInput=5;
							     else
								     playerInput=4;
							  }
								 
							  
							  if (count3==5)
							  {
								  playerInputcheck2=playerInput; 
								  if (playerInputcheck+1==playerInput)
									  playerInput++;
								  else if (playerInputcheck==playerInput || playerInputcheck-1==playerInput || playerInputcheckStart==playerInput)
								  {
									  playerInput++;
								  	  playerInput--;
								  }
								  else 
								 playerInput=5;
							  }
							
							  if (count3==6)
							  {
								  playerInputcheck=playerInput;
								  if (playerInputcheck2+1==playerInput)
									  playerInput++;
								  else if (playerInputcheck2==playerInput || playerInputcheck2-1==playerInput || playerInputcheckStart==playerInput)
								  {
									  playerInput++;
								  	  playerInput--;
								  }
								  else
								 playerInput=1;
							  }
							  
							  if (count3==7)
							  {
								  if (playerInputcheck+1==playerInput)
									  playerInput++;
								  else if (playerInputcheck==playerInput || playerInputcheck-1==playerInput || playerInputcheckStart==playerInput)
								  {
									  playerInput++;
								  	  playerInput--;
								  }
								  else 
								 playerInput=5;
								  
								 count3=0;
							  }
							  
					
							  
							  if (playerInput>6)
								  playerInput= playerInput-2;
							  if (playerInput<0)
								  playerInput= playerInput+3;
							  
							  
							  
							  check=(boardGrid[0][playerInput]);
							 
							   if ( check =='R' || check=='B')
							  {	 playerInput=7;
								 while (check == 'R' || check =='B')
								 { 
								  playerInput= playerInput-1;
								  System.out.println(playerInput);
								  check=(boardGrid[0][playerInput]);
								 }
							  }
						  }
						  
						
						  if (twoPlayercheck==1)
							 {
							  System.out.println("\n"+ playerName2 + " which column would you like to place your checker?");
								  
							  playerInputcheck();
							  
							  check=(boardGrid[0][playerInput]);
							  
							  while ( check =='R' || check=='B') 
								 {
									 System.out.println("Column Full. Please pick different column");
									 playerInputcheck();
									 check=(boardGrid[0][playerInput]);
								 }
						  
							  }
						  
						 
						  color='R'; 
						 
						 checkGrid(); 
						  
				
						 checkGridfirstRow();
						 
						 if (exit2==0)
						 checkGridvertical();
						  if (exit2==0)
						 checkGridhorizontal();
						  if (exit2==0)
						 checkGriddiagonal1();
						 if (exit2==0)
						 checkGriddiagona2(); 
					
					  }
			 
					 		  	  
			}
		
		connectGrid();
			
		
		
			 
		
		
		    if (winCheck.contains("BBBB"))
		    {
		    count= count+1;
		    if(twoPlayercheck==1)
			System.out.println("\n" + playerName + " You Won. " );
		    else 
		    	System.out.println("\nYou Won." );
		    }
		    
		    
		    else if (winCheck.contains("RRRR"))
			{
			count2 = count2+1;
			 if (twoPlayercheck==1)
			System.out.println("\n" + playerName2 + " You Won." ); 
			 else 
				 System.out.println("\nComputer Won." ); 
			}
		    
		    
		    else if (lastRowcounter ==7)
		    	System.out.println("Tie. Nobody Wins");
		    if (twoPlayercheck==1)
		    System.out.println("\n" + playerName + " Wins: " + count + "\t" + playerName2 + " Wins: " + count2 );
		    else 
		    	System.out.println("\n Your Wins: " + count + "\t Computer Wins: " + count2 );
		    
		    
		    
		    
		    
		    
		    
		    System.out.println("\nDo you want to play again(yes/no)");
		    userAnswer=userinput.nextLine(); 
		    
		    if (userAnswer.equalsIgnoreCase("yes")||userAnswer.equalsIgnoreCase("y") )
		    	{
		    		exit=0; 
		    		exit2=0; 
		    		boardGrid = new char[][]
		    			{ {'O','O','O','O','O','O','O'},
		    			  {'O','O','O','O','O','O','O'},	 
		    			  {'O','O','O','O','O','O','O'},
		    			  {'O','O','O','O','O','O','O'},
		    			  {'O','O','O','O','O','O','O'},
		    			  {'O','O','O','O','O','O','O'}};
		    	}
		    else 
		    	exit = 1; 
		    
		    
		    if (exit==1) 
		    {
		    
		    if (count > count2)
		    {
		    	 if (twoPlayercheck==1)
		    	System.out.println("\n" +playerName.toUpperCase() + " YOU ARE THE CONNECT 4 CHAMPION");
		    	else 
		    	System.out.println("\nYOU ARE THE CONNECT 4 CHAMPION");
		    }
		    else if (count<count2)
		    {
		    	if (twoPlayercheck==1)
		    	System.out.println("\n" + playerName2.toUpperCase() + " YOU ARE THE CONNECT 4 CHAMPION");
		    	else 
		    	System.out.println("\n COMPUTER IS THE CONNECT 4 CHAMPION");
		    }
		    	else if (count==count2)
		    	System.out.println("\nIts a Tie. Nobody is the connect 4 champion");
		    
		    System.out.println("\nThanks for Playing!");
		    }
		    
		    
		    }
	userinput.close();
		
				  
	
		
		
		
		
		
		
		



	}

}

import java.util.Random;
import java.util.*;
import java.io.*;
import java.lang.*;
public class Main
{
	/** printTable() method print the Matrix of user Transction of the Latest Transction**/
	public static void printTable(double Matrix[][])
	{
		System.out.println();
		for(int i=1;i<Matrix.length;i++)
		{
			for(int j=1;j<Matrix[i].length;j++)
			{
				System.out.print((Matrix[i][j]+0.00)+" ");
			}
			System.out.println();

		}
	}
	/**updateTransctionTableEqual() calculate the amount if the amount paid is divided equally  **/
	public static void updateTransctionTableEqual(double Matrix[][],String  payer, String whom[] , double amount)
	{
		double split_wise = (amount*1.0)/whom.length;
		// 33.34 CASE NOT HANDLED
		int indexPayer=Integer.parseInt(payer.substring(1));
		int indexWhom[]=new int[whom.length];

		for(int i=0;i<whom.length;i++)
		{
			indexWhom[i]=Integer.parseInt(whom[i].substring(1));
		}
		for(int i=0;i<whom.length;i++)
		{
			//System.out.println(indexPayer+" "+indexWhom[i]);
			if(indexPayer!=indexWhom[i])
			Matrix[indexPayer][indexWhom[i]]+=split_wise; 
		}
		printTable(Matrix);

	}
		/**updateTransctionTableExact() calculate the amount if the amount paid is divided by Exact amount for individual user  **/
	public static void updateTransctionTableExact(double Matrix[][],String payer, String  whom[] , double amount , double shareExact[])
	{
		double check_sum =0;
		int  indexPayer=Integer.parseInt(payer.substring(1));
		int indexWhom[]=new int[whom.length];

		for(int i=0;i<whom.length;i++)
		{
			indexWhom[i]=Integer.parseInt(whom[i].substring(1));
		}


		for(int i=0;i<whom.length;i++)
		{
			check_sum+=shareExact[i];
		}
		if(check_sum==amount)
		{
			for(int i=0;i<whom.length;i++)
			{
				if(indexPayer!=indexWhom[i])
				Matrix[indexPayer][indexWhom[i]]+=shareExact[i];
			}
		}
		else
		{
			System.out.println("INVALID DISTRIBTUION OF AMOUNT");
		}
		printTable(Matrix);
	}

		/**updateTransctionTablePercent() mathod is calculate the amount 
		if the amout paid is divided on basis of ratio   **/
	public static void updateTransctionTablePercent(double Matrix[][],String payer, String whom[] , double amount , double share_Percent[])
	{
		double check_sum=0;
		int indexPayer=Integer.parseInt(payer.substring(1));
		int indexWhom[]=new int[whom.length];

		for(int i=0;i<whom.length;i++)
		{
			indexWhom[i]=Integer.parseInt(whom[i].substring(1));
		}


		for(int i=0;i<share_Percent.length;i++)
		{
			check_sum+=share_Percent[i];
		}


		if(check_sum==100)
		{
			for(int i=0;i<whom.length;i++)
			{
				double part_wise =0;
				part_wise = (share_Percent[i]*amount)/100;
				if(indexPayer!=indexWhom[i])
				Matrix[indexPayer][indexWhom[i]]+=part_wise;
			}
		}
		else
		{
			System.out.println("INVALID DISTRIBTUION OF SHARES");
		}
		printTable(Matrix);

	}
	public static  void showCompleteTransactionTable(double[][]Matrix )
	{
		double net_amount=0;
		boolean empty=false;
		for(int i=1;i<Matrix.length;i++)
		{
			for(int j=i;j<Matrix[i].length;j++)
			{
				if(i!=j)
				{
					if(Matrix[i][j]>Matrix[j][i])
					{
						System.out.println("User"+j+" owes "+"User"+i+": "+(Matrix[i][j]-Matrix[j][i]));
						empty=true;
					}
					else if(Matrix[i][j]<Matrix[j][i])
					{
						System.out.println("User"+i+" owes "+"User"+j+": "+(Matrix[j][i]-Matrix[i][j]));
						empty=true;
					}
				}

			}
		}
		if(empty==false)
		{
			System.out.println("No Balances");
		}
	}
	public static void showUserTransactionTable(double [][] Matrix , String userId)
	{
		int indexUser = Integer.parseInt(userId.substring(1));
		
		double net_amount=0;
		boolean empty = false;

		for(int i=1;i<Matrix.length;i++)
		{
			if(indexUser!=i)
			{
				if(Matrix[indexUser][i]>Matrix[i][indexUser])
				{
					System.out.println("User"+i+" owes "+"User"+indexUser+": "+(Matrix[indexUser][i]-Matrix[i][indexUser]));
					empty=true;
				}
				else if(Matrix[indexUser][i]<Matrix[i][indexUser])
				{
					System.out.println("User"+indexUser+" owes "+"User"+i+": "+(Matrix[i][indexUser]-Matrix[indexUser][i]));
					empty=true;
				}
			}
		}
		if(empty==false)
		{
			System.out.println("No Balances");
		} 
	}
	/** Main Method **/
	public static void main(String args[])
	{
		final int MAX=5;                                   //Maximum Number of User.
		 User user_array[]=new User[MAX];                  //Creating the objects of the User Class.
	     double Matrix[][] = new double[MAX][MAX];         //Transction Matrix for calculation of amount.


	     for(int i=0;i<MAX;i++)                            // Initiliasing  each user class object 
		{                                                  // with random data.
			user_array[i]=new User();                      
			user_array[i].input();

		}
	  /* for(int i=0;i<MAX;i++)
		{                                                   //For displaying user Data.
			user_array[i].output();

		}*/
		String str="";                                      // Query string 

		Scanner sc=new Scanner(System.in);                  // Scanner Class object for input query from keyboard
		
		int operations=0;                                   // Total number of operations.

		System.out.println("Enter No. of operations :");

		operations=sc.nextInt();                            //Input from keyboard number of operations
		
		sc.nextLine();                                      //Flushing the buffer for string query input
		
		for(int t=0;t<operations;t++)                       //Loop for input and processing of query
		{
			str=sc.nextLine();
			String words[]=str.split(" ");
			int no_args=words.length;
			if(no_args==1)                                  //OPERATION : SHOW
			{
				showCompleteTransactionTable(Matrix);
			}
			else if(no_args==2)                            //OPERATION : SHOW u1
			{
				String userId = words[1];
				showUserTransactionTable(Matrix,userId);
			}
			else    
			{
			        /*OPERATION : 1.) EXPENSE u1 1000 4 u1 u2 u3 u4 EQUAL
	                              2.) EXPENSE u4 1200 4 u1 u2 u3 u4 PERCENT 40 20 20 20
	                              3.) EXPENSE u1 1250 2 u2 u3 EXACT 370 880*/
				
				double shareExact[];                           // Array for exact amount.                
				double sharePercent[];                         // Array for percent share in amount. 
				String payer=words[1];                         // user who pays the amount.,   
				double  amount=Double.parseDouble(words[2]);   // Amount of money paid            
				int noUser=Integer.parseInt(words[3]);         // No user involved in the transction        
				String userArr[]=new String[noUser];           // Array of Id of the user involved Transction.
				int i=4;                           
				for( i=4;i<4+noUser;i++)                               
				{
					userArr[i-4]=words[i];
				}
				String type=words[i++];
				

				if(type.equals("EQUAL"))                       // Case when amount is Equally divided among all the user involved in transction
				{
					updateTransctionTableEqual(Matrix,payer, userArr,amount);

				}
				else if(type.equals("PERCENT"))                //Case when amount is divided according to ratio among all the user involved in transction
				{
				     sharePercent=new double[noUser];
				    for(int k=0;k<noUser;k++)
				    {
				    	sharePercent[k]=Double.parseDouble(words[i++]);

				    }
				    updateTransctionTablePercent(Matrix,payer, userArr,amount ,sharePercent);
			    }
			    else if(type.equals("EXACT"))                  //Case when amount is Exactly divided among all the user involved in transction.
				{
					shareExact=new double[noUser];
					for(int k=0;k<noUser;k++)
				    {
				    	shareExact[k]=Double.parseDouble(words[i++]);

				    }
				    updateTransctionTableExact(Matrix,payer,userArr,amount,shareExact);



				}


			}
		}
	}

}
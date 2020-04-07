import java.util.Random;
import java.util.*;
import java.io.*;
public class Main
{

static public void updateExact(double Matrix[][], String payer, String toWhom[], int noOfUsers,double shareExact[])
	{
		int payerIndex=Integer.parseInt(payer.substring(1));
		int userIndex[]=new int[noOfUsers];
		for(int i=0;i<noOfUsers;i++)
		{
			userIndex[i]=Integer.parseInt(toWhom[i].substring(1));
			if(payerIndex!=userIndex[i])
			{
				Matrix[payerIndex][userIndex[i]]+=shareExact[i];
			}
		}
		//printTrasctionTable(Matrix);
	}	
	static public void updatePercent(double Matrix[][], String payer, double amount, String toWhom[], int noOfUsers,double sharePercent[])
	{
		int payerIndex=Integer.parseInt(payer.substring(1));
		int userIndex[]=new int[noOfUsers];
		for(int i=0;i<noOfUsers;i++)
		{
			userIndex[i]=Integer.parseInt(toWhom[i].substring(1));
			if(payerIndex!=userIndex[i])
			{
				Matrix[payerIndex][userIndex[i]]+=(amount*sharePercent[i]/100);
			}
		}
		//printTrasctionTable(Matrix);
	}	
	static public void updateEqual(double Matrix[][], String payer, double amount, String toWhom[], int noOfUsers)
	{
		int payerIndex=Integer.parseInt(payer.substring(1));
		int userIndex[]=new int[noOfUsers];
		for(int i=0;i<noOfUsers;i++)
		{
			userIndex[i]=Integer.parseInt(toWhom[i].substring(1));
			if(payerIndex!=userIndex[i])
			{
				Matrix[payerIndex][userIndex[i]]+=amount;
			}
		}
		//printTrasctionTable(Matrix);
	}
	static public void printTrasctionTable(double Matrix[][])
	{
		System.out.println();
		int i,j;
		for(i=1;i<Matrix.length;i++)
		{
			for(j=1;j<Matrix[i].length;j++)
			{
				System.out.print(Matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		final  int MAX=5;
		User user_array[]=new User[MAX];
		double Matrix[][]=new double[MAX][MAX];
		for(int i=0;i<MAX;i++)
		{
			Matrix[i]=new double[MAX];
		}
		for(int i=0;i<MAX;i++)
		{
			user_array[i]=new User();
		}
		Scanner sc=new Scanner(System.in);
		int op;
		op=sc.nextInt();
		sc.nextLine();  // Flush the Buffer
		String inputString;
		for(int t=0;t<op;t++)
		{
			//System.out.print("-----------"+t+"---------------");
			inputString=sc.nextLine();
			String words[]=inputString.split(" ");


			if(words.length==1)
			{
				boolean empty=true;
				for(int i=0;i<Matrix.length;i++)
				{
					for(int j=i;j<Matrix[i].length;j++)
					{
						if(i!=j&&i!=0&&j!=0)
						{
							if(Matrix[i][j]>Matrix[j][i])
							{
								System.out.println("u"+j+" owes "+"u"+i+" "+(Matrix[i][j]-Matrix[j][i]));
								empty=false;
							}
							else if(Matrix[i][j]<Matrix[j][i])
							{
								System.out.println("u"+i+" owes "+"u"+j+" "+(Matrix[j][i]-Matrix[i][j]));
								empty=false;

							}

						}
					}
				}
				if(empty==true)
				System.out.println("No Balances");
			}
			else if(words.length==2)
			{
				boolean empty=true;
				int userIndex=Integer.parseInt(words[1].substring(1));
				for(int j=0;j<Matrix[userIndex].length;j++)
				{
					if(j!=0&&j!=userIndex)
					{
						if(Matrix[userIndex][j]>Matrix[j][userIndex])
						{
								System.out.println("u"+j+" owes "+"u"+userIndex+" "+(Matrix[userIndex][j]-Matrix[j][userIndex]));
								empty=false;
						}
						else if(Matrix[userIndex][j]<Matrix[j][userIndex])
						{
								System.out.println("u"+userIndex+" owes "+"u"+j+" "+(Matrix[j][userIndex]-Matrix[userIndex][j]));
								empty=false;

						}
					}

				}
				if(empty==true)
				System.out.println("No Balances");
			}
	   		else
   	   		{
   	   			double sharePercent[];
   	   			double shareEqual;
   	   			double shareExact[];
   	   			String payer=words[1];
   	   			//System.out.print(payer+" ");
   	   			double  amount=Double.parseDouble(words[2]);
   	   		//	System.out.print(amount+" ");
   	   			int  noOfUsers=Integer.parseInt(words[3]);
   	   		//	System.out.print(noOfUsers+" ");
   	   			String userNameArray[]=new String[noOfUsers];
   	   			int index=4;
   	   			for( index=4;index<4+noOfUsers;index++)
   	   			{
   	   				userNameArray[index-4]=words[index];
   	   		//		System.out.print(userNameArray[index-4]+" ---- "+index);
   	   			}

   	   			String type=words[index++];
   	   		//	System.out.print(type+"  ");
   	   			if(type.equals("PERCENT"))
   	   			{
   	   				sharePercent=new double[noOfUsers];
   	   				for(int i=0;i<noOfUsers;i++)
   	   				{
   	   					sharePercent[i]=Double.parseDouble(words[index++]);
   	   		//			System.out.print(sharePercent[i]+" ");

   	   				}
   	   				updatePercent(Matrix,payer,amount,userNameArray,noOfUsers,sharePercent);

   	   			}
   	   			else if(type.equals("EXACT"))
   	   			{
   	   				shareExact=new double[noOfUsers];
   	   				for(int i=0;i<noOfUsers;i++)
   	   				{
   	   					shareExact[i]=Double.parseDouble(words[index++]);
   	   		//			System.out.print(shareExact[i]+" ");
   	   				}
   	   				updateExact(Matrix,payer,userNameArray,noOfUsers,shareExact);
   	   			}
   	   			else if(type.equals("EQUAL"))
   	   			{
   	   				shareEqual=amount/noOfUsers;
   	   		//		System.out.print(shareEqual+" ");
   	   				updateEqual(Matrix,payer,shareEqual,userNameArray,noOfUsers);
   
	   			}
	   			System.out.println();

		    }
		}    
	}
}
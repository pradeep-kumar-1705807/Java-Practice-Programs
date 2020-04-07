import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

/* Name of the class has to be "Main" only if the class is public. */
class CodeChef
{
	public final static int MOD=1000000007;
	public static BigInteger F[]=new BigInteger[100010];
	public static int  min(int a, int b)
	{
		return a<b?a:b;
	}
		static
	{
		for(int i=0;i<100010;i++)
		{
			F[i]=new BigInteger("0");
		}
	}
	/* static BigInteger fact(int N) 
    { 
        // Initialize result 
        BigInteger f = new BigInteger("1"); // Or BigInteger.ONE 
  
        // Multiply f with 2, 3, ...N 
        for (int i = 2; i <= N; i++) 
            f = f.multiply(BigInteger.valueOf(i)); 
  
        return f; 
    } */
    public static BigInteger fact( int  n)
    {
    	if(n<=0)
    	{
    		return BigInteger.valueOf(1);
         }
        if(!F[n].equals(BigInteger.valueOf(0)))
        {
        	//System.out.println(F[n]);
            return F[n];
        }
        F[0]=new BigInteger("1");
        F[1]=new BigInteger("1");
        int f=1,i;
        for(i=2;i<=n;i++)
        {
        	//F[i]=new BigInteger("1");
            F[i]=F[i-1].multiply(BigInteger.valueOf(i));
        }
        return F[n];
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		try{
		int t;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
        for(int k=0;k<t;k++)
        {
            int n;
            String str1,str2;
            n=sc.nextInt();
            str1=sc.next();
            str2=sc.next();
             int  i=0,z1=0,z2=0,o1=0,o2=0,sum=0;
            for(i=0;i<n;i++)
            {
                if(str1.charAt(i)=='0')
                {
                    z1++;
                }
                else if(str1.charAt(i)=='1')
                {
                    o1++;
                }
                if(str2.charAt(i)=='0')
                {
                    z2++;
                }
                else if(str2.charAt(i)=='1')
                {
                    o2++;
                }
            }
             int minzero=min(z1,z2);
             int  minone=min(o1,o2);
             int  partzero=minone+minzero;
             int partone=n-partzero;
             BigInteger N=fact(n);
             BigInteger M=fact(partzero);
             BigInteger O=fact(partone);
            // System.out.println("HelloWorld1");
             BigInteger nCm=N.divide(M.multiply(O));
            // System.out.println("HelloWorld2");
             BigInteger cal,ans=nCm;
            for(i=1;i<=min(minzero,minone);i++)
            {
                 cal=ans.add(N.divide(fact(partzero-2).multiply(fact(partone+2))));

                 partzero=partzero-2;
                 partone=partone+2;
                 ans.mod(BigInteger.valueOf(1000000007));
                 cal.mod(BigInteger.valueOf(1000000007))

                ans=ans.add(cal);
                ans.mod(BigInteger.valueOf(1000000007));
            }
        System.out.println(ans.mod(BigInteger.valueOf(1000000007)));}
    }
    catch(Exception e)
    {
    	return ;
    }
    }
}

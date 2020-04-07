import java.math.*;
class Example
{
	public static BigInteger F[]=new BigInteger[200000];
	static
	{
		for(int i=0;i<200000;i++)
		{
			F[i]=new BigInteger("0");
		}
	}
	public static BigInteger fact( int  n)
    {
    	if(n<=0)
    	{
    		return BigInteger.valueOf(1);
         }
        if(!F[n].equals(BigInteger.valueOf(0)))
        {
        	System.out.println(F[n]);
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
	public static void main(String args[])
	{
		
			System.out.println(fact(50).add(fact(20)));
		

	} 
}
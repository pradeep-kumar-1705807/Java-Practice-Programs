
import java.util.*;
class ExampleArrayList
{
    public static void main(String args[])
    {
           Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> list[]=new ArrayList[n];
        for(int i=0;i<n;i++)
        {
            list[i]=new ArrayList<Integer>();
            int m=sc.nextInt();
            for(int j=0;j<m;j++)
            {
                int val=sc.nextInt();
                list[i].add(val);
                
            }
        }
        int q=sc.nextInt();
        int x, y;
        while(q>0)
        {
            x=sc.nextInt();
            y=sc.nextInt();
            if(x<n&&y<list[x].size())
            {
                System.out.println(list[x].get(y));
            }
            else{
                System.out.println("ERROR!");
            }
            q--;
        } 
    }
}
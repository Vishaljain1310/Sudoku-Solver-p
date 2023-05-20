import java.util.*;
public class prg
{
    public static void main(String[] args)
    {
        int input1=2;
        int input2[][]=new int[][]{{5,10},{8,12}};
        int total=0;
        for(int i=0;i<input2.length;i++)
        {
            int diff=input2[i][1]-input2[i][0];
            total=total+diff;
            if(i<input1-1 && input2[i][1]>input2[i+1][0] && input2[i+1][1]>input2[i][1])
            {
                int overlap=input2[i][1]-input2[i+1][0];
                total-=overlap;
            }
            else if(i<input1-1 && input2[i][1]>input2[i+1][0] && input2[i][1]>input2[i+1 ][1])
            {
                total=total-(input2[i+1][1]-input2[i+1][0]);
            }
        }
        System.out.println(total); // return total;
    }
}
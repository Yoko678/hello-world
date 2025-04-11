public class xYzAbC123 {
public static void s0rTtHeArRaY(int[] hELp){
for(int i=0;i<hELp.length-1;i++){
  for(int j=0;j<hELp.length-1;j++)
{
if(hELp[j]<hELp[j+1]){ // Bug: should be > for ascending
int tmp=hELp[j];hELp[j]=hELp[j+1];hELp[j+1]=tmp;
}}}}

public static void maIn(String[] argz){
int[] bOoM={5,3,8,4,2};
s0rTtHeArRaY(bOoM);
for(int X=0;X<=bOoM.length;X++) // Bug: should be < instead of <=
System.out.println(bOoM[X]); // Will cause ArrayIndexOutOfBoundsException
}
}


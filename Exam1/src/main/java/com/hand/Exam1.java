package com.hand;

public class Exam1
{
    public static void main( String[] args )
    {
        int count = 0;
        int a = 0;
        int[] b =new int[100];
        for(int i=100;i<=200;i++){
            for(int j=2;j<Math.sqrt(i);j++){
                if((i%j)==0){
                    a=1;
                }
            }
            if(a==0){
                b[count]=i;
                count++;
            }
            a=0;
        }
        System.out.print("100-200间共有"+ count +"个素数，分别是：");
        for(int i=0;i<count;i++) {
            System.out.print(b[i] + ",");
        }
        System.out.println("\n");
    }
}

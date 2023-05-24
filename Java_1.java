// Adding two matrix
package com.company;
import java.util.Scanner;
public class add_two_matrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A[][]=new int[2][2];
        int B[][]=new int[2][2];
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                System.out.println("Enter the member at A["+i+"]"+"["+j+"]");
                A[i][j]= s.nextInt();
            }
        }
        for(int k=0;k<B.length;k++){
            for(int j=0;j<A[0].length;j++){
                System.out.println("Enter the member at B["+k+"]"+"["+j+"]");
                A[k][j]= s.nextInt();
            }
        }
        int c[][]=new int[2][2];
        if((A.length==B.length)&&(A[0].length==B[0].length)){
            for(int i=0;i<A.length;i++){
                for(int j=0;j<A[0].length;j++){
                    //System.out.println("Enter the member at A["+i+"]"+"["+j+"]");
                    //A[i][j]= s.nextInt();
                    //c[i][j]=A[i][j]+B[i][j];
                    c[i][j]=A[i][j] + B[i][j];
                    System.out.println(c[i][j]);
                }
            }

        }
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c[0].length;j++){
                //System.out.println("Enter the member at A["+i+"]"+"["+j+"]");
                //A[i][j]= s.nextInt();
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }

    }
}

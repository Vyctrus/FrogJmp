package org.example;

public class Task3 {
    public int solution(int[] A) {
        // Implement your solution here
        int tab[][]= new int[10][10];
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                tab[i][j]=0;
            }
        }

        for(int i=0;i<A.length;i++){
            int firstDigit=Integer.parseInt(Integer.toString(A[i]).substring(0, 1));
            int lastDigit=A[i]%10;
            tab[firstDigit][lastDigit]++;
        }

        int max=0;
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                max=(tab[i][j]>max)? tab[i][j] : max;
            }
        }
        //...not finished in time ;/
        return -1;
    }
}

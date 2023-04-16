package org.example;

public class PermMissingElem {
    public int solution(int[] A){
        //tab A contains numbers 1-N+1
        boolean[] B= new boolean[A.length+1];
        for(int i=0;i<A.length;i++){
            B[A[i]-1]=true;
        }
        for(int i=0;i<B.length;i++){
            if(B[i]==false){
                return i+1;
            }
        }
        return -1;
    }
}

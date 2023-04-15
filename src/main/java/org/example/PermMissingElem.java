package org.example;

public class PermMissingElem {
    public int solution(int[] A){
        boolean[] B= new boolean[A.length+1];
        for(int i=1;i<A.length+1;i++){
            B[A[i]]=true;
        }
        for(int i=0;i<B.length;i++){
            if(B[i]==false){
                return i;
            }
        }
        return -1;
    }

    //N 0-100 000
    //all elements are distinct
    //each element in range 1- N+1
}

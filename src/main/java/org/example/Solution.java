package org.example;

public class Solution {
    public int badSolution(int X,int Y,int D){
        int i=0;
        for(;X<Y;i++){
            X+=D;
        }
        return i;
    }

    public int solution(int X,int Y,int D){
        if(X>Y || D<=0){
            return -1;
        }
        int diff=Y-X;
        return (diff % D ==0)? diff/D : 1+(diff/D);
    }
}

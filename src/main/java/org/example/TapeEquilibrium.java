package org.example;

public class TapeEquilibrium {

    public int solution(int[] A){
        int sum=0;
        for(int i=0;i<A.length;i++){
            sum+=A[i];
        }
        int leftSum=0;
        int rightSum=sum;

        int tempMinimum=sum;
        //int minIndex=0;
        for(int i=0;i<A.length;i++){
            leftSum+=A[i];
            rightSum-=A[i];
            int min=Math.abs(leftSum-rightSum);
            if(min<=tempMinimum){
                tempMinimum=min;
                //minIndex=i;
            }
        }
        return tempMinimum;
    }

    public int badSolution(int[] A){
        //naiwny algorytm, który od razu przychodzi do głowy
        //1)licz roznice pomiedzy poszczegolnymi elementami dla P = 1.. A.length
        //2)wybierz minimum
        //3)return minimum
        //O(N^2)
        return -1;
    }

    public int goodSolution(int[] A){
        //przesuwaj granice tak aby byc jak najblizej polowy
        //zsumuj wsyzsktie elmenty, podziel na 2
        //dodawaj kolejno elementy od lewa do prawa
        //warunek while (x< polowa)
        //sprawdzic wartosci graniczne
        //O(N) good
        return -1;
    }





}

package org.example;

public class Arrows {
    public int solution(String S){
        char[] tabChar= S.toCharArray();
        int directions[] ={0,0,0,0};
        for(int i=0;i<tabChar.length;i++){
            switch (tabChar[i]){
                case('^'):
                    directions[0]++;
                    break;
                case('>'):
                    directions[1]++;
                    break;
                case('v'):
                    directions[2]++;
                    break;
                case('<'):
                    directions[3]++;
                    break;
            }
        }
        int maxElements=0;
        for(int i=0;i<directions.length;i++){
            maxElements= (directions[i]>maxElements)? directions[i] : maxElements;
        }
        return tabChar.length-maxElements;
    }
}

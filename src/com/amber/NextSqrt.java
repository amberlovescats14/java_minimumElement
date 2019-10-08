package com.amber;

public class NextSqrt {

    public long findNextSquare(long sq) {
        if(Math.sqrt(sq) != (int)Math.sqrt(sq)) return -1;
        while(true){
            sq++;
            if(Math.sqrt(sq) == (int)Math.sqrt(sq)) break;
        }
        return sq;
    }
}

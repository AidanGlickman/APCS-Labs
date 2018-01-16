package lab03.Code;

import java.util.HashMap;
import java.util.Map;

public class MakeChange {
    final int HUNDREDS = 0;
    final int FIFTIES = 1;
    final int TWENTIES = 2;
    final int TENS = 3;
    final int FIVES = 4;
    final int SINGLES = 5;
    final int QUARTERS = 6;
    final int DIMES = 7;
    final int NICKLES = 8;
    final int PENNIES = 9;
    long[] denoms;


    String makeChange(double money){
        long moneyCents = (long)(money * 100); //change money in to a long containing the number of cents to eliminate rounding errors
        denoms = new long[10]; //denoms will hold the amount of each denomination there is
        Map<Integer, Integer> denomVal = new HashMap<Integer, Integer>(); //create a hashmap that holds each denomination (with the index of where the amount will be in denoms, and maps it to how many cents that thing is
        denomVal.put(HUNDREDS, 10000);
        denomVal.put(FIFTIES, 5000);
        denomVal.put(TWENTIES, 2000);
        denomVal.put(TENS, 1000);
        denomVal.put(FIVES, 500);
        denomVal.put(SINGLES, 100);
        denomVal.put(QUARTERS, 25);
        denomVal.put(DIMES, 10);
        denomVal.put(NICKLES, 5);
        denomVal.put(PENNIES, 1);
        //puts all the denominations along with their values in denomVal

        for(Map.Entry<Integer, Integer> entry : denomVal.entrySet()){
            if(moneyCents >= entry.getValue()){
                denoms[entry.getKey()] = moneyCents / entry.getValue();
                moneyCents %= entry.getValue();
            }
        }

        return String.format("%d %d %d %d %d %d %d %d %d %d", denoms[HUNDREDS], denoms[FIFTIES], denoms[TWENTIES], denoms[TENS], denoms[FIVES], denoms[SINGLES], denoms[QUARTERS], denoms[DIMES], denoms[NICKLES], denoms[PENNIES]);
    }
}

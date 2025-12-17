package astra.lang.custom;

import java.util.Random;
import astra.core.Module; 
import astra.formula.Formula;
import astra.formula.Predicate;
import java.util.ArrayList;
import java.util.List;

// FINALLY THIS WORKS!!!

public class RandomInRange extends Module {
    Random random = new Random();
    @TERM
    public int randomIntBetween(int lowerBound, int upperBound) {
        return lowerBound + (int) (Math.random() * (upperBound - lowerBound));
    }

    @TERM
    public long randomLongBetween(int lowerBound, long upperBound) {
        return ((long)lowerBound + (long) (Math.random() * (upperBound - (long)lowerBound)));
    }

    @TERM
    public boolean checkInList(List<List<Long>> list, List<Long> check)
    {
        return (list.contains(check));
    }
}

package se.mbaeumer.javalab.functionalprogramming.chapter1;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class FindDiscountedPrices {

    // task: Suppose we’re asked to total the prices greater than $20, discounted by 10%.
    public void findOldStyle(){
        BigDecimal totalDiscounted = BigDecimal.ZERO;
        final List<BigDecimal> bigDecimals = List.of(new BigDecimal("10"), new BigDecimal("25"),
                new BigDecimal("18"), new BigDecimal("27"));
        for (BigDecimal bigDecimal : bigDecimals){
            if (bigDecimal.compareTo(BigDecimal.valueOf(20)) > 0){
                totalDiscounted.add(bigDecimal.multiply(BigDecimal.valueOf(0.9)));
            }
        }
    }

    public void findNewStyle(){
        final List<BigDecimal> bigDecimals = List.of(new BigDecimal("10"), new BigDecimal("25"),
                new BigDecimal("18"), new BigDecimal("27"));
        bigDecimals.stream()
                .filter(bd -> bd.compareTo(BigDecimal.valueOf(20)) > 0)
                .map(bd -> bd.multiply(BigDecimal.valueOf(0.9)))
                .reduce(BigDecimal.ZERO, BigDecimal::add)
    }
}

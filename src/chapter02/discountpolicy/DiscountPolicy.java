package chapter02.discountpolicy;

import chapter02.DiscountCondition;

import java.util.ArrayList;
import java.util.List;

public abstract class DiscountPolicy {
    private List<DiscountCondition> conditions = new ArrayList<>();

    public DiscountPolicy(DiscountCondition... conditions) {
        this.conditions= List.of(conditions);
    }
    abstract protected Money getDiscountAmount(Screening screening);
}

package chapter02.discountpolicy;

import chapter02.Screening;

public class AmountDiscountPolicy extends DiscountPolicy {
    private Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return null;
    }
}

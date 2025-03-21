package chapter02.discountpolicy;

import chapter02.Screening;

public class PercentDiscountPolicy extends DiscountPolicy {
    private double percent;

    public PercentDiscountPolicy(double percent) {
        this.percent = percent;
    }

    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return null;
    }
}

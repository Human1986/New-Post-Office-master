package com.epam.rd.autotasks;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collection;

public class NewPostOffice {
    private final Collection<Box> listBox;
    private static final int COST_KILOGRAM = 5;
    private static final int COST_CUBIC_METER = 100;
    private static final double COEFFICIENT = 0.5;

    public NewPostOffice() {
        listBox = new ArrayList<>();
    }

    public Collection<Box> getListBox() {
        return (Collection<Box>) ((ArrayList<Box>) listBox).clone();
    }

    static BigDecimal calculateCostOfBox(double weight, double volume, int value) {
        BigDecimal costWeight = BigDecimal.valueOf(weight)
                .multiply(BigDecimal.valueOf(COST_KILOGRAM), MathContext.DECIMAL64);
        BigDecimal costVolume = BigDecimal.valueOf(volume)
                .multiply(BigDecimal.valueOf(COST_CUBIC_METER), MathContext.DECIMAL64);
        return costVolume.add(costWeight)
                .add(BigDecimal.valueOf(COEFFICIENT * value), MathContext.DECIMAL64);
    }

    // implements student
    public boolean addBox(String addresser, String recipient, double weight, double volume, int value) {
        throw new UnsupportedOperationException();
    }

    // implements student
    public Collection<Box> deliveryBoxToRecipient(String recipient) {
        throw new UnsupportedOperationException();
    }

    public void declineCostOfBox(double percent) {
        throw new UnsupportedOperationException();
    }

}

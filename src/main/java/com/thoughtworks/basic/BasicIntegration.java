package com.thoughtworks.basic;

public class BasicIntegration implements Integration {
    @Override
    public int calculateIntegration(ConsumeRecord consumeRecord) {
        int result = 0;
        if (consumeRecord.getConsumeMode() == "POS机"){
            result = (int) Math.floor(consumeRecord.getConsumeAMT() / 10);
        }
        return result;
    }
}

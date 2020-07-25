package com.thoughtworks.basic;

public class ExtraQuickIntegration implements Integration {
    @Override
    public int calculateIntegration(ConsumeRecord consumeRecord) {
        int result = 0;
        if ("快捷支付".equals(consumeRecord.getConsumeMode()) ){
            result = (int) Math.floor(consumeRecord.getConsumeAMT() / 100) * 5;
        }
        result = result > 100 ? 100 : result;
        return result;
    }
}

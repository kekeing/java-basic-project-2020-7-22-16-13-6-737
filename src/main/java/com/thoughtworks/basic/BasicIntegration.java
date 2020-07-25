package com.thoughtworks.basic;

public class BasicIntegration implements Integration {
    @Override
    public int calculateIntegration(ConsumeRecord consumeRecord) {
        int result = 0;
        if ("POS机".equals(consumeRecord.getConsumeMode()) ){
            result = (int) Math.floor(consumeRecord.getConsumeAMT() / 10);
        }
        if ("微信支付".equals(consumeRecord.getConsumeMode())){
            result  = (int) Math.floor(consumeRecord.getConsumeAMT()/20);
        }
        return result;
    }
}

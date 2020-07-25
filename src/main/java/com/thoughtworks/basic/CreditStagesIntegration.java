package com.thoughtworks.basic;

public class CreditStagesIntegration  implements  Integration{
    @Override
    public int calculateIntegration(ConsumeRecord consumeRecord) {
        int result = 0;
        if ("信用卡分期购物".equals(consumeRecord.getConsumeMode()) ){
            result = result += consumeRecord.getConsumeAMT() > 5000 ? 100 : 0   ;
        }

        return result;
    }
}

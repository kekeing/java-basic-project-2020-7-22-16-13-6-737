package com.thoughtworks.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BasicIntegration implements Integration {
    private List<String> getOnePerTen = new ArrayList<>(Arrays.asList("POS机","快捷支付","信用卡分期购物"));
    @Override
    public int calculateIntegration(ConsumeRecord consumeRecord) {
        int result = 0;
        double actualIntegrationPerTen = Math.floor(consumeRecord.getConsumeAMT() / 10);
        double actualIntegrationPerTwenty = Math.floor(consumeRecord.getConsumeAMT() / 20);
        actualIntegrationPerTen = consumeRecord.getGoldCard() ? (actualIntegrationPerTen * 1.5) : actualIntegrationPerTen;
        actualIntegrationPerTwenty = consumeRecord.getGoldCard() ? (actualIntegrationPerTwenty * 1.5) : actualIntegrationPerTwenty;

        if (getOnePerTen.contains(consumeRecord.getConsumeMode()) ){
            result = (int) Math.floor(actualIntegrationPerTen);
        }
        if ("微信支付".equals(consumeRecord.getConsumeMode())){
            result  = (int) Math.floor(actualIntegrationPerTwenty);
        }

        return result;
    }
}

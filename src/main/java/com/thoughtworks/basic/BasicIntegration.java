package com.thoughtworks.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BasicIntegration implements Integration {
    private List<String> getOnePerTen = new ArrayList<>(Arrays.asList("POS机","快捷支付","信用卡分期购物"));
    @Override
    public int calculateIntegration(ConsumeRecord consumeRecord) {
        int result = 0;
        if (getOnePerTen.contains(consumeRecord.getConsumeMode()) ){
            result = (int) Math.floor(consumeRecord.getConsumeAMT() / 10);
        }
        if ("微信支付".equals(consumeRecord.getConsumeMode())){
            result  = (int) Math.floor(consumeRecord.getConsumeAMT()/20);
        }
        return result;
    }
}

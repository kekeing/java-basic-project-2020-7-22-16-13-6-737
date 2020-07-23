package com.thoughtworks.basic;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ConsumeRecord {
    private double consumeAMT;
    private String consumeMode;
    private Boolean isGoldCard;
    private  String consumeTime;

    public double getConsumeAMT() {
        return consumeAMT;
    }

    public String getConsumeMode() {
        return consumeMode;
    }

    public Boolean getGoldCard() {
        return isGoldCard;
    }

    public String getConsumeTime() {
        return consumeTime;
    }

    public ConsumeRecord(double consumeAMT, String consumeMode, Boolean isGoldCard) {
        this.consumeAMT = consumeAMT;
        this.consumeMode = consumeMode;
        this.isGoldCard = isGoldCard;
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.consumeTime = df.format(new Date());
    }
}

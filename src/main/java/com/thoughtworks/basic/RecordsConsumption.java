package com.thoughtworks.basic;

import java.util.List;

public class RecordsConsumption {
    public RecordsConsumption(List<ConsumeRecord> consumeRecords) {
        this.consumeRecords = consumeRecords;
    }

    private List<ConsumeRecord> consumeRecords;

    public List<ConsumeRecord> getConsumeRecords() {
        return consumeRecords;
    }

    public void setConsumeRecords(List<ConsumeRecord> consumeRecords) {
        this.consumeRecords = consumeRecords;
    }

    public void consume(double consumeAMT, String consumeMode, Boolean isGoldCard){
        ConsumeRecord consumeRecord = new ConsumeRecord(consumeAMT,consumeMode,isGoldCard);
        this.consumeRecords.add(consumeRecord);
    }
}

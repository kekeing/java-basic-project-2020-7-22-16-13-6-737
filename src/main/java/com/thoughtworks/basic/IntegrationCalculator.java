package com.thoughtworks.basic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntegrationCalculator {
    private List<Integration> integrationList = new ArrayList<>(Arrays.asList(new BasicIntegration()));
    public int calculateTotalIntegration(List<ConsumeRecord> consumeRecords) {
        int totalIntegration = 0;
        for (ConsumeRecord consumeRecord : consumeRecords){
            totalIntegration += this.calculateUnitRecordIntegration(consumeRecord);
        }
        return totalIntegration;
    }

    public int calculateUnitRecordIntegration(ConsumeRecord consumeRecord) {
        int result = 0;
        for (Integration integration : integrationList){
            result +=integration.calculateIntegration(consumeRecord);
        }
        return result;
    }
}

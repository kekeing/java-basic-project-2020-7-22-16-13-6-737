package com.thoughtworks.basic;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class POSConsumerTest {
    @Test
    public void should_return_1_integration_when_consume_use_pos_use_18(){
        List<ConsumeRecord> consumeRecords = new ArrayList<>();
        RecordsConsumption recordsConsumption = new RecordsConsumption(consumeRecords);
        IntegrationCalculator integrationCalculate = new IntegrationCalculator();
        recordsConsumption.consume(18,"POS机", Boolean.FALSE);

        int result = integrationCalculate.calculateTotalIntegration(recordsConsumption.getConsumeRecords());

        Assert.assertEquals(result,1);
    }

}

package com.thoughtworks.basic;

import org.junit.Assert;
import org.junit.Test;

public class POSConsumerTest {
    @Test
    public void should_return_1_integration_when_consume_use_pos_use_18(){
        RecordsConsumption recordsConsumption = new RecordsConsumption();

        recordsConsumption.consume(18,"POS机", False);

        int result = recordsConsumption.calculateTotalIntegration();

        Assert.assertEquals(result,1);
    }

}

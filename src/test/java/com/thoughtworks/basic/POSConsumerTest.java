package com.thoughtworks.basic;

import org.junit.Assert;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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

    @Test
    public void should_return_1_integration_when_consume_use_pos_use_18_and_23(){
        List<ConsumeRecord> consumeRecords = new ArrayList<>();
        RecordsConsumption recordsConsumption = new RecordsConsumption(consumeRecords);
        IntegrationCalculator integrationCalculate = new IntegrationCalculator();
        recordsConsumption.consume(18,"POS机", Boolean.FALSE);
        recordsConsumption.consume(23,"POS机", Boolean.FALSE);

        int result = integrationCalculate.calculateTotalIntegration(recordsConsumption.getConsumeRecords());

        Assert.assertEquals(result,3);
    }

    @Test
    public void should_return_1_integration_when_consume_use_pos_use_18_and_23_and_73(){
        List<ConsumeRecord> consumeRecords = new ArrayList<>();
        RecordsConsumption recordsConsumption = new RecordsConsumption(consumeRecords);
        IntegrationCalculator integrationCalculate = new IntegrationCalculator();
        recordsConsumption.consume(18,"POS机", Boolean.FALSE);
        recordsConsumption.consume(23,"POS机", Boolean.FALSE);
        recordsConsumption.consume(73,"POS机", Boolean.FALSE);

        int result = integrationCalculate.calculateTotalIntegration(recordsConsumption.getConsumeRecords());

        Assert.assertEquals(result,10);
    }
    @Test
    public void should_return_consume_messages_when_consume_use_pos_18(){
        List<ConsumeRecord> consumeRecords = new ArrayList<>();
        RecordsConsumption recordsConsumption = new RecordsConsumption(consumeRecords);
        IntegrationCalculator integrationCalculate = new IntegrationCalculator();
        recordsConsumption.consume(18,"POS机", Boolean.FALSE);
        StringBuilder expect = new StringBuilder();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        expect.append("总结分： 1").append("\n").append( df.format(new Date())).append(" POS机消费 ")
                .append("18.0元, ").append("积分 +").append(1);
        ConsumePrinter consumePrinter = new ConsumePrinter();


        String result = consumePrinter.print(recordsConsumption.getConsumeRecords());

        Assert.assertEquals(expect.toString(),result);
    }
    @Test
    public void should_return_1_integration_when_consume_use_weixin_use_23(){
        List<ConsumeRecord> consumeRecords = new ArrayList<>();
        RecordsConsumption recordsConsumption = new RecordsConsumption(consumeRecords);
        IntegrationCalculator integrationCalculate = new IntegrationCalculator();
        recordsConsumption.consume(23,"微信支付", Boolean.FALSE);

        int result = integrationCalculate.calculateTotalIntegration(recordsConsumption.getConsumeRecords());

        Assert.assertEquals(result,1);
    }
    @Test
    public void should_return_consume_messages_when_consume_use_weixin_23(){
        List<ConsumeRecord> consumeRecords = new ArrayList<>();
        RecordsConsumption recordsConsumption = new RecordsConsumption(consumeRecords);
        IntegrationCalculator integrationCalculate = new IntegrationCalculator();
        recordsConsumption.consume(23,"微信支付", Boolean.FALSE);
        StringBuilder expect = new StringBuilder();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        expect.append("总结分： 1").append("\n").append( df.format(new Date())).append(" 微信支付消费 ")
                .append("23.0元, ").append("积分 +").append(1);
        ConsumePrinter consumePrinter = new ConsumePrinter();


        String result = consumePrinter.print(recordsConsumption.getConsumeRecords());

        Assert.assertEquals(expect.toString(),result);
    }
    @Test
    public void should_return_320_integration_when_consume_use_kuaijie_use_2208(){
        List<ConsumeRecord> consumeRecords = new ArrayList<>();
        RecordsConsumption recordsConsumption = new RecordsConsumption(consumeRecords);
        IntegrationCalculator integrationCalculate = new IntegrationCalculator();
        recordsConsumption.consume(2208,"快捷支付", Boolean.FALSE);

        int result = integrationCalculate.calculateTotalIntegration(recordsConsumption.getConsumeRecords());

        Assert.assertEquals(result,320);
    }
    @Test
    public void should_return_30_integration_when_consume_use_kuaijie_use_208(){
        List<ConsumeRecord> consumeRecords = new ArrayList<>();
        RecordsConsumption recordsConsumption = new RecordsConsumption(consumeRecords);
        IntegrationCalculator integrationCalculate = new IntegrationCalculator();
        recordsConsumption.consume(208,"快捷支付", Boolean.FALSE);

        int result = integrationCalculate.calculateTotalIntegration(recordsConsumption.getConsumeRecords());

        Assert.assertEquals(result,30);
    }

    @Test
    public void should_return_consume_messages_when_consume_use_kuaijie_208(){
        List<ConsumeRecord> consumeRecords = new ArrayList<>();
        RecordsConsumption recordsConsumption = new RecordsConsumption(consumeRecords);
        IntegrationCalculator integrationCalculate = new IntegrationCalculator();
        recordsConsumption.consume(208,"快捷支付", Boolean.FALSE);
        StringBuilder expect = new StringBuilder();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        expect.append("总结分： 30").append("\n").append( df.format(new Date())).append(" 快捷支付消费 ")
                .append("208.0元, ").append("积分 +").append(30);
        ConsumePrinter consumePrinter = new ConsumePrinter();


        String result = consumePrinter.print(recordsConsumption.getConsumeRecords());

        Assert.assertEquals(expect.toString(),result);
    }
    @Test
    public void should_return_740_integration_when_consume_use_xinyongkafenqi_use_6400(){
        List<ConsumeRecord> consumeRecords = new ArrayList<>();
        RecordsConsumption recordsConsumption = new RecordsConsumption(consumeRecords);
        IntegrationCalculator integrationCalculate = new IntegrationCalculator();
        recordsConsumption.consume(6400,"信用卡分期购物", Boolean.FALSE);

        int result = integrationCalculate.calculateTotalIntegration(recordsConsumption.getConsumeRecords());

        Assert.assertEquals(result,740);
    }
    @Test
    public void should_return_1_integration_when_consume_with_golden_card_use_pos_use_21(){
        List<ConsumeRecord> consumeRecords = new ArrayList<>();
        RecordsConsumption recordsConsumption = new RecordsConsumption(consumeRecords);
        IntegrationCalculator integrationCalculate = new IntegrationCalculator();
        recordsConsumption.consume(18,"POS机", Boolean.TRUE);

        int result = integrationCalculate.calculateTotalIntegration(recordsConsumption.getConsumeRecords());

        Assert.assertEquals(result,3);
    }
}

package com.thoughtworks.basic;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ConsumePrinter {
    public String print(List<ConsumeRecord> consumeRecords) {
        IntegrationCalculator integrationCalculator = new IntegrationCalculator();
        StringBuilder result = new StringBuilder();
        int totalIntegration = integrationCalculator.calculateTotalIntegration(consumeRecords);
        result.append("总机分： ").append(totalIntegration);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        for (ConsumeRecord consumeRecord: consumeRecords){
            result.append("\n").append(df.format(new Date())).append(" ").append(consumeRecord.getConsumeMode())
                    .append("消费 ").append(consumeRecord.getConsumeAMT()).append("元, 积分 +")
                    .append(integrationCalculator.calculateUnitRecordIntegration(consumeRecord));
        }
        return result.toString();
    }
}

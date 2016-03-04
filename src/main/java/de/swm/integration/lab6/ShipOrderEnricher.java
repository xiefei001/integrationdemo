package de.swm.integration.lab6;

import de.swm.integration.lab6.domain.Shiporder;
import org.springframework.messaging.Message;

/**
 * Created by xie.fei on 04.03.2016.
 */
public class ShipOrderEnricher {
    public double computeTotal(Message<Shiporder> order){
        double sum = 0;
        for (Shiporder.Item item: order.getPayload().getItem()) {
            sum += item.getPrice().doubleValue() * item.getQuantity().intValue();
        }
        return sum;
    }
}

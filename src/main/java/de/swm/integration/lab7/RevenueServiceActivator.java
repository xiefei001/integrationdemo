package de.swm.integration.lab7;

import de.swm.integration.lab7.domain.Shiporder;
import org.springframework.messaging.Message;

/**
 * Created by xie on 2016/3/4.
 */
public class RevenueServiceActivator {

    private double revenue = 0.0;

    public Message<Shiporder> adjustRevenue(Message<Shiporder> order) {
        System.out.println("Processing order");
        for (Shiporder.Item item : order.getPayload().getItem()) {
            revenue = revenue + (item.getPrice().doubleValue() * item.getQuantity().intValue());
            System.out.println("Revenue now up to: " + revenue);
        }
        System.out.println("Done processing order");
        return order;
    }

}

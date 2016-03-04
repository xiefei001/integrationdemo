package de.swm.integration.lab7.domain;

/**
 * Created by xie.fei on 04.03.2016.
 */
import javax.xml.bind.annotation.XmlRegistry;


@XmlRegistry
public class ObjectFactory {


    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Shiporder }
     *
     */
    public Shiporder createShiporder() {
        return new Shiporder();
    }

    /**
     * Create an instance of {@link Shiporder.Shipto }
     *
     */
    public Shiporder.Shipto createShiporderShipto() {
        return new Shiporder.Shipto();
    }

    /**
     * Create an instance of {@link Shiporder.Item }
     *
     */
    public Shiporder.Item createShiporderItem() {
        return new Shiporder.Item();
    }

}

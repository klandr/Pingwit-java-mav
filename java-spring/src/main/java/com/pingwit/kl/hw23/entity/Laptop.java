package com.pingwit.kl.hw23.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Enumerated(EnumType.STRING)
    private Producer producer;
    @Enumerated(EnumType.STRING)
    private Processor processor;

    private BigDecimal price;

    public Laptop(){
    }

    public long getId() {
        return id;
    }

    /*public void setId(long id) {
        this.id = id;
    }*/

    public Producer getProducer() {
        return producer;
    }

    /*public void setProducer(Producer producer) {
        this.producer = producer;
    }*/

    public Processor getProcessor() {
        return processor;
    }

    /*public void setProcessor(Processor processor) {
        this.processor = processor;
    }*/

    public BigDecimal getPrice() { //BigDecimal
        return price;
    }

    /*public void setPrice(BigDecimal price) {
        this.price = price;
    }*/

}

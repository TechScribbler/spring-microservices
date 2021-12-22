package org.techscribbler.microservices.limitsservice;


import org.springframework.stereotype.Component;


@org.springframework.context.annotation.Configuration
public class Configuration {

    private int maximum;
    private int minimum;

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }
}

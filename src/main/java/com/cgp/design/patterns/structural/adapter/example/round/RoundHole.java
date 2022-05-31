package com.cgp.design.patterns.structural.adapter.example.round;

/**
 * 让方钉适配圆孔
 * 将方钉 放入 圆孔中
 * 圆孔
 * RoundHoles are compatible with RoundPegs.
 */
public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg peg) {
        boolean result;
        result = (this.getRadius() >= peg.getRadius());
        return result;
    }
}
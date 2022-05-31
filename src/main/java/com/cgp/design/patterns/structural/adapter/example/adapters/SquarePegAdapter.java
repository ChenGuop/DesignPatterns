package com.cgp.design.patterns.structural.adapter.example.adapters;

import com.cgp.design.patterns.structural.adapter.example.round.RoundPeg;
import com.cgp.design.patterns.structural.adapter.example.square.SquarePeg;

/**
 * Adapter allows fitting square pegs into round holes.
 * 适配器允许将方形钉安装到圆孔中。
 */
public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double result;
        // Calculate a minimum circle radius, which can fit this peg.
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }
}
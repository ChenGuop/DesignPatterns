package com.cgp.design.patterns.creational.abstract_factory.example.checkboxes;

/**
 * @author chen_guo_peng
 * @create 2022/3/23
 */
public class WindowsCheckbox implements Checkbox {
    @Override
    public void print() {
        System.out.println("You have created WindowsCheckbox.");
    }
}

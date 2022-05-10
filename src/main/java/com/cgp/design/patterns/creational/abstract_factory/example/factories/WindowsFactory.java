package com.cgp.design.patterns.creational.abstract_factory.example.factories;

import com.cgp.design.patterns.creational.abstract_factory.example.button.Button;
import com.cgp.design.patterns.creational.abstract_factory.example.button.WindowsButton;
import com.cgp.design.patterns.creational.abstract_factory.example.checkboxes.Checkbox;
import com.cgp.design.patterns.creational.abstract_factory.example.checkboxes.WindowsCheckbox;

/**
 * @author chen_guo_peng
 * @create 2022/3/23
 */
public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}

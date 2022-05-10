package com.cgp.design.patterns.creational.abstract_factory.example.factories;

import com.cgp.design.patterns.creational.abstract_factory.example.button.Button;
import com.cgp.design.patterns.creational.abstract_factory.example.button.MacOsButton;
import com.cgp.design.patterns.creational.abstract_factory.example.checkboxes.Checkbox;
import com.cgp.design.patterns.creational.abstract_factory.example.checkboxes.MacOsCheckbox;

/**
 * @author chen_guo_peng
 * @create 2022/3/23
 */
public class MacOsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOsCheckbox();
    }
}

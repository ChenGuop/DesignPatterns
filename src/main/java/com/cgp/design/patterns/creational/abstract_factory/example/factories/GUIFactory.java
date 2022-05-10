package com.cgp.design.patterns.creational.abstract_factory.example.factories;

import com.cgp.design.patterns.creational.abstract_factory.example.button.Button;
import com.cgp.design.patterns.creational.abstract_factory.example.checkboxes.Checkbox;

/**
 * @author chen_guo_peng
 * @create 2022/3/23
 */
public interface GUIFactory {
    Button createButton();

    Checkbox createCheckbox();
}

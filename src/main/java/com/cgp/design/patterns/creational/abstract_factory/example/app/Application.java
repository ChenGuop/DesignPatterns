package com.cgp.design.patterns.creational.abstract_factory.example.app;

import com.cgp.design.patterns.creational.abstract_factory.example.button.Button;
import com.cgp.design.patterns.creational.abstract_factory.example.checkboxes.Checkbox;
import com.cgp.design.patterns.creational.abstract_factory.example.factories.GUIFactory;

/**
 * @author chen_guo_peng
 * @create 2022/3/23
 */
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.print();
    }
}

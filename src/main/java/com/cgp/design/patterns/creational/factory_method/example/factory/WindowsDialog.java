package com.cgp.design.patterns.creational.factory_method.example.factory;

import com.cgp.design.patterns.creational.factory_method.example.buttons.Button;
import com.cgp.design.patterns.creational.factory_method.example.buttons.WindowsButton;

/**
 * @author chen_guo_peng
 * @create 2022/3/23
 */
public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}

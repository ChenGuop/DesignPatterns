package com.cgp.design.patterns.creational.factory_method.example.factory;

import com.cgp.design.patterns.creational.factory_method.example.buttons.Button;

/**
 * 基础工厂类。请注意，“工厂”仅仅是类的一个角色。
 * 它应该有一些需要创建不同产品的核心业务逻辑。
 * @author chen_guo_peng
 * @create 2022/3/23
 */
public abstract class Dialog {
    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    /**
     * Subclasses will override this method in order to create specific button objects.
     *      * 基础工厂类。请注意，“工厂”仅仅是类的一个角色。它应该有一些需要创建不同产品的核心业务逻辑。
     * @return
     */
    public abstract Button createButton();
}

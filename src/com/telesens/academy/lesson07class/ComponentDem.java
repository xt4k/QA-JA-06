package com.telesens.academy.lesson07class;

import com.telesens.academy.lesson07class.model.Button;
import com.telesens.academy.lesson07class.model.Component;
import com.telesens.academy.lesson07class.model.Label;

public class ComponentDem {
        public static void main(String[] args) {
            Component[] components = new Component[] {
                    new Component(),
                    new Component(),
                    new Button(),
                    new Label(),
                    new  Button(),
                    new Label()
            };
            Button btn =new Button();
            btn.draw();

            for (int i =0;i<components.length; i++) {
                if (components[i] instanceof Component) {
                    Component item = (Component) components[i];
                }
                components[i].draw();
            }
        }
}
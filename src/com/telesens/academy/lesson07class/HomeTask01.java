package com.telesens.academy.lesson07class;

import com.telesens.academy.lesson07class.model.Button;
import com.telesens.academy.lesson07class.model.Component;
import com.telesens.academy.lesson07class.model.Label;
import com.telesens.academy.lesson07class.model.VisualComponent;

public class HomeTask01 {
    public static void main(String[] args) {
        VisualComponent anonymous_lambdaVar = new VisualComponent() {
            @Override
            public void draw() {
                System.out.println("anonymous variable is here ");
            }
        };
        VisualComponent[] vComponents = new VisualComponent[]{
                new Button(),
                new Label(),
                new Component(),
                new VisualComponent() {
                    @Override
                    public void draw() {
                        System.out.println("Anonymous component");

                    }

                }, () -> System.out.println("Lambda component")};



       for (VisualComponent item: vComponents){
           item.draw();
           item.draw3D();

       }
        System.out.println();

    }
}


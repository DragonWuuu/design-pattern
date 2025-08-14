package com.dragon.app;

public abstract class ComponentDecorator implements Component {
    protected Component component;

    public ComponentDecorator(Component component) {
        this.component = component;
    }
}

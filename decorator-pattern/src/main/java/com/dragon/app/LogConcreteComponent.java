package com.dragon.app;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LogConcreteComponent extends ComponentDecorator{
    public LogConcreteComponent(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        // 在调用原始实现前添加日志
        log.info("LogConcreteComponent operation before");
        // 调用原始实现
        super.component.operation();
        // 在调用原始实现后添加日志
        log.info("LogConcreteComponent operation after");
    }
}

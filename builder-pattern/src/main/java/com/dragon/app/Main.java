package com.dragon.app;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        ComputeBuilder computeBuilder = new GamingComputeBuilder();
        computeBuilder.cpu("9800x3d");
        computeBuilder.memory("32G");
        computeBuilder.disk("1T");
        computeBuilder.gpu("RTX5060");
        Compute compute = computeBuilder.build();
        log.info("compute: {}", compute);
    }
}

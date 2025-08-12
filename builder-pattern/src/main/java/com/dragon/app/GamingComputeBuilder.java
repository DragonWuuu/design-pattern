package com.dragon.app;

public class GamingComputeBuilder extends ComputeBuilder {
    @Override
    public void cpu(String cpu) {
        super.compute.setCpu(cpu);
    }

    @Override
    public void memory(String memory) {
        super.compute.setMemory(memory);
    }

    @Override
    public void disk(String disk) {
        super.compute.setDisk(disk);
    }

    @Override
    public void gpu(String gpu) {
        super.compute.setGpu(gpu);
    }
}

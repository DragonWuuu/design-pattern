package com.dragon.app;

public abstract class ComputeBuilder {
    protected final Compute compute = new Compute();

    public abstract void cpu(String cpu);
    public abstract void memory(String memory);
    public abstract void disk(String disk);
    public abstract void gpu(String gpu);

    public Compute build() {
        return compute;
    }
}

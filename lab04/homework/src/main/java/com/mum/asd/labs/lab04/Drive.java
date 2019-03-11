package com.mum.asd.labs.lab04;

public class Drive extends FileComposite{

    public Drive(String name) {
        super(name);
    }

    @Override
    public void print() {
        fileComponents.stream().forEach(FileComponent::print);
    }
}

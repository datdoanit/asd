package com.mum.asd.labs.lab04;

public class Directory extends FileComposite {

    public Directory(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("-- dir " + name + " size=" + getSizeInBytes() + " bytes");
        fileComponents.stream().forEach(FileComponent::print);
    }
}

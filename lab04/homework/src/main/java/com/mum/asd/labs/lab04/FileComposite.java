package com.mum.asd.labs.lab04;

import java.util.ArrayList;
import java.util.List;

public abstract class FileComposite implements FileComponent{
    protected String name;
    protected final List<FileComponent> fileComponents = new ArrayList<>();

    public FileComposite(String name) {
        this.name = name;
    }

    public void addComponent(FileComponent fileComponent) {
        fileComponents.add(fileComponent);
    }

    @Override
    public int getSizeInBytes() {
        return fileComponents.stream().mapToInt(FileComponent::getSizeInBytes).sum();
    }
}

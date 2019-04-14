package com.mum.asd.labs.lab04;

public class File implements FileComponent{
    private String name;
    private int sizeInBytes;

    public File(String name, int sizeInBytes) {
        this.name = name;
        this.sizeInBytes = sizeInBytes;
    }

    @Override
    public int getSizeInBytes() {
        return sizeInBytes;
    }

    @Override
    public void print() {
        System.out.println("--- file " + name + " size=" + getSizeInBytes() + "bytes");
    }
}

package com.prajwal.week3.practice12;

interface SampleInterface{
    void sampleMeth1();
    void sampleMeth2();
}
interface childSampleInterface extends SampleInterface{
    void sampleMeth3();
    void sampleMeth4();
}
class SampleClass implements childSampleInterface{
    @Override
    public void sampleMeth1() {
        System.out.println("Method no 1");
    }
    @Override
    public void sampleMeth2() {
        System.out.println("Method no 2");
    }
    @Override
    public void sampleMeth3() {
        System.out.println("Method no 3");
    }
    @Override
    public void sampleMeth4() {
        System.out.println("Method no 4");
    }

}
public class InheritanceOfInterface {
    public static void main(String[] args) {
        SampleClass sampleClass = new SampleClass();
        sampleClass.sampleMeth1();
        sampleClass.sampleMeth2();
        sampleClass.sampleMeth3();
        sampleClass.sampleMeth4();
    }
}

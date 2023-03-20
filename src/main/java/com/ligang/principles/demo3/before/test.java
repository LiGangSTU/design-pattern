package com.ligang.principles.demo3.before;

public class test {
    public static void main(String[] args) {
        Cpu cpu = new IntelCpu();
        HardDisk disk = new XiJieHardDisk();
        Memory memory = new KingstonMemory();

        Computer computer = new Computer();
        computer.setCpu(cpu);
        computer.setDisk(disk);
        computer.setMemory(memory);
        computer.run();
    }
}

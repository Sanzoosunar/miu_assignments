package assignment5.question5;

import java.util.Objects;

public class Computer {
   private String manufacturer;
   private String processor;
   private int ramSize;
   private double processorSpeed;

    public Computer(String manufacturer, String processor, int ramSize,
                    double processorSpeed) {
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.ramSize = ramSize;
        this.processorSpeed = processorSpeed;
    }

    public int getRamSize(){
        return this.ramSize;
    }
    public double getProcessorSpeed(){
        return this.processorSpeed;
    }
    public double computePower(){
        return this.ramSize*this.processorSpeed;
    }
    @Override
    public String toString() {
        return "Computer={" +
                "manufacturer:" + this.manufacturer +
                "processor:" + this.processor +
                "ramSize:" + this.ramSize +
                "processorSpeed:" + this.processorSpeed +
                "\n}";
    }
    @Override
    public boolean equals(Object obj){
        if(this==obj) return true;
        if(obj==null || getClass()!=obj.getClass()) return false;
        Computer comp = (Computer) obj;
        return manufacturer== comp.manufacturer && processor==comp.processor&&
                ramSize==comp.ramSize && processorSpeed==comp.processorSpeed;
    }

    @Override
    public int hashCode(){
        return Objects.hash(manufacturer,processor,ramSize,processorSpeed);
    }
}

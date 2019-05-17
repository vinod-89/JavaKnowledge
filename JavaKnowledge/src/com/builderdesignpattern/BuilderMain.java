package com.builderdesignpattern;

public class BuilderMain {
public static void main(String[] args) {
Computer c=new Computer.ComputerBuilder("cas","").build();
System.out.println(c.getHdd()+" "+c.getRam());
}
}
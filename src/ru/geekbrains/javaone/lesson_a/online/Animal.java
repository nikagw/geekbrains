package ru.geekbrains.javaone.lesson_a.online;

public  class Animal {
    String name;
    int pathLength;
    int swim;
    float height;

    public Animal (String name, int pathLength, float height, int swim) {
        this.name = name;
        this.pathLength = pathLength;
        this.height = height;
        this.swim = swim;
    }
    public Animal (String name, int pathLength, float height) {
        this.name = name;
        this.pathLength = pathLength;
        this.height = height;
    }
    public void run(int pathLength) {
        if(this.pathLength >= pathLength) System.out.println(name + " run " + pathLength + " m.");
    }

    public void jump(float height) {
        if(this.height >= height) System.out.println(name + " jump over " + height + " m.");
    }

    public void swim (int swim) {
        if(this.swim >= swim) System.out.println(name + " swim " + swim + " m.");
    }

}

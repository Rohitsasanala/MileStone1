package com.wipro.Inheritance;
class  Animal{
public void eat()
{
    System.out.println("Animal Eat");
}
public void sleep()
{
    System.out.println("Animal Sleep");
}
}
 class Bird extends Animal
{
    @Override
    public void eat()
    {
        System.out.println("Bird Eat");
    }
    @Override
    public void sleep()
    {
        System.out.println("Bird sleep");
    }
    public void fly()
    {
        System.out.println("Bird fly");
    }
}
 class Ex1{
    public static void main(String args[])
    {
        Animal A=new Animal();
        Bird  B=new Bird();
        System.out.println();
        A.eat();
        A.sleep();
        B.eat();
        B.sleep();
        B.fly();
    }
}


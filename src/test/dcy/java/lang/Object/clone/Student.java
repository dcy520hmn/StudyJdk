package test.dcy.java.lang.Object.clone;

import test.dcy.java.lang.Object.clone.p1.Person;

public class Student extends Person implements Cloneable{

    public String name = "zs";

    @Override
    protected void sayHello() {
        super.sayHello();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

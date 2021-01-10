package test.dcy.java.lang.Object.clone;

import test.dcy.java.lang.Object.clone.p1.Person;

/**
 * clone方法：
 *    native关键字作用
 *    protected关键字特点：包内可见，子类可见
 *    clone：需要实现cloneable接口来标识可以进行克隆
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person();
        Student student = new Student();
        Student studentClone = (Student) student.clone();
    }
}

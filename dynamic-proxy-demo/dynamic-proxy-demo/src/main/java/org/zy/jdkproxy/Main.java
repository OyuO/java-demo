package org.zy.jdkproxy;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Animal proxy = (Animal) DynamicProxyAnimal.getProxy(cat);
        proxy.call();
    }
}

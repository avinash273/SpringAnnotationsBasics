package com.avinash.designpatterns;

class Container<T extends Number>{
    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void show(){
        System.out.println(value.getClass().getName());
    }
}

public class Generics {
    public static void main(String[] args) {
        Container<Integer> obj = new Container<>();
        System.out.println("asdasdasd");
        obj.setValue(10);
        obj.show();
    }
}

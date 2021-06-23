package com.Anurag;

public interface AbstractFactory<T>{
     T getItem(String name);
}

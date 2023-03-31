package etu2034.framework.DataObject;

import etu2034.framework.annotation.MethodAnnotation;

public class Person {

    @MethodAnnotation(url="salut")
    public String Hello(){ return "Hello Framework"; }
}

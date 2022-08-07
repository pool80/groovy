package com.dmdev

class HelloWorld {

    Integer value

    static void main(String[] args) {
        String value = "Hello World"
        Class<String> clazz = value.getClass()
        assert clazz == String.class
        println "Hello world"
        println clazz.getClassLoader()
    }
}

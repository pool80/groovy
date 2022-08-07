package com.dmdev.lesson14

class MapRunner {

    static void main(String[] args) {
        // def map [:]
        def map = ["one": 1, "two": 2]
        assert map.getClass() == LinkedHashMap

        //read
        map.get("one") == 1
        assert map["one"] == 1
        assert map."one" == 1
        //если в качестве ключа string можно опустить кавычки
        assert map.one == 1
        //значение по умолчанию 10
        assert map.get("qwe", 10) == 10

        //write
        map.one = 111
        map.three = 333

        // new method
        assert map.subMap("one", "two") == ["one": 111, "two": 2]

        //new operator spread
        def newMap = ["q": 22, "rt": 99, *:map]
        println newMap
    }
}

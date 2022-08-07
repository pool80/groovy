package com.dmdev.lesson14

class GroovyMultimap {
    Map map = [:]

    public boolean put(Object key, Object value) {
        List list = map.get(key, [])
        list.add(value)
        map."$key" = list
    }
}
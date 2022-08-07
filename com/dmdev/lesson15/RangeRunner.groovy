package com.dmdev.lesson15

class RangeRunner {

    static void main(String[] args) {
        def range  = 2..<8
        assert range.getClass() == IntRange

        assert range.get(3) == 5
        assert !range.contains(8)

        range.each { println it}
        println "\n"
        ('a'..'d').each { println it}
        println "\n"
        (WeekDay.MO..WeekDay.FR).each { println it}
    }
}

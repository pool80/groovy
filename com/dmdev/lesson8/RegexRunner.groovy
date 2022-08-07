package com.dmdev.lesson8

import java.util.regex.Matcher
import java.util.regex.Pattern

class RegexRunner {
    static void main(String[] args) {
        String value = "one 1 two 22 three 333"
        //классический способ с экранированием
        //String regex = "\\w+ \\d+"
        //без экранирования
        String regex1 = /(\w+) (\d+)/

        //Pattern pattern = Pattern.compile(regex1)

        //упрощенный вариант Pattern.compile
        Pattern pattern = ~regex1
        //Matcher matcher = pattern.matcher(value)
        //упрощенный matcher
        Matcher matcher = value =~ regex1

        //boolean result = matcher.matches()
        //упрощенный boolean
        boolean result = value =~ regex1
        println result

//        while (matcher.find()) {
//            println matcher.group()
//            println matcher.group(1)
//            println matcher.group(2)
//            println "-----"
//        }
        // упрощенные группы
//        println matcher[0]
//        println matcher[1]
//        println matcher[1][2]
//        println matcher[2]

//        println matcher[1..2]

        //foreach для коллекций
        //matcher.each (group -> println group)

        matcher.each((group, group1, group2) -> {
            println group
            println group1
            println group2
        })
    }
}

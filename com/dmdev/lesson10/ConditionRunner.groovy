package com.dmdev.lesson10

class ConditionRunner {

    /**
     * boolean              is true
     * Collection/Map       is not empty
     * Matcher              has match
     * string/Gstring       is not empty
     * Number/Char          !=0
     * refernce             !=0
     *
     * asBoolean
     */

    static void main(String[] args) {
        int x = 0
        //boolean booleanResult = x > 0

        if (x) {
            println x
        }

        def person = new Person(19)
        if(person) {
            println person.getId()
        }

//        if (person != null) {
//            person.getId()
//        }
//        person?.getId()

        if (x) {
            println x
        } else {
            println 1
        }

        //def result = x != null ? x : 1
        def result = x ?: 1
        println result
    }
}

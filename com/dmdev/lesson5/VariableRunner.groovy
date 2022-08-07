package com.dmdev.lesson5

import groovy.transform.CompileStatic

//import java.sql.Date
import java.sql.Date as SqlDate

class VariableRunner {

    /**
     * byte, short, int, long, BigInteger
     * float, double, BigDecimal
     * char
     */

    // для отображения ошибок компиляции
    @CompileStatic
    // можно писать static def main(def String[] args)
    static void main(String[] args) {
        // Integer value = 5
        def value = 5
        // BigInteger value2 = 36G
        def value2 = 36G
        // BigDecimal value3 = 3.3G
        def value3 = 3.3G
        new Date()
//        new SqlDate()
    }
}

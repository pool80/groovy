package com.dmdev.lesson7

/**
 * задать строку
 * " "
 * ''
 * """ """
 * ''' '''
 * / /
 * $/ /$
 */

def name = "Ivan"
def value = 'Hello "Hi!"'

def stringValue = "Hello $name"

println stringValue

def value2 = """
SELECT *
FROM
table where name = ${getWithPrefix(name)}
"""

println value2

def value3 = '''
SELECT *
FROM
table where name = $name
'''

println value3

//для регулярок, не надо экранировать кавычки
def value5 = /Hello world $name/
println value5
//Не надо экранировать $
def value6 = $/Hello world $name/$
println value6

println name[2]
println name[-1]
println name[1..3]
println name * 3
println name - 'Iv'
println name - 'an'

def getWithPrefix(String name) {
    "prefix-" + name
}



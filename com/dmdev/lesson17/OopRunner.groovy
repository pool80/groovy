package com.dmdev.lesson17

class OopRunner {

    static void main(String[] args) {
        def student = new Student()
        student.firstName = "Ivan" // setFirstName

        println student.firstName
        println student['firstName']
        println student.firstName
        // обращение напрямую Не рекомендуется
        println student.@firstName

        def student1 = new Student(firstName: "Petr", lastName: "Petrov", age: 18)
        println student1

        Student student2 = ['Sveta', 'Svetikova', 30]
        println student2

        def (fn, ln) = student2
        println fn
        println ln

        [student1, student2].collect {it.firstName}
        [student1, student2]*.firstName
        [student1, student2].firstName
    }
}

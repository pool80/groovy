package com.dmdev.lesson13

class ListRunner {

    static void main(String[] args) {
        def list = [1, 3, 5, 6]

        // read
        assert list[2] == 5
        assert list.get(2) == 5
        assert list[-1] == 6
        assert list[1..3] == [3, 5, 6]
        assert list[8] == null

        //write
        list += 9
        list << 11 << 13 << 7 << 7
        assert list == [1, 3, 5, 6, 9, 11, 13, 7, 7]
        //отнять
        list -= 7
        assert list == [1, 3, 5, 6, 9, 11, 13]
        list -= [1, 3]
        assert list == [5, 6, 9, 11, 13]
        // умножить
        list *=3

        // method from queue
        list.push(999)
        assert list.pop() == 999
        assert list.head() == 5
        assert list.tail() == 5
    }
}

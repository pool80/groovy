package com.dmdev.lesson14

class MultiMap {
    static void main(String[] args) {

        //1 решение
        Map<String, List<String>> hm = new HashMap<String, List<String>>();
        List<String> values = new ArrayList<String>();
        values.add("Value 1");
        values.add("Value 2");
        hm.put("Key1", values);

//        println hm.Key1[1]

        //2 решение
        def servers = [
                algol01:['algol04','algol01'],
                tonnant03:['tonnant03', 'tonnant04']
        ]

//        println servers.algol01[0]
//        println servers.tonnant03[1]
        servers.each { entry ->
            def val1 = entry.value[0]
            println val1
            def val2 = entry.value[1]
            println val2
        }

//        for (it.key in servers) {
//
//        }
    }
}

package com.example.main

import com.example.servicea.ServiceAQuery1Query
import com.example.servicea.ServiceAQuery2Query
import com.example.serviceb.ServiceBQuery1Query
import com.example.serviceb.ServiceBQuery2Query

fun main() {
    // Defined in :graphqlSchema / service-a
    ServiceAQuery1Query()

    // Defined in :feature1 / service-a
    ServiceAQuery2Query()


    // Defined in :graphqlSchema / service-b
    ServiceBQuery1Query()

    // Defined in :feature1 / service-b
    ServiceBQuery2Query()
}

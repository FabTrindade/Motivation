package com.fabscorp.motivation.infra

class MotivationConstants private constructor(){ //No one can instantiate this class

    object KEY {
        const val USER_NAME = "USER_NAME"
    }

    object FILTER {
        const val ALL = 1
        const val HAPPY = 2
        const val SUNNY = 3
    }
}
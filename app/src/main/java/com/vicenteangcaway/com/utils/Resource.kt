package com.vicenteangcaway.com.utils

//main purpose is to hold data. In such classes
//utility class that will be responsible to communicate the current state of Network call to UI Layer
data class Resource<out T>(val status : Status, val data: T? , val message: String?) {

    //A companion object is a specific type of object declaration that allows an object to act similar to static objects in other languages(Java)
    companion object{

        fun <T> success(data: T?) : Resource<T>{
            return Resource(Status.SUCCESS, data, null)
        }

        fun <T> error(msg: String, data: T?): Resource<T>{
            return Resource(Status.ERROR, data, msg)
        }

        fun<T> loading(data: T?): Resource<T>{
            return Resource(Status.LOADING, data,null)
        }

    }
}
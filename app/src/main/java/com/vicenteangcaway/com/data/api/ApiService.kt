package com.vicenteangcaway.com.data.api

import com.vicenteangcaway.com.data.model.User
import io.reactivex.Single

interface ApiService {
    fun getUsers(): Single<List<User>>
}
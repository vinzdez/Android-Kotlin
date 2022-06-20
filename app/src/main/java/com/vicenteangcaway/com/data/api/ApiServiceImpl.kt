package com.vicenteangcaway.com.data.api

import com.vicenteangcaway.com.data.model.User
import io.reactivex.Single


class ApiServiceImpl : ApiService {
    override fun getUsers(): Single<List<User>> {
        TODO("Not yet implemented")
    }
}
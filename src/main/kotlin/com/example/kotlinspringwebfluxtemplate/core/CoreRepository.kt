package com.example.kotlinspringwebfluxtemplate.core

import org.springframework.data.repository.kotlin.CoroutineCrudRepository

interface CoreRepository : CoroutineCrudRepository<Core, String>

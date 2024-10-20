package com.example.kotlinspringwebfluxtemplate.core

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table(name="cores")
class Core (
    @Id val id: String
)

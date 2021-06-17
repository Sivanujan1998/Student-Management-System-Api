package com.Sivanujan.Uni.Modules.student

import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Student (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: UUID?=null,

    var firstname: String? = null,
    var lastname: String? = null,
    var email: String? = null,

    )
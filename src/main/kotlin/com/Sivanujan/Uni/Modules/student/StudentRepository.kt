package com.Sivanujan.Uni.Modules.student

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface StudentRepository:CrudRepository<Student, UUID> {

}
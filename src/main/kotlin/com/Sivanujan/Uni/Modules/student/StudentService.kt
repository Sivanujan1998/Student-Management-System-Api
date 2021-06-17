package com.Sivanujan.Uni.Modules.student

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class StudentService (@Autowired val  studentRepository:StudentRepository)
//Autowired<---injection
{
    fun saveStudent(student:Student): Student? {
        return this.studentRepository.save(student)
    }
    fun getAllStudent():MutableIterable<Student>{
        return this.studentRepository.findAll()
    }
}
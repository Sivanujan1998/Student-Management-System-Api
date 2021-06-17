package com.Sivanujan.Uni.Modules.student

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("api/students")

class StudentController(@Autowired val studentservice:StudentService)  {

  @PostMapping
  fun saveStudentdetails(@RequestBody student:Student): Student? {
      return this.studentservice.saveStudent(student)
  }

    @GetMapping
    fun getAllStudents():MutableIterable<Student>{
        return  this.studentservice.getAllStudent()
    }
}
//continue
package com.example.springboot_3_03;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository<Course> extends CrudRepository<Course, Long>  {

}

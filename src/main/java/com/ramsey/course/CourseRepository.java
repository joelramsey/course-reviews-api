package com.ramsey.course;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by joel on 5/14/17.
 */
public interface CourseRepository extends CrudRepository<Course, Long> {
}

package com.example.rest_lesson;

import com.example.rest_lesson.model.Log;
import org.springframework.data.repository.CrudRepository;

public interface LogRepository extends CrudRepository<Log,Long> {
}

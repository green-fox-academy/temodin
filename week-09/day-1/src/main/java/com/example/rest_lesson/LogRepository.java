package com.example.rest_lesson;

import com.example.rest_lesson.model.Log;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LogRepository extends CrudRepository<Log,Long> {

}

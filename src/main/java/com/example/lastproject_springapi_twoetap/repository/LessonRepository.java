package com.example.lastproject_springapi_twoetap.repository;

import com.example.lastproject_springapi_twoetap.dto.response.LessonResponse;
import com.example.lastproject_springapi_twoetap.entities.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LessonRepository extends JpaRepository<Lesson, Long > {
    List<Lesson> getLessonByCourseId(Long courseId);

    @Query("select new com.example.lastproject_springapi_twoetap.dto.response.LessonResponse(l.id , l.lessonName ,l.course.courseName)from Lesson l")
    List<LessonResponse> getAllLessons();

}

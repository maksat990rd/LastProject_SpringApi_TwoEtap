package com.example.lastproject_springapi_twoetap.repository;


import com.example.lastproject_springapi_twoetap.dto.response.CourseResponse;
import com.example.lastproject_springapi_twoetap.entities.Course;
import org.springframework.data.domain.Pageable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

//@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findCoursesByCompanyId(Long id);

    @Query("select new com.example.lastproject_springapi_twoetap.dto.response.CourseResponse(c.id," +
            "c.courseName,c.duration,c.image,c.description,c.dateOfStart," +
            "c.company.companyName) from Course c")
    List<CourseResponse> getAllCourses();

    @Query("select c from Course c where upper(c.courseName) like concat('%',:text, '%') ")
    List<Course> searByCourseName(@Param("text") String text, Pageable pageable);

    //  @Query("select count (i) from Instructor i where i.company.companyName =?1")
    //    Long countInstructorsByCompanyName(@Param("companyName") String  companyName);

    @Query("select count(c) from Course c where c.company.companyName =?1")
    Long countCoursesByCompanyName(@Param("companyName") String companyName);

}

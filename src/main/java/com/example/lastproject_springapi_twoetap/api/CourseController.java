package com.example.lastproject_springapi_twoetap.api;

import com.example.lastproject_springapi_twoetap.dto.requests.CourseRequest;
import com.example.lastproject_springapi_twoetap.dto.response.CourseResponse;
import com.example.lastproject_springapi_twoetap.responseView.CourseResponseView;
import com.example.lastproject_springapi_twoetap.services.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/course")
@PreAuthorize("hasAnyAuthority('ADMIN')")
@RequiredArgsConstructor

public class CourseController {
    private final CourseService courseService;

    @GetMapping
    @PreAuthorize("hasAnyAuthority('ADMIN','MANAGER')")
    public List<CourseResponse> getAllCourses() {
        return courseService.getAllCourse();
    }

    @PostMapping("/saveCourse")
    public CourseResponse saveCourse(@RequestBody CourseRequest courseRequest) {
        return courseService.saveCourse(courseRequest);
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAnyAuthority('ADMIN','MANAGER')")
    public CourseResponse getCourseById(@PathVariable Long id) {
        return courseService.getCourseById(id);
    }

    @PutMapping("/{id}")
    public CourseResponse updateCourseById(@PathVariable Long id,
                                           @RequestBody CourseRequest courseRequest) {
        return courseService.updateCourseById(id, courseRequest);
    }

    @DeleteMapping("/{id}")
    public CourseResponse deleteCourseById(@PathVariable Long id) {
        return courseService.deleteCourse(id);
    }


    @GetMapping("/coursePagination")
    public CourseResponseView getAllCoursesPagination(@RequestParam(name = "text",required = false)
                                                  String text,
                                                      @RequestParam int page ,
                                                      @RequestParam int size) {
        return courseService.getAllCoursesPagination(text, page, size);
    }

    @GetMapping("/{companyName}/count")
    public Long getCountOfCoursesByCompanyName(@PathVariable String companyName) {
        return courseService.getCountOfCoursesByCompanyName(companyName);

    }
}

package com.example.lastproject_springapi_twoetap.repository;

import com.example.lastproject_springapi_twoetap.dto.response.VideoResponse;
import com.example.lastproject_springapi_twoetap.entities.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

//@Repository
public interface VideoRepository extends JpaRepository<Video, Long> {

    @Query("select v from Video v where v.lesson.id =:lessonId")
    List<Video> getVideoByLessonId(@Param("lessonId") Long lessonId);

    @Query("select new com.example.lastproject_springapi_twoetap.dto.response.VideoResponse(v.id," +
            "v.videoName,v.link ,v.lesson.id, v.lesson.lessonName)from Video v")
    List<VideoResponse> getAllVideos();
}

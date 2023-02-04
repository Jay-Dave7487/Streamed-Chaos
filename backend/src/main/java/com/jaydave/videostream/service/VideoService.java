package com.jaydave.videostream.service;

import com.jaydave.videostream.model.Video;
import com.jaydave.videostream.repository.VideoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@RequiredArgsConstructor
public class VideoService {
  private final S3Service s3Service;
  private final VideoRepository videoRepository;
  public void uploadVideo(MultipartFile multipartFile) {
      String videoUrl = s3Service.uploadFile(multipartFile);
      var video = new Video();
      video.setVideoUrl(videoUrl);

      videoRepository.save(video);
  }
}

package com.jaydave.videostream.controller;

import com.jaydave.videostream.service.VideoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


@RestController
@RequestMapping("/api/videos")
@RequiredArgsConstructor
public  class VideoController {
private final VideoService videoService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void uploadVideo(@RequestParam("file")MultipartFile file) {
          videoService.uploadVideo(file);
    }
//    @GetMapping("/error")
//    public String error() {
//        return "404-not found";
//    }
}

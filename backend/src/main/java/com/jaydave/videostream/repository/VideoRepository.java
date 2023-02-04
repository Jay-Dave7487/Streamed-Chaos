package com.jaydave.videostream.repository;

import com.jaydave.videostream.model.Video;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VideoRepository extends MongoRepository<Video,String> {

}

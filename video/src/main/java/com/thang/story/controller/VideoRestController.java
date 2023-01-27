package com.thang.story.controller;

import com.thang.story.service.video.IVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/videos")
public class VideoRestController {
    @Autowired
    private IVideoService videoService;


}

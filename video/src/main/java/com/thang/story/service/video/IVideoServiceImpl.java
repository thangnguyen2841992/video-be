package com.thang.story.service.video;

import com.thang.story.model.entity.Video;
import com.thang.story.repository.IVideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IVideoServiceImpl implements IVideoService{
    @Autowired
    private IVideoRepository videoRepository;
    @Override
    public List<Video> findAll() {
        return this.videoRepository.findAll();
    }

    @Override
    public Optional<Video> findById(Long id) {
        return this.videoRepository.findById(id);
    }

    @Override
    public Video save(Video video) {
        return this.videoRepository.save(video);
    }

    @Override
    public void delete(Long id) {
        this.videoRepository.deleteById(id);
    }
}

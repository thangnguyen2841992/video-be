package com.thang.story.service.idol;

import com.thang.story.model.entity.Idol;
import com.thang.story.repository.IIdolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IdolServiceImpl implements IIdolService{
    @Autowired
    private IIdolRepository iIdolRepository;
    @Override
    public List<Idol> findAll() {
        return this.iIdolRepository.findAll();
    }

    @Override
    public Optional<Idol> findById(Long id) {
        return this.iIdolRepository.findById(id);
    }

    @Override
    public Idol save(Idol idol) {
        return this.iIdolRepository.save(idol);
    }

    @Override
    public void delete(Long id) {
        this.iIdolRepository.deleteById(id);
    }
}

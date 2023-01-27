package com.thang.story.repository;

import com.thang.story.model.entity.Idol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IIdolRepository extends JpaRepository<Idol, Long> {
}

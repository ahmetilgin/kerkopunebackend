package com.vvv.kerkopune.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vvv.kerkopune.model.Tag;

@Repository
public interface ITagRepository extends JpaRepository<Tag, Long> {

}

package com.vvv.kerkopune.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vvv.kerkopune.model.Tag;

public interface IPostRepository extends JpaRepository<Tag, Long>  {

}

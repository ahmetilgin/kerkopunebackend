package com.vvv.kerkopune.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vvv.kerkopune.model.Location;

@Repository
public interface ILocationRepository extends JpaRepository<Location, Long> {

}

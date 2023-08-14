package com.vvv.kerkopune.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vvv.kerkopune.model.Company;

public interface ICompanyRepository extends JpaRepository<Company, Long>{

}

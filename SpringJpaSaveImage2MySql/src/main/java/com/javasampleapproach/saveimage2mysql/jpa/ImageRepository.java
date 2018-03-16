package com.javasampleapproach.saveimage2mysql.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javasampleapproach.saveimage2mysql.model.ImageModel;

public interface ImageRepository extends JpaRepository<ImageModel, Long>{
}

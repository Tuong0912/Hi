package com.example.minitest.repository;

import com.example.minitest.model.Picture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPictureRepository extends JpaRepository<Picture, Long> {
}

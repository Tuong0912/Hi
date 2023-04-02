package com.example.minitest.service.impl;

import com.example.minitest.model.Picture;
import com.example.minitest.repository.IPictureRepository;
import com.example.minitest.service.IPictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PictureService implements IPictureService {

    @Autowired
    private IPictureRepository iPictureRepository;

    @Override
    public List<Picture> findAll() {
        return iPictureRepository.findAll();
    }

    @Override
    public Picture findById(Long id) {
        return null;
    }

    @Override
    public void save(Picture picture) {
        iPictureRepository.save(picture);
    }

    @Override
    public void remove(Long id) {

    }
}

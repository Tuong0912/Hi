package com.example.minitest.service.core;

import java.util.List;

public interface IGerneralService<T> {
    List<T> findAll();

    T findById(Long id);

    void save(T t);

    void remove(Long id);
}

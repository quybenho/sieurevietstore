package com.sieurevietstore.repository;

import com.sieurevietstore.model.BaseEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.io.Serializable;

public interface BaseRepository <T extends BaseEntity, ID extends Serializable> extends JpaRepository<T, ID> {

    @Query(value = "?1", nativeQuery = true)
    Page<T> search(long id, String text, Pageable pageable);
}

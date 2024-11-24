package com.chvs.habrdemo.core.base;

import com.chvs.habrdemo.core.exception.EntityNotFoundException;
import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

record BaseReadonlyServiceImpl<E, R extends JpaRepository<E, Long> & JpaSpecificationExecutor<E>>(
        R repository)
        implements ReadonlyService<E> {

    @Override
    public E getById(@NonNull Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(id));
    }

    @Override
    public Optional<E> findById(@NonNull Long id) {
        return repository.findById(id);
    }
}

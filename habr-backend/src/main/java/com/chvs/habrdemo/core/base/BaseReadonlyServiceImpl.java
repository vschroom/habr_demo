package com.chvs.habrdemo.core.base;

import com.chvs.habrdemo.core.exception.EntityNotFoundException;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@RequiredArgsConstructor
public class BaseReadonlyServiceImpl<E, R extends JpaRepository<E, Long> & JpaSpecificationExecutor<E>>
        implements ReadonlyService<E> {

    protected final R repository;

    @Override
    @Transactional(readOnly = true)
    public E getById(@NonNull Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(id));
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<E> findById(@NonNull Long id) {
        return repository.findById(id);
    }
}

package org.jinku.im.repository;

import org.jinku.im.domain.repository.IDGenRepository;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicInteger;

@Service
public class IDGenRepositoryImpl implements IDGenRepository {

    private final AtomicInteger counter = new AtomicInteger();

    @Override
    public long genID() {
        return System.currentTimeMillis() + counter.incrementAndGet();
    }
}

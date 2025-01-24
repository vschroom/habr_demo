package com.chvs.habrdemo.core.model.advertisement;

import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
class AdvertisementScheduler {

    private int version;

    private final AdvertisementSender advertisementSender;

    @Scheduled(initialDelay = 1000, fixedDelay = 15_000)
    public void notifyAdvertisementUpdate() {
        advertisementSender.doSend(new Advertisement("This is an advertisement body, version %s".formatted(version++)));
    }
}

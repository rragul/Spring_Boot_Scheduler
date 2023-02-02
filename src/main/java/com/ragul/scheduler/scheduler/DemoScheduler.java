package com.ragul.scheduler.scheduler;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@EnableAsync
public class DemoScheduler {

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(DemoScheduler.class));
    @Scheduled(cron = "${schedulerdemo.cron}")
    @Async
    public void scheduleJobOne() throws InterruptedException {
        LOGGER.info("Job One started..");
//        Thread.sleep(5000);
    }

    @Scheduled(cron = "${schedulerdemo.cron}")
    public void scheduleJobTwo(){
        LOGGER.info("Job Two started..");
    }
}

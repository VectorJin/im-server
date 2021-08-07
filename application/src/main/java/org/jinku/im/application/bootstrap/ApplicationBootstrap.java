package org.jinku.im.application.bootstrap;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationBootstrap {

    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(ApplicationConfig.class);
    }
}

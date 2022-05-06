package io.em.connector;

@FunctionalInterface
public interface EventProcessor {
    void consume(Object object);
}

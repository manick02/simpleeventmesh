package io.em.connector;
import io.cloudevents.CloudEvent;


@FunctionalInterface
public interface EventProcessor {
    void consume(CloudEvent cloudEvent);
}

package io.em.connector;

import java.util.Map;

public interface Consumer {
    /**
     * Initialises Consumer
     * @param connectionConfiguration
     */
    void init(Map<String,String> connectionConfiguration);

    /**
     * Returns <Code>true</Code> if Consumer is Initialised
     * @return
     */
    boolean isInitialised();

    /**
     * Subscribes to topic
     * @param tppic
     */
    void subscribe(String[] tppic);

    /**
     * Gets ConsumerState
     * @return ConsumerState
     */
    ConsumerState getConsumerState();

    /**
     * Unsubscribes from All topic
     */
     void unSubscribe();

    /**
     * Returns true when Consumer is un-subscribed from all topic else false
     * @return boolean
     */
    boolean isStopped();
}

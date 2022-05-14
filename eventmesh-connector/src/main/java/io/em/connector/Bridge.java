package io.em.connector;

import java.util.ArrayList;

public interface Bridge {
    /**
     *
     *  Initializes a Bridge with a source{@link Consumer} and target{@link Producer}
     *
     * @param source
     * @param target
     */
    void init(Consumer source, Producer target);

    /**
     * Starts the bridge
     */
    void start();

    /**
     * Pauses the bridge
     */
    void pause();

    /*
     * Terminates the bridge
     */
    void terminate();
}

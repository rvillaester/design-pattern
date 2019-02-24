package com.creational.objectpool;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * this is a very simplistic implementation to show the point
 */
public abstract class ResourcePool<T> {

    private ResourcePoolConfig config;
    private ConcurrentLinkedQueue<T> pool;

    protected void initialize()  {
        pool = new ConcurrentLinkedQueue<T>();
        for (int i = 0; i < config.getMinSize(); i++) {
            pool.add(createResource());
        }
    }

    public T borrowResource() {
        T resource;
        if ((resource = pool.poll()) == null) {
            if(pool.size() < config.getMaxSize()) {
                resource = createResource();
            }
        }
        return resource;
    }

    public void returnResource(T resource) {
        if (resource == null) {
            return;
        }
        this.pool.offer(resource);
    }

    protected abstract T createResource();

    public void setConfig(ResourcePoolConfig config) {
        this.config = config;
    }

    /**
     * there should be another process that constantly
     * checking on the Resource's time to live so that it
     * will be destroyed on the pool to free up resources
     */
}

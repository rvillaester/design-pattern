package com.creational.objectpool;

import lombok.Data;

@Data
public class ResourcePoolConfig {
    private int minSize;
    private int maxSize;
    private long timeToLive;
}

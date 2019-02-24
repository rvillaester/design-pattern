package com.creational.objectpool;

public class ExpensiveResourcePool extends ResourcePool<ExpensiveResource>{

    public ExpensiveResourcePool(ResourcePoolConfig config){
        setConfig(config);
        initialize();
    }

    @Override
    protected ExpensiveResource createResource() {
        return new ExpensiveResource();
    }
}

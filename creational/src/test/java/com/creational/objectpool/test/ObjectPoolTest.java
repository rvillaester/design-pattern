package com.creational.objectpool.test;

import com.creational.objectpool.ExpensiveResource;
import com.creational.objectpool.ExpensiveResourcePool;
import com.creational.objectpool.ResourcePoolConfig;
import org.junit.Before;
import org.junit.Test;

public class ObjectPoolTest {

    private ExpensiveResourcePool pool;

    @Before
    public void init(){
        ResourcePoolConfig config = new ResourcePoolConfig();
        config.setMinSize(2);
        config.setMinSize(4);
        pool = new ExpensiveResourcePool(config);

    }

    @Test
    public void shouldRunOkWithinLimit(){
        borrowResource();
        borrowResource();
        borrowResource();
        borrowResource();
    }

    @Test
    public void shouldRunOkWhenResourceIsAvailable(){
        borrowResource();
        borrowResource();
        borrowResource();
        ExpensiveResource resource = pool.borrowResource();
        resource.run();
        pool.returnResource(resource);
        borrowResource();
    }

    /**
     * There should be a way in the actual implementation
     * where it will wait for the resouce to free up before
     * returning it
     *
     * for simplicity sake, we just try to make sure that
     * when the max limit is reach then it will return null
     */
    @Test(expected = NullPointerException.class)
    public void shouldErrorWhenExceedsMaxLimit(){
        borrowResource();
        borrowResource();
        borrowResource();
        borrowResource();
        borrowResource();
    }

    private void borrowResource(){
        ExpensiveResource resource = pool.borrowResource();
        resource.run();
    }
}

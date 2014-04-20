package com.android.java;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by gk on 4/20/14.
 */
public class MyClassTest {

    private MyClass myClass= new MyClass();

    @Before
    public void setUp(){

    }

    @Test
    public void testAdd(){

        int result = myClass.add(1,2);

        System.out.println(result);

        Assert.assertEquals(4,result);
    }




}

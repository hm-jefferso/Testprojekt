package edu.hm.cs.katz.swe2.breaker.sha1;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;

import edu.hm.cs.katz.testing.ReflectionTestHelper;
import edu.hm.cs.katz.testing.SysoutResource;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Aufgabe7OptionalTest {

    @Rule
    public Timeout globalTimeout = Timeout.seconds(600);

    @Rule
    public SysoutResource sysout = new SysoutResource();

    @Test
    public void testBreaking01IB2() throws InstantiationException, IllegalAccessException,
            IllegalArgumentException, InvocationTargetException {
        Class<?> c = ReflectionTestHelper.assertClass("edu.hm.cs.katz.swe2.breaker.sha1",
                "BruteForceSha1Breaker");
        Method m = ReflectionTestHelper.assertPublicMethod(c, "findPassword", String.class,
                String.class);
        Constructor<?> cc = ReflectionTestHelper.assertPublicConstructor(c);
        Object o = cc.newInstance();

        assertEquals("IB2", m.invoke(o, "ce85913e493fd2649dd7681861cbb88a9a80cd79"));
    }
    
    @Test
    public void testBreaking02FK07() throws InstantiationException, IllegalAccessException,
            IllegalArgumentException, InvocationTargetException {
        Class<?> c = ReflectionTestHelper.assertClass("edu.hm.cs.katz.swe2.breaker.sha1",
                "BruteForceSha1Breaker");
        Method m = ReflectionTestHelper.assertPublicMethod(c, "findPassword", String.class,
                String.class);
        Constructor<?> cc = ReflectionTestHelper.assertPublicConstructor(c);
        Object o = cc.newInstance();

        assertEquals("FK07", m.invoke(o,"41249efeba52b12117c37c747fbdea33967f5ebb"));
    }
    
    @Test
    public void testBreaking03GoodWork() throws InstantiationException, IllegalAccessException,
            IllegalArgumentException, InvocationTargetException {
        Class<?> c = ReflectionTestHelper.assertClass("edu.hm.cs.katz.swe2.breaker.sha1",
                "BruteForceSha1Breaker");
        Method m = ReflectionTestHelper.assertPublicMethod(c, "findPassword", String.class,
                String.class);
        Constructor<?> cc = ReflectionTestHelper.assertPublicConstructor(c);
        Object o = cc.newInstance();

        assertEquals("GdWrk", m.invoke(o,"c6149edb540871f786e2bd4505a5413165fa3250"));
    }
    
}

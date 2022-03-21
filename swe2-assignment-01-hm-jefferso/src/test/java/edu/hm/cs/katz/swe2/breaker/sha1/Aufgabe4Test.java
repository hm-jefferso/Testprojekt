package edu.hm.cs.katz.swe2.breaker.sha1;

import edu.hm.cs.katz.testing.ReflectionTestHelper;
import edu.hm.cs.katz.testing.SysoutResource;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Aufgabe4Test {

    @Rule
    public Timeout globalTimeout = Timeout.seconds(200);

    @Rule
    public SysoutResource sysout = new SysoutResource();

    @Test
    public void testBreaking() throws InstantiationException, IllegalAccessException,
            IllegalArgumentException, InvocationTargetException {
        Class<?> c = ReflectionTestHelper.assertClass("edu.hm.cs.katz.swe2.breaker.sha1",
                "BruteForceSha1Breaker");
        Method m = ReflectionTestHelper.assertPublicMethod(c, "findPassword", String.class,
                String.class);
        Constructor<?> cc = ReflectionTestHelper.assertPublicConstructor(c);
        Object o = cc.newInstance();

        assertEquals("awsom", m.invoke(o, "9074a8a3144f35c11dcf65741c9543aa26271a22"));
    }

}

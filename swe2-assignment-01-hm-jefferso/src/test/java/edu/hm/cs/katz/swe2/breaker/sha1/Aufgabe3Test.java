package edu.hm.cs.katz.swe2.breaker.sha1;

import edu.hm.cs.katz.testing.ReflectionTestHelper;
import edu.hm.cs.katz.testing.SysoutResource;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;



public class Aufgabe3Test {

    @Rule
    public Timeout globalTimeout = Timeout.seconds(2);

    @Rule
    public SysoutResource sysout = new SysoutResource();

    @Test
    public void testPackage() {
        Class<?> c = ReflectionTestHelper.assertClass("edu.hm.cs.katz.swe2.breaker.sha1",
                "BruteForceSha1Breaker");
    }
    
}

package edu.hm.cs.katz.testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionTestHelper {

    public static Class<?> assertClass(String pck, String className) {
        String fqnClassName = pck + "." + className;
        try {
            Class<?> clazz = Class.forName(fqnClassName);
            return clazz;
        } catch (ClassNotFoundException e) {
            fail("Klasse fehlt: " + fqnClassName);
        }
        return null;
    }

    public static Constructor<?> assertPublicConstructor(Class<?> clazz,
            Class<?>... parameterTypes) {
        try {
            Constructor<?> c = clazz.getDeclaredConstructor(parameterTypes);
            assertTrue("Falsche Sichtbarkeit von Konstruktor der Klasse " + clazz.getName(),
                    Modifier.isPublic(c.getModifiers()));
            return c;
        } catch (NoSuchMethodException e) {
            fail("Construktor fehlt oder hat falsche Parametertypen: " + clazz.getName());
        } catch (SecurityException e) {
            fail("Konstruktor kann nicht zugegriffen werden: " + clazz.getName());
        }
        return null;
    }

    public static Method assertPublicMethod(Class<?> clazz, String name, Class<?> returnType,
            Class<?>... parameterTypes) {
        try {
            Method m = clazz.getDeclaredMethod(name, parameterTypes);
            assertEquals(
                    "Falscher Rueckgabetyp von Methode " + name + "in Klasse " + clazz.getName(),
                    returnType, m.getReturnType());
            assertTrue("Falsche Sichtbarkeit von Methode " + name + "in Klasse " + clazz.getName(),
                    Modifier.isPublic(m.getModifiers()));
            return m;
        } catch (NoSuchMethodException e) {
            fail("Methode fehlt oder hat falsche Parametertypen: " + name + "in Klasse "
                    + clazz.getName());
        } catch (SecurityException e) {
            fail("Methode kann nicht zugegriffen werden: " + name + "in Klasse " + clazz.getName());
        }

        return null;
    }

}

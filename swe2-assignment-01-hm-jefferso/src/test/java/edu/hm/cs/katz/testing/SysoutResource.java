package edu.hm.cs.katz.testing;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.apache.commons.lang3.StringUtils;
import org.junit.Rule;
import org.junit.rules.ExternalResource;

/**
 * Implementierung einer JUnit-4-{@link Rule} zum Ueberprüfen von Ausgaben.
 * 
 * @author katz.bastian
 */
public class SysoutResource extends ExternalResource {

    private PrintStream sysOut;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Override
    protected void before() throws Throwable {
        sysOut = System.out;
        System.setOut(new PrintStream(outContent));
    }

    @Override
    protected void after() {
        System.setOut(sysOut);
    }

    /**
     * @return Aufgezeichnete Ausgabe.
     */
    public String asString() {
        return outContent.toString();
    }

    /**
     * @return Aufgezeichnete Ausgabe als Array von Ausgabezeilen.
     */
    public String[] getLines() {
        return StringUtils.split(outContent.toString(), "\r\n");
    }
}
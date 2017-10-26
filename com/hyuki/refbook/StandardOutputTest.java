package com.hyuki.refbook;

import org.junit.*;
import java.io.*;

public class StandardOutputTest {
    private PrintStream _savedOut;
    private ByteArrayOutputStream _actual;

    @Before public void setUp() {
        _savedOut = System.out;
        _actual = new ByteArrayOutputStream();
        System.setOut(new PrintStream(new BufferedOutputStream(_actual)));
    }

    @After public void tearDown() {
        System.setOut(_savedOut);
    }

    protected String getActualOutput() {
        System.out.flush();
        return _actual.toString();
    }

    protected String getExpectedOutput(String... strs) {
        ByteArrayOutputStream expected = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(new BufferedOutputStream(expected));
        for (String s : strs) {
            out.println(s);
        }
        out.flush();
        return expected.toString();
    }
}

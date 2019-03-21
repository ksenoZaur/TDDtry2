package sample;

import javafx.event.ActionEvent;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Tester {

    @Test
    public void testCreateObject(){

        Generator object = new Generator();

    }

    @Test
    public void testMethodGetPatterns1(){

        Generator object = new Generator();
        ArrayList<String> patterns = object.getPatterns();

    }

    @Test
    public void testMethodGetPatterns2() {

        Generator object = new Generator();
        ArrayList<String> patterns = object.getPatterns();

        Assertions.assertEquals("Adapter", patterns.get(0));

    }

    @Test
    public void testMethodGetPatterns3() {

        Generator object = new Generator();
        ArrayList<String> patterns = object.getPatterns();

        Assertions.assertEquals("Proxy", patterns.get(1));

    }

    @Test
    public void testMethodGetPatterns4() {

        Generator object = new Generator();
        ArrayList<String> patterns = object.getPatterns();

        Assertions.assertEquals("Decorator", patterns.get(2));

    }

    @Test
    public void testMethodGetPatterns5() {

        Generator object = new Generator();
        ArrayList<String> patterns = object.getPatterns();

        Assertions.assertEquals("Composite", patterns.get(3));

    }

}

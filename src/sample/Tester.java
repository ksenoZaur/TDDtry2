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
    public void testMethodgetPatterns2() {

        Generator object = new Generator();
        ArrayList<String> patterns = object.getPatterns();

        Assertions.assertEquals("Adapter", patterns.get(0));
    }

}

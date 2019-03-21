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

    // Чтение кода из файла для проверки
    private String readFromFile( String path ){
        String text = null;

        try {

            text = new String(Files.readAllBytes(Paths.get(path)), StandardCharsets.UTF_8);
            text = text.replaceAll("\\n", "");
            text = text.replaceAll("\\r", "");
            text = text.replaceAll("\\t", "");

        } catch (IOException e) {
            e.printStackTrace();
        }

        return text;
    }

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

    @Test
    public void testMethodGetLang1(){

        Generator object = new Generator();

        ArrayList<String> languages = object.getLanguages();

    }

    @Test
    public void testMethodGetLang2() {

        Generator object = new Generator();

        ArrayList<String> languages = object.getLanguages();

        Assertions.assertEquals("Java", languages.get(0));
    }

    @Test
    public void testMethodGetLang3() {

        Generator object = new Generator();

        ArrayList<String> languages = object.getLanguages();

        Assertions.assertEquals("C#", languages.get(1));
    }

    @Test
    public void testMethodGetLang4() {

        Generator object = new Generator();

        ArrayList<String> languages = object.getLanguages();

        Assertions.assertEquals("JavaScript", languages.get(2));
    }

    @Test
    public void testMethodGenerate1() {

        Generator object = new Generator();

        // Паттерн Adapter
        // Java
        object.generate(0, 0);

        String code = object.generate(0,0);
        String expected = this.readFromFile("src/sample/input/00.txt").trim();
        Assertions.assertEquals(expected, code);

    }


    @Test
    public void testMethodGenerate2() {

        Generator object = new Generator();

        // Паттерн Adapter
        // C#
        String code = object.generate(0,1);
        String expected = this.readFromFile("src/sample/input/01.txt").trim();
        Assertions.assertEquals(expected, code);

    }

    @Test
    public void testMethodGenerate3() {

        Generator object = new Generator();

        // Паттерн Adapter
        // JavaScript
        String code = object.generate(0,2);
        String expected = this.readFromFile("src/sample/input/02.txt").trim();
        Assertions.assertEquals(expected, code);

    }
}

package sample;

import java.util.ArrayList;

public class Generator {

    public ArrayList<String> getPatterns() {
        return  new ArrayList<String>() {{ add("Adapter"); add("Proxy"); add("Decorator"); add("Composite");}};
    }

    public ArrayList<String> getLanguages() {
        return  new ArrayList<String>() {{ add("Java"); add("C#");  add("JavaScript");}};
    }

    public String generate(int i, int i1) {

        return null;
    }
}

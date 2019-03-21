package sample;

import java.util.ArrayList;

public class Generator {
    public ArrayList<String> getPatterns() {
        return  new ArrayList<String>() {{ add("Adapter"); add("Proxy");}};
    }
}

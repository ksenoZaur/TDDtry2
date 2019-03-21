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

        return "interface RoundPeg {private int radius;public RoundPeg( int radius );public int " +
                "getRadius();}class SquarePeg{private int width;public SquarePeg( int width ){this.width " +
                "= width;}public int getWidth(){return this.width;}}class SquarePegAdapter implements " +
                "RoundPeg{private SquarePeg peg;public SquarePegAdapter( SquarePeg peg ) {this.peg = peg;}" +
                "@Override public int getRadius() {return (int)(peg.getWidth() * Math.sqrt(2)/2);}}public " +
                "class RoundHole {private int radius;public int getRadius() {return this.radius;}public " +
                "RoundHole( int radius ) {this.redius = radius;}public bool fits( RoundPeg peg ){if( " +
                "peg.getRadius() <= this.radius )return true;elsereturn false;}}";

    }
}

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

        if( i == 0 )

            if( i1 == 0 )
                return "interface RoundPeg {private int radius;public RoundPeg( int radius );public int " +
                        "getRadius();}class SquarePeg{private int width;public SquarePeg( int width ){this.width " +
                        "= width;}public int getWidth(){return this.width;}}class SquarePegAdapter implements " +
                        "RoundPeg{private SquarePeg peg;public SquarePegAdapter( SquarePeg peg ) {this.peg = peg;}" +
                        "@Override public int getRadius() {return (int)(peg.getWidth() * Math.sqrt(2)/2);}}public " +
                        "class RoundHole {private int radius;public int getRadius() {return this.radius;}public " +
                        "RoundHole( int radius ) {this.redius = radius;}public bool fits( RoundPeg peg ){if( " +
                        "peg.getRadius() <= this.radius )return true;elsereturn false;}}";
            else if( i1 == 1 )
                return "\uFEFFusing System;  namespace Adapter {    class MainApp  {    static void Main()    {" +
                        "      RoundPeg roundPeg = new SquarePegAdapter();      roundPeg.getRadius();      " +
                        "RoundHole hole = new RoundHole(radius);hod.fits(roundPeg);    }  }   class RoundPeg  {    " +
                        "int radius;    public virtual int getRadius()    {      return radius;    }  }   class " +
                        "SquarePegAdapter : RoundPeg  {    private SquarePeg adaptee = new SquarePeg();     public " +
                        "override int getRadius()    {      adaptee.getWidth();    }  }   class SquarePeg  " +
                        "{int width;    public int getWidth()    {      return width;    }  } }";
            else
                return "\uFEFFfunction SquarePeg( width ) {var width = width;this.getWidth = function () " +
                        "{return width;};};function SquarePegAdapter ( adaptee ) {this.getRadius = function () " +
                        "{return adaptee.getWidth();};};var squarePeg = new SquarePeg(1);var squareAdapter = new " +
                        "SquareAdapter(squarePeg);squareAdapter.getRadius();";

        else

            switch ( i ) {

                default:
                    return "function IMath() {this.add = function(x, y) {};this.sub = function(x, y) {};}function " +
                            "RMath() {this.add = function(x, y) {return x + y;};this.sub = function(x, y) {return x - " +
                            "y;};}RMath.prototype = new IMath();RMath.prototype.constructor = RMath;function MathProxy() " +
                            "{var math = new RMath();this.add = function(x, y) {return math.add(x, y);};this.sub = function" +
                            "(x, y) {return math.sub(x, y);};}var test = new MathProxy();alert(test.add(3, 2));" +
                            " // 5alert(test.sub(3, 2)); // 1";
            }
    }
}

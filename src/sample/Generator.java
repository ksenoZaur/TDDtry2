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

        if( i1 == 0 )
            return "interface RoundPeg {private int radius;public RoundPeg( int radius );public int " +
                    "getRadius();}class SquarePeg{private int width;public SquarePeg( int width ){this.width " +
                    "= width;}public int getWidth(){return this.width;}}class SquarePegAdapter implements " +
                    "RoundPeg{private SquarePeg peg;public SquarePegAdapter( SquarePeg peg ) {this.peg = peg;}" +
                    "@Override public int getRadius() {return (int)(peg.getWidth() * Math.sqrt(2)/2);}}public " +
                    "class RoundHole {private int radius;public int getRadius() {return this.radius;}public " +
                    "RoundHole( int radius ) {this.redius = radius;}public bool fits( RoundPeg peg ){if( " +
                    "peg.getRadius() <= this.radius )return true;elsereturn false;}}";
        else
            return "\uFEFFusing System;  namespace Adapter {    class MainApp  {    static void Main()    {" +
                    "      RoundPeg roundPeg = new SquarePegAdapter();      roundPeg.getRadius();      " +
                    "RoundHole hole = new RoundHole(radius);hod.fits(roundPeg);    }  }   class RoundPeg  {    " +
                    "int radius;    public virtual int getRadius()    {      return radius;    }  }   class " +
                    "SquarePegAdapter : RoundPeg  {    private SquarePeg adaptee = new SquarePeg();     public " +
                    "override int getRadius()    {      adaptee.getWidth();    }  }   class SquarePeg  " +
                    "{int width;    public int getWidth()    {      return width;    }  } }";

    }
}

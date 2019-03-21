package sample;

import java.util.ArrayList;

public class Generator {

    public ArrayList<String> getPatterns() {
        return  new ArrayList<String>() {{ add("Adapter"); add("Proxy"); add("Decorator"); add("Composite");}};
    }

    public ArrayList<String> getLanguages() {
        return  new ArrayList<String>() {{ add("Java"); add("C#");  add("JavaScript");}};
    }

    public String generate(int pattern, int language) {

        switch (pattern) {

            case 0:

                switch (language) {
                    case 0:
                        return "interface RoundPeg {private int radius;public RoundPeg( int radius );public int " +
                                "getRadius();}class SquarePeg{private int width;public SquarePeg( int width ){this.width " +
                                "= width;}public int getWidth(){return this.width;}}class SquarePegAdapter implements " +
                                "RoundPeg{private SquarePeg peg;public SquarePegAdapter( SquarePeg peg ) {this.peg = peg;}" +
                                "@Overridepublic int getRadius() {return (int)(peg.getWidth() * Math.sqrt(2)/2);}}public " +
                                "class RoundHole {private int radius;public int getRadius() {return this.radius;}public " +
                                "RoundHole( int radius ) {this.redius = radius;}public bool fits( RoundPeg peg ){if( " +
                                "peg.getRadius() <= this.radius )return true;elsereturn false;}}";
                    case 1:
                        return "\uFEFFusing System;  namespace Adapter {    class MainApp  {    static void Main()    {" +
                                "      RoundPeg roundPeg = new SquarePegAdapter();      roundPeg.getRadius();      " +
                                "RoundHole hole = new RoundHole(radius);hod.fits(roundPeg);    }  }   class RoundPeg  {    " +
                                "int radius;    public virtual int getRadius()    {      return radius;    }  }   class " +
                                "SquarePegAdapter : RoundPeg  {    private SquarePeg adaptee = new SquarePeg();     public " +
                                "override int getRadius()    {      adaptee.getWidth();    }  }   class SquarePeg  " +
                                "{int width;    public int getWidth()    {      return width;    }  } }";
                    default:
                        return "\uFEFFfunction SquarePeg( width ) {var width = width;this.getWidth = function () " +
                                "{return width;};};function SquarePegAdapter ( adaptee ) {this.getRadius = function () " +
                                "{return adaptee.getWidth();};};var squarePeg = new SquarePeg(1);var squareAdapter = new " +
                                "SquareAdapter(squarePeg);squareAdapter.getRadius();";
                }


            case 1:
                switch (language) {
                    case 0:
                        return "public class Main {public static void main(String[] args) {ThirdPartyYoutubeLib object " +
                                "= new CachedYoutubeClass(); String[] result = object.listVideos();}}public interface " +
                                "ThirdPartyYoutubeLib {public String[] listVideos();public String getVideoInfo(int id)" +
                                ";public File downloadVideo(int id);}public class ThirdPartyYoutubeClass implements " +
                                "ThirdPartyYoutubeLib {private String[] vieos;public String[] listVideos(){return " +
                                "this.videos;}public String getVideoInfo(int id){return this.videos[ i ];}public File " +
                                "downloadVideo(int id){return new File( videos[ i ] );}}public class CachedYoutubeClass " +
                                "implements ThirdPartyYoutubeLib{private ThirdPartyYoutubeClass service;public " +
                                "CachedYoutubeClass( ThirdPartyYoutubeClass s){this.service = s;}public " +
                                "CachedYoutubeClass(){}public String[] listVideos(){if( service == null ){service = " +
                                "new ThirdPartyYoutubeClass(); }return service.listVideos();}public String getVideoInfo" +
                                "(int id){if( service == null ){service = new ThirdPartyYoutubeClass(); }return service." +
                                "getVideoInfo(id);}public File downloadVideo(int id){if( service == null ){service = new " +
                                "ThirdPartyYoutubeClass(); }return service.downloadVideo(id);}}";
                    case 1:
                        return "using System;using System.Threading;class MainApp{static void Main(){  IMath p = new " +
                                "MathProxy();  Console.WriteLine(\"4 + 2 = \" + p.Add(4, 2));  Console.WriteLine(\"4 - " +
                                "2 = \" + p.Sub(4, 2));  Console.WriteLine(\"4 * 2 = \" + p.Mul(4, 2));  Console.WriteLine" +
                                "(\"4 / 2 = \" + p.Div(4, 2));  Console.Read();}}public interface IMath{double add(double " +
                                "x, double y);double Sub(double x, double y);double Mul(double x, double y);double Div(double" +
                                " x, double y);}class Math : IMath{public Math(){    Console.WriteLine(\"Create object Math. " +
                                "Wait...\");    Thread.Sleep(1000);}public double Add(double x, double y){return x + y;}public " +
                                "double Sub(double x, double y){return x - y;}public double Mul(double x, double y){" +
                                "return x * y;}public double Div(double x, double y){return x / y;}}class MathProxy : " +
                                "IMath{Math math;public MathProxy(){  math = null;}public double Add(double x, double y){  " +
                                "return x + y;}public double Sub(double x, double y){  return x - y;}public double Mul(double " +
                                "x, double y){  if (math == null)      math = new Math();  return math.Mul(x, y);}public double " +
                                "Div(double x, double y){  if (math == null)      math = new Math();  return math.Div(x, y);}}";
                    default:
                        return "function IMath() {this.add = function(x, y) {};this.sub = function(x, y) {};}function " +
                                "RMath() {this.add = function(x, y) {return x + y;};this.sub = function(x, y) {return x - " +
                                "y;};}RMath.prototype = new IMath();RMath.prototype.constructor = RMath;function MathProxy() " +
                                "{var math = new RMath();this.add = function(x, y) {return math.add(x, y);};this.sub = function" +
                                "(x, y) {return math.sub(x, y);};}var test = new MathProxy();alert(test.add(3, 2));" +
                                " // 5alert(test.sub(3, 2)); // 1";
                }

            default:
                switch (language) {

                    case 1:
                        return "\uFEFFusing System;namespace Decorator{    class MainApp    {        " +
                                "static void Main()        {            ConcreteComponent c = new ConcreteComponent();  " +
                                "          ConcreteDecoratorA dA = new ConcreteDecoratorA();            " +
                                "ConcreteDecoratorB dB = new ConcreteDecoratorB();            dA.SetComponent(c);            " +
                                "dB.SetComponent(dA);            dA.Operation();            Console.WriteLine();            " +
                                "dB.Operation();            Console.Read();        }    }    abstract class Component    {       " +
                                " public abstract void Operation();    }    class ConcreteComponent : Component    {   " +
                                "     public override void Operation()        {            Console.Write(\"Привет\");  " +
                                "      }    }    abstract class Decorator : Component    {        protected Component " +
                                "component;        public void SetComponent(Component component)        {           " +
                                " this.component = component;        }        public override void Operation()      " +
                                "  {            if (component != null)            {                component.Operation();  " +
                                "          }        }    }    class ConcreteDecoratorA : Decorator    {        " +
                                "public override void Operation()        {            base.Operation();        }  " +
                                "  }    class ConcreteDecoratorB : Decorator    {        public override void Operation() " +
                                "       {            base.Operation();            Console.Write(\" Мир!\");        }    }}";
                    default:
                        return "\uFEFFfunction Component() {this.operation = function() { };this.getPrice = function() " +
                                "{ };this.setPrice = function() { };}function ConcreteComponent() {var price = 10;" +
                                "this.operation = function() {price += 4;alert(\"ConcreteComponent.operation, " +
                                "price: \"+ price);};this.getPrice = function() {return price;};this.setPrice = " +
                                "function(val) {price = val;};}ConcreteComponent.prototype = new Component();" +
                                "ConcreteComponent.prototype.constructor = ConcreteComponent;function Decorator() " +
                                "{var component;this.setComponent = function(val) {component = val;};this.getComponent " +
                                "= function() {return component;};this.operation = function() {component.operation();}" +
                                ";this.getPrice = function() {return component.getPrice();};this.setPrice = function(val) " +
                                "{component.setPrice(val);};}Decorator.prototype = new Component();Decorator.prototype." +
                                "constructor = Decorator;function ConcreteDecoratorA() {Decorator.call(this);var operation " +
                                "= this.operation;this.operation = function() {this.setPrice(this.getPrice() + 3);" +
                                "alert(\"ConcreteDecoratorA.operation, price: \"+ this.getPrice());operation();};}" +
                                "function ConcreteDecoratorB() {var dublicate = this;Decorator.call(this);var " +
                                "operation = this.operation;this.operation = function() {this.setPrice(this.getPrice() + " +
                                "1);alert(\"ConcreteDecoratorB.operation, price: \"+ this.getPrice());addedBehavior();" +
                                "operation();};function addedBehavior() {dublicate.setPrice(dublicate.getPrice() + 2);" +
                                "alert(\"addedBehavior, price: \"+ dublicate.getPrice());}}c = new ConcreteComponent();" +
                                "d1 = new ConcreteDecoratorA();d2 = new ConcreteDecoratorB();alert(\"изначальная " +
                                "цена: \" + c.getPrice());d1.setComponent(c);d2.setComponent(d1);d2.operation();alert(\"цена " +
                                "после преобразования: \" + c.getPrice());";

                }
        }
    }
}

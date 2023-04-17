public class Extends{
    public static void main(String[] args) {
        B b = new B();
        b.setIt(2);
        b.increase();
        b.triple();
        System.out.println(b.returnIt() );// print 9

        C c = new C();
        c.setIt(2);
        c.increase();
        c.triple();
        System.out.println( c.returnIt());// print 6
    }

}

class B {
    int x;
    void setIt (int n) { x=n;}
    void increase() { x=x+1; }
    void triple() { x=x*3; }
    int returnIt() { return x; }
}

class C extends B {
    //Override ao metodo triple da Class B
    void triple(){ x=x+3;}
    void quadruple(){ x=x*4;}
}




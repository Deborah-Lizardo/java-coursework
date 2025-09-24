//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Q2 {
    public static void main(String[] args) {
       Addition a = new Addition(4.0, 8.0);
       System.out.println( a.resolver());

       Subtraction s = new Subtraction(7.0, 5.0);
       System.out.println( s.resolver());

       Multiplication m = new Multiplication(9.0, 3.0);
       System.out.println( m.resolver());

       Division d = new Division(10.0, 4.0);
       System.out.println( d.resolver());

       a.setNum_1(4.0);
       a.setNum_2(7.0);

       m.setNum_1(2.0);
       m.setNum_2(a.resolver());

       s.setNum_1(m.resolver());
       s.setNum_2(4.0);

       d.setNum_1(s.resolver());
       d.setNum_2(3.0);

        double x = (m.getNum_1() * (a.getNum_1() + a.getNum_2())- s.getNum_2()) / d.getNum_2();
        System.out.println(x);

        a.setNum_1(3.1);
        a.setNum_2(8.2);

        d.setNum_1(8.1);
        d.setNum_2(2.4);

        s.setNum_1(d.resolver());
        s.setNum_2(5.2);

        m.setNum_1(s.resolver());
        m.setNum_2(a.resolver());

        double y = m.resolver();
        System.out.println(y);


    }
}
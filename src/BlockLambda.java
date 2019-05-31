interface NumericRoot {
    double r (double n);
}
public class BlockLambda {
    public static void main(String args[]) {
        NumericRoot sqrt = (n) -> {
            double result = 1;
            for ( int i=1; i <= n; i++ )
                result = Math.sqrt(i);
            return result ;
        };
        System . out . println ( "Корень числа 4 равен " + sqrt.r (4) );
        System . out . println ( "Корень числа 16 равен " + sqrt.r (16) );
    }
}

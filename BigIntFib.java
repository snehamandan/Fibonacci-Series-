import java.util.*;
import java.lang.*;
import java.math.BigInteger;
import java.io.*;

public class BigIntFib {

	static BigInteger mod=new BigInteger("1000000007");
    static BigInteger MAX =new BigInteger("100000000000000");
    static BigInteger f[];
     
    // Returns n'th fibonacci number using 
    // table f[]
    public static BigInteger fib(BigInteger bigInteger)
    {
        // Base cases
        if (bigInteger.equals(BigInteger.valueOf(0)))
            return BigInteger.valueOf(1);
             
        if (bigInteger.equals(BigInteger.valueOf(1))|| bigInteger.equals(BigInteger.valueOf(2)))
            return (f[bigInteger.intValue()] = BigInteger.valueOf(1));
      
        // If fib(n) is already computed
        if (!f[bigInteger.intValue()].equals(BigInteger.valueOf(0)))
            return f[bigInteger.intValue()];
      
        BigInteger k = (bigInteger.and(BigInteger.valueOf(1))).equals(BigInteger.valueOf(1))? bigInteger.add(BigInteger.valueOf(1)).divide(BigInteger.valueOf(2))
                            : bigInteger.divide(BigInteger.valueOf(2));
      
        // Applyting above formula [Note value
        // n&1 is 1 if n is odd, else 0.
        f[bigInteger.intValue()] = (bigInteger.and(BigInteger.valueOf(1))).equals(BigInteger.valueOf(1))? (fib(k).multiply(fib(k)).add( 
                        fib(k.subtract(BigInteger.valueOf(1))).multiply(fib(k.subtract(BigInteger.valueOf(1))))))
                       : (fib(k.subtract(BigInteger.valueOf(1))).multiply(BigInteger.valueOf(2)).add(fib(k))).multiply(fib(k));
      
        return f[bigInteger.intValue()].mod(mod);
    }
     
    /* Driver program to test above function */
    public static void main(String[] args) 
    {
      Scanner s=new Scanner(System.in);
  	  int t=s.nextInt();
  	  f= new BigInteger[MAX.intValue()];
  	  for(int i=0;i<t;i++){
  		  BigInteger n=s.nextBigInteger();
  		  System.out.println(fib(n.add(BigInteger.valueOf(2))));
  	  }
        
    }
}

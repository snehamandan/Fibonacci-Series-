import java.util.*;
import java.lang.*;
import java.math.BigInteger;
import java.io.*;

public class Solution {
	static BigInteger m=BigInteger.valueOf(1000000007);
  static BigInteger fib(BigInteger n)
  {
	  BigInteger F[][] = new BigInteger[][]{{BigInteger.ONE,BigInteger.ONE},{BigInteger.ONE,BigInteger.ZERO}};
  if (n.equals(BigInteger.ZERO))
      return BigInteger.ZERO;
  power(F, n.subtract(BigInteger.ONE));
    
  return F[0][0].mod(m);
  }
    
  static void multiply(BigInteger[][] f, BigInteger[][] f2)
  {
	  BigInteger x =  (f[0][0].multiply(f2[0][0])).add(f[0][1].multiply(f2[1][0]));
	  
	  BigInteger y =  (f[0][0].multiply(f2[0][1])).add(f[0][1].multiply(f2[1][1]));
	  
	  BigInteger z =  (f[1][0].multiply(f2[0][0])).add(f[1][1].multiply(f2[1][0]));
	  
	  BigInteger w =  (f[1][0].multiply(f2[0][1])).add(f[1][1].multiply(f2[1][1]));
   
  f[0][0] = x.mod(m);
  f[0][1] = y.mod(m);
  f[1][0] = z.mod(m);
  f[1][1] = w.mod(m);
  }
    
  static void power(BigInteger[][] f, BigInteger bigInteger)
  {
  if( bigInteger.equals(BigInteger.ZERO) || bigInteger.equals(BigInteger.ONE))
    return;
  BigInteger M[][] = new BigInteger[][]{{BigInteger.ONE,BigInteger.ONE},{BigInteger.ONE,BigInteger.ZERO}};
    
  power(f, bigInteger.divide(BigInteger.valueOf(2)));
  multiply(f, f);
    
  if (!bigInteger.remainder(BigInteger.valueOf(2)).equals(BigInteger.valueOf(0)))
     multiply(f, M);
  }
   
  public static void main (String args[])
  {
	  
	  Scanner s=new Scanner(System.in);
	  int t=s.nextInt();
	  for(int i=0;i<t;i++){
		  BigInteger n=s.nextBigInteger();
		  //Required shifted Fibonacci series
		  System.out.println(fib(n.add(BigInteger.valueOf(2))));
	  }
       
   
  }
}

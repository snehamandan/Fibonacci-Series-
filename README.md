# Fibonacci-Series
Java code to compute nth term in Fibonacci series in O(logn)

nth term of Fibonacci series: fib(n)=fib(n-1)+fib(n-2)
In fibonacci series, f(1)=1, f(2)=1, f(3)=2, f(4)=3, f(5)=5, f(6)=8,... and so on. 
Here, the code output is shifted fibonacci series. Also the result is displayed as modulo (10^9 + 7). The output of the code is f(2)=3, f(3)=5, f(4)=8, f(5)=13,... and so on. To incorporate N<=10^15, BigInteger datatype is used.

Here, the time complexity of algorithm is O(logN). 

The basic recursive algorithm O(N) time. To improve the time complexity, the method of nth-power matrix is used.

In matrix notation, (1 1; 1 0)^n= (fib(n+1) fib(n); fib(n) fib(n-1)).
If recursive computation of above power of matrix is done, the time complexity would be O(logN)


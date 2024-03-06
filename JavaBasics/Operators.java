import java.io.*;

class Operators 
{
    public static void main(String[] args){
        int a =10;
        int b = 5;
        
        // Arithmetic Operators
        System.out.println("a+b =" + (a+b));
        System.out.println("a-b =" + (a-b));
        System.out.println("a*b =" + (a*b));
        System.out.println("a%b =" + (a%b));
        
        //Unary Operators
        System.out.println("Postincrement : "+(a++));
        System.out.println("Preincrement : "+(++a));
        System.out.println("Postdecrement : "+(b--));
        System.out.println("Predecrement : "+(--b));
        
        //Assignment Operators
        int f = 8;
        System.out.println("f += 3: " + (f += 3));
        System.out.println("f -= 2: " + (f -= 2));
        System.out.println("f *= 4: " + (f *= 4));
        System.out.println("f /= 3: " + (f /= 3));
        System.out.println("f %= 2: " + (f %= 2));
        System.out.println("f &= 0b1010: " + (f &= 0b1010));
        System.out.println("f |= 0b1100: " + (f |= 0b1100));
        System.out.println("f ^= 0b1010: " + (f ^= 0b1010));
        System.out.println("f <<= 2: " + (f <<= 2));
        System.out.println("f >>= 1: " + (f >>= 1));
        System.out.println("f >>>= 1: " + (f >>>= 1));
        
        //Relational Operators
        int g = 10;
        int h = 3;
        int i = 5;
        System.out.println("g > h: " + (g > h));
        System.out.println("g < h: " + (g < h));
        System.out.println("g >= h: " + (g >= h));
        System.out.println("g <= h: " + (g <= h));
        System.out.println("g == i: " + (g == i));
        System.out.println("g != i: " + (g != i));
        
    }
}

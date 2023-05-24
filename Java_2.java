// Defining Bicycle class and showing oops implementation
package com.company;
import java.util.Scanner;

class bicycle{
    int gears;
    Scanner s = new Scanner(System.in);
    bicycle(){
        System.out.println("Add gears");
        this.gears = s.nextInt();
    }
    public bicycle add_gears(bicycle b){
        bicycle c = new bicycle();
        c.gears = gears+b.gears;
        return c;
    }
}
public class bicycke {
    public static void main(String[] args) {
        bicycle b1 = new bicycle();
        bicycle b2 = new bicycle();
        System.out.println(b1.add_gears(b2));
        System.out.println(19%3/2);
    }
}

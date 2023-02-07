/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    pizza a=new pizza(false);
	   // a.pizza('true');
	   // a.price=5;
	   a.addcheese();
	   a.addtopings();
	   a.takeaway();
	    a.pizzaprice();
	    
	    deluxepizza b=new deluxepizza(true);
	     b.takeaway();
	    b.pizzaprice();
	//	System.out.println(a.price);
	}
}

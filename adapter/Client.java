package patterns.adapter;

public class Client {

	public static void main(String[] args) {
		RoundShape r1 = new RoundPeg(7.0);
		RoundShape r2 = new RoundPeg(4.5);
		
		RoundHole h1 = new RoundHole(5.0);
		
		System.out.println("Round peg radius " + r1.getRadius() + (h1.fits(r1)? " fits" : " does not fit") + " hole of radius " + h1.getRadius());
		System.out.println("Round peg radius " + r2.getRadius() + (h1.fits(r2)? " fits" : " does not fit")+ " hole of radius " + h1.getRadius());
		
		SquarePeg  rs1 = new SquarePeg(8.0);
		RoundShape s1 = new Adapter(rs1);
		SquarePeg rs2 =new SquarePeg(7.0);
		RoundShape s2 =  new Adapter( rs2);
		
		System.out.println("Square peg radius " + rs1.getSide() + (h1.fits(s1)? " fits" : " does not fit") + " hole of radius " + h1.getRadius());
		System.out.println("Square peg radius " + rs2.getSide() + (h1.fits(s2)? " fits" : " does not fit")+ " hole of radius " + h1.getRadius());
		
		TriangularPeg  rt1 = new TriangularPeg(10.0);
		RoundShape t1 = new Adapter(rt1);
		TriangularPeg rt2 =new TriangularPeg(6.0);
		RoundShape t2 =  new Adapter( rt2);
		
		System.out.println("Trangular peg radius " + rt1.getSide() + (h1.fits(t1)? " fits" : " does not fit") + " hole of radius " + h1.getRadius());
		System.out.println("Trangular peg radius " + rt2.getSide() + (h1.fits(t2)? " fits" : " does not fit")+ " hole of radius " + h1.getRadius());
	}

}

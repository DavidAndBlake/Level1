
public class SmurfRunner {

	public static void main(String[] args) {
Smurf handySmurf = new Smurf("Handy");
System.out.println(handySmurf.getName());
handySmurf.eat();
Smurf papaSmurf = new Smurf("Papa");
System.out.println(papaSmurf.getName());
papaSmurf.eat();
Smurf smurfette = new Smurf ("Smurfette");
System.out.println(smurfette.getName());
smurfette.eat();
	}

}

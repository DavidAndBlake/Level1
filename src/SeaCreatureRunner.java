
public class SeaCreatureRunner {

	public static void main(String[] args) {
		SeaCreature spongebob = new SeaCreature("Spongebob");
		spongebob.eat();
		spongebob.laugh();
		SeaCreature patrick = new SeaCreature("Patrick");
		SeaCreature squidward = new SeaCreature("Squidward");
		patrick.eat();
		patrick.laugh();
		squidward.eat();
		squidward.laugh();
	}

}

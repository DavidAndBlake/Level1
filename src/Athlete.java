
public class Athlete {
static String venue = "Rio";
String athleteName;
int athleteHeight;
int bibNumber;
static int count = 0;

Athlete (String name, int height)
{
	athleteName = name;
	athleteHeight = height;
	count = count + 1;
	bibNumber = count;
	}
public static void main (String []args)
{
	Athlete Phelps = new Athlete("Phelps", 72);
	System.out.println(Phelps.bibNumber);
	Athlete RandomAthlete = new Athlete("Number2", 73);
	System.out.println(RandomAthlete.bibNumber);
	System.out.println(Phelps.count);
	Phelps.venue = "shanghai";
	System.out.println(RandomAthlete.venue);
}

}

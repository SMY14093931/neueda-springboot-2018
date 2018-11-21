import java.util.ArrayList;

public class Cast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Toys woody = new Toys("Woody", "Tom", "Hanks");
	Toys buzz = new Toys("Buzz","Tim","Allen");
	Toys slinky = new Toys("Slinky", "Jim", "Varney");
	Toys hamm = new Toys("Hamm", "John", "Ratzenberger");
	Toys mph = new Toys("Mr. Potato Head", "Don", "Rickles");
	Toys rex = new Toys("Rex", "Wallace", "Shawn");

	ArrayList<Toys> toy = new ArrayList<Toys>();
	toy.add(woody);
	toy.add(buzz);
	toy.add(slinky);
	toy.add(hamm);
	toy.add(mph);
	toy.add(rex);
	
	for (Toys toys:toy) {
		System.out.println(toys.getToy() + " " + toys.getFname() + " " + toys.getLname());
	}

}
}

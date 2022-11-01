package Lab;

public class Anime {
	String Name;
	int Episodes;
	Characters Characters;
	Creators Creators;
	
	public Anime(String Name,int Episodes,Characters Characters,Creators Creators) {
		super();
		this.Name=Name;
		this.Episodes=Episodes;
		this.Characters=Characters;
		this.Creators=Creators;
	}
	public void display() {
		System.out.println("Anime Name : "+Name);
		System.out.println("Episodes Count : "+Episodes);
		System.out.println(Characters);
		System.out.println(Creators);
	}
	

}

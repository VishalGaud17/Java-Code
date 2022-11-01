package Lab;

public class Characters {
	String Protagonist;
	String Antagonist;

	public Characters(String Protagonist,String Antagonist) {
		super();
		this.Protagonist=Protagonist;
		this.Antagonist=Antagonist;
		
	}
	public String toString() {
		return "Protagonist Name : "+Protagonist+"    Antagonist Name : "+Antagonist;
	}
}

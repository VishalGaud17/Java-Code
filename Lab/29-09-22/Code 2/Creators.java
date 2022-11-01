package Lab;

public class Creators {
	String Writer;
	String Publisher;

	public Creators(String Writer,String Publisher) {
		super();
		this.Writer=Writer;
		this.Publisher=Publisher;
		
	}
	public String toString() {
		return "Writer's Name : "+Writer+"    Publishing Company's Name : "+Publisher;
	}
}

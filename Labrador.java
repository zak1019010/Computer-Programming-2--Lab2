// ****************************************************************
// Labrador.java
//
// A class derived from Dog that holds information about
// a labrador retriever. Overrides Dog speak method and includes
// information about avg weight for this breed.
//
// ****************************************************************
public class Labrador extends Dog
{
	private String color; //black, yellow, or chocolate?
	private int avgBreedWeight = 75;
	
	public Labrador(String name, String color1)
	{
		super(name);
		color = color1;
	}
	// ------------------------------------------------------------
	// Big bark -- overrides speak method in Dog
	// ------------------------------------------------------------
	public String speak()
	{
		return "WOOF";
	}
	// ------------------------------------------------------------
	// Returns weight
	public int avgBreedWeight(){
		return avgBreedWeight; 
	}
	// ------------------------------------------------------------
	
}

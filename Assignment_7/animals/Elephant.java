package animals;

public class Elephant {
	private String color;
	private float weight;
	private int age;
	public Elephant(String color,float weight,int age)
	{
		this.color=color;
		this.weight=weight;
		this.age=age;
		System.out.println("Elephant color,weight and age is:"+color+""+weight+""+age);
	}
	public boolean isVegetarian()
	{
		return true;
	}
	public boolean canClimb(){
		return false;
	}
	public String getSound(){
		return "trumpeting";
	}
}
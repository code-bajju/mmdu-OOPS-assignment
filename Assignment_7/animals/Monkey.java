public class Monkey {
	private String color;
	private float weight;
	private int age;
	public Monkey(String color,float weight,int age)
	{
		this.color=color;
		this.weight=weight;
		this.age=age;
		System.out.println("Monkey color,weight and age is:"+color+""+weight+""+age);
	}
	public boolean isVegetarian()
	{
		return false;
	}
	public boolean isOmniverse()
	{
		return true;
	}
	public boolean canClimb(){
		return true;
	}
	public String getSound(){
		return "chatter";
	}
}
package Zoo;
import animals.*;
public class VandalurZoo{
	public static void main(String[] args)
	{
		Lion l= new Lion("Brown",200.2f,12);
		System.out.println(l.isVegetarian()?"lion Yes Vegetarian":"lion Non
				Vegetarian");
				System.out.println(l.canClimb()?"Yes lion can climb":"Lion can't
						climb");
						System.out.println("lion sound:"+l.getSound());
		Elephant e=new Elephant("Dark-Brown",800.2f,19);
		System.out.println(e.isVegetarian()?"animals.Elephant Vegetarian":"animals.Elephant
				Non-vegetarian");
				System.out.println(e.canClimb()?"Yes animals.Elephant can climb":"animals.Elephant can't
						climb");
						System.out.println("animals.Elephant sound:"+e.getSound());
		Monkey m=new Monkey("Red-Brown",10.2f,9);
		System.out.println(m.isOmniverse()?"Monkey Omniverse":"Monkey
				Non-vegetarian");
				System.out.println(m.canClimb()?"Yes Monkey can climb":"Monkey can't
						climb");
						System.out.println("Monkey sound:"+m.getSound());
	}
}
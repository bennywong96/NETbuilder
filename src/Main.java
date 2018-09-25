
public class Main {

	
		public static void main(String[] args) {
			
			Excercise1 e = new Excercise1();
			
			System.out.println(e.replaceLetterWithPosition("Hello It's me"));
			
			
			
			Family fam = new Family();
			System.out.println(fam.male("Dylan"));
			System.out.println(fam.male("Bob"));
			System.out.println(fam.male("Peter"));
			System.out.println(fam.male("Isaac"));
			
			System.out.println(fam.female("Dylan"));
			System.out.println(fam.female("Hilda"));
			
			System.out.println(fam.isMale("Peter"));
			System.out.println(fam.isMale("Hilda"));
			System.out.println(fam.isFemale("Peter"));
			System.out.println(fam.isFemale("Hilda"));
			System.out.println(fam.male("Hilda"));
			
			System.out.println(fam.setParent("Dylan", "Peter"));
			System.out.println(fam.setParent("Isaac", "Hilda"));
			System.out.println(fam.setParent("Dylan", "Hilda"));
			
			System.out.println(fam.setParent("a", "Peter"));
			
			System.out.println(fam.getParents("Dylan"));
			System.out.println(fam.getParents("Bob"));
			
			System.out.println(fam.getChildren("Hilda"));
			//System.out.println(fam.printAllNames());
			
			
	}
}

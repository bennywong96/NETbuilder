import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Family {
	
	private List<Person> people = new ArrayList<Person>();
	
	
	private Person allPeople(String name) {
		for (Person person: people) {
			if(person.getName().equals(name)) {
				return person;
			}			
		}
		return null;
	}
	
	private void aPerson(String name) {
		if (allPeople(name) == null) {
			people.add(new Person(name));
		}
	}
	
	public boolean male(String name) {
		aPerson(name);
		return allPeople(name).setGender("Male");	
		
	}
	
	public boolean female(String name) {
		
		aPerson(name);
		return allPeople(name).setGender("Female");	
		
	}
	
	public boolean isMale(String name) {
		if(allPeople(name)!=null && allPeople(name).getGender() == "Male" ) {
			return true;	
		}
		else if(allPeople(name).getGender() == "Female") {
			System.out.println("Error, " + name + " has been assigned as a Female");
			return false;
		}
		
		System.out.println("Error has occured, Name may not exist or Gender has not been assigned");
		return false;
		
	}
	
	public boolean isFemale(String name) {
		if(allPeople(name)!=null && allPeople(name).getGender() == "Female" ) {
			return true;	
		}
		else if(allPeople(name).getGender() == "Male") {
			System.out.println("Error, " + name + " has been assigned as a Male");
			return false;
		}
		
		System.out.println("Error has occured, Name may not exist or Gender has not been assigned");
		return false;
	}
		
	
	public boolean setParent(String childName, String parentName) {
		if (allPeople(childName) != null && allPeople(parentName).getGender() == "Male") {
			allPeople(childName).setFather(parentName);
			allPeople(parentName).addChild(childName);
			return true;
		}
		if (allPeople(childName) != null && allPeople(parentName).getGender() == "Female") {
			allPeople(childName).setMother(parentName);
			allPeople(parentName).addChild(childName);
			return true;
		}
		
		
		
		return false;	
		
	}
	
	public String getParents(String name) {
		//return array
		String[] newArray = new String[2];
		String f = allPeople(name).getFather();
		String m =allPeople(name).getMother();
		if (f != null && m != null) {
			newArray[0] = f;
			newArray[1] = m;
		}
		if (m != null && f == null) {
			newArray[1] = m;
		}
		if (m == null && f != null) {
			newArray[0] = f;
		}
		if (m == null && f == null) {
			return "No Parents found";
		}
		
		return Arrays.toString(newArray);	
		
	}
	
	public List<String> getChildren(String name) {
		List<String> childrenList = allPeople(name).getChildren();
		Collections.sort(childrenList);
		return childrenList;	
		
	}
	
}

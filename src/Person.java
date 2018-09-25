import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Person {
	
	 private String name;
	 private String gender;
	 private String mother;
	 private String father;
	 private List<String> children = new ArrayList<String>();
	 
	 //private List<String> allNames = new ArrayList<String>();
	 
	
	 
	

	public Person() {
		 this.name = "";
	     this.gender = "";
	    }
	 //Initialises/resets
	 
	 public Person(String name) {
		 this.name = name;
	     this.gender = "";
	    }
	 
	 //Could have a name but no gender
	 
	 public Person(String name, String gender) {
	        this.name = name;
	        this.gender = gender;
	    }
	 //With a name and known gender
	 
//	 public List<String> print() {
//		 Collections.sort(allNames);
//		 return allNames;
//	 }
	 
//	 if(goThrough()) {
//		 return;
//	 }
//	 else {
//		 allNames.add(name);
//	 }
//	 
//	 public boolean goThrough() {
//		 for (String s: allNames) {
//		        if (s.equals(name))
//		            return true;
//		    }
//		    	return false;
//		}
	 
	 
	 public void setName(String name){
		 this.name=name;
	 }
	 
	 public boolean setGender(String gender) {
		 if (this.gender=="") {
			 this.gender=gender;
			 return true;
		 }
		 
		 else {
			 return false;
		 }
	 }
	 
	 public String getMother() {
			return this.mother;
		}

		public void setMother(String mother) {
			this.mother = mother;
		}

		public String getFather() {
			return this.father;
		}

		public void setFather(String father) {
			this.father = father;
		}
	 

	public String getName() {
		return this.name;
	}

	public String getGender() {
		return this.gender;
	}
	
	public void addChild(String name) {
		children.add(name);
	}
	
	public List<String> getChildren() {
		return this.children;
	}

}

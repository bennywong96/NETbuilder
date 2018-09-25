
public class Excercise1 {
	private  String[] seperateString;
	private  String answer = "";
	

	public  String replaceLetterWithPosition(String sentence){
		 answer = "";
		 seperateString = sentence.split(" ");
		 
		  
		for(int i=0;i<seperateString.length;i++)  {
			String aWord = seperateString[i];
			char[] c_arr = aWord.toCharArray();
			
			for(int j=0;j<c_arr.length;j++){
				char word = c_arr[j];
				int ascii = word;
				if (ascii>64 && ascii<123) {
					int position = ascii-96;
					if (position<0) {
						
						position+=32;
						
					}
						answer = answer + " " + position;
				}
			}
		}
					
		 return answer;
		}
	
	
	
}

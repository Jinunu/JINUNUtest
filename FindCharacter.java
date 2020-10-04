package work;

public class FindCharacter {

	public int countChar(String str, char c) {
		int charCount=0;
		char[] arr = str.toCharArray();
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==c) {charCount++;
		}
			
		}
			
			
			
		return charCount;
	}
	
	public static void main(String[] args) {
		
		FindCharacter fc = new FindCharacter();
		int count = fc.countChar("Boys, be ambitious",' ');
		System.out.println(count);
		

	}

}

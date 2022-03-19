package test;

public class VowelExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Clean India Green India";
		int vowelCount = 0;
		
		for(int i = 0; i<str1.length(); i ++)
		{
			char temp = str1.charAt(i);
			switch (temp)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				vowelCount = vowelCount + 1;
				break;
	
			}
		}
		
		System.out.println("VovelCount is " + vowelCount);
	}

}

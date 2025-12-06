package javaBasics;

public class ReverseStringWordByWord {
	public static void main(String[] args) {
        String sentence = "Java is a powerful language";
        System.out.println(sentence);
        
        
        String[] words = sentence.trim().split("\\s+");
      	System.out.println(words[0]);
      
      	StringBuilder revSentence = new StringBuilder();
      	for(int i=0;i<words.length;i++)
      	{
      		String word = words[i];
      		//System.out.println(word);
      		
      		String revWord ="";
      		for(int j=word.length()-1;j>=0;j--)
      		{
      			revWord= revWord+word.charAt(j);
      			//System.out.println(revWord);
      		}
      			
      		revSentence=revSentence.append(revWord);
      		revSentence=revSentence.append(" ");

      		
      	}
        
        
    	System.out.println(revSentence);
        
        
    }

}

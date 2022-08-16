import java.util.*;

public class WordOccurrence implements Comparable<WordOccurrence>{
	String word;
	int count;
	WordOccurrence(String word,int count){
		this.count = count;
		this.word = word;
	}
	
	@Override
	public int compareTo(WordOccurrence w) {
		if(this.count < w.count) {
			return -1;
		}
		
		else if(this.count > w.count) {
			return 1;
		}
		else {
			return 0;
		}
	}
		
	
		
	
}

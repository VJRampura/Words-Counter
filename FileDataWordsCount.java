package FileDataWordsCountClass ;
import java.io.* ;
public class FileDataWordsCount{
	public static void main(String args[]) throws IOException{
		if(args.length != 1  ){
			System.out.println("Invalid Arguments....");
			System.exit(0);
		}
		FileInputStream f1 = new FileInputStream(args[0]);
		int ch,i = 0,j = 1,k = 0;
		int a = 0,b = 0 ;
		
		while((ch=f1.read())!= -1){
			k = ch ;
			//for words...
			if(ch == 32) 
				j++ ;
			else if (ch == 46)
				a++ ;
			else if (ch == 10)
				b++ ;
			if(((ch != 32) && (j >= 1)) || ch ==13){
				i++;
				j = 0;
			}
		}
		if(k == 10)
			i-- ;
		else
			b++ ;
		f1.close();
		System.out.println("total words are : "+ i);
		System.out.println("total Sentences are : "+ a);
		System.out.println("total Lines are : "+ b);
	}
}
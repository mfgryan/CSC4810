package practice;

// used to store a bunch of useful regexes and test strings
import java.util.Random;
import java.util.Scanner; 
public class SampleRegexs {
	
	public static final String DATE_MM_DD_YYYY = "[0-9]{1,2}(\\\\|/)[0-9]{1,2}\\1[0-9]{2,4}"; // /mm/dd/(yyyy or yy) format
	
	public static String[] testDATE_MM_DD_YYYY = {"01/12/1992","01/12/92","1/2/1992","1/2/92","12/2/1992","12/2/92","1/12/1992","1/12/92",
		"01\\12\\1992","01\\12\\92","1\\2\\1992","1\\2\\92","12\\2\\1992","12\\2\\92","1\\12\\1992","1\\12\\92"};
	
	public static String randomTestString(String regex){
		Random r = new Random();
		int x;
		if(regex.equals(DATE_MM_DD_YYYY)){
			x = r.nextInt(testDATE_MM_DD_YYYY.length);
			return testDATE_MM_DD_YYYY[x];
		}
		return null;
	}
	
	public static void inputTestStrings(String regex,String name){
		Scanner input = new Scanner(System.in);
		String answer;
		System.out.println("\nEnter a test string (q quit, r randomString)");
		answer = input.nextLine();
		
		if(answer.equals("q"))
			System.exit(0);
		else if(answer.equals("r"))
			answer = randomTestString(regex);
			
		AttributeExtractor a = new AttributeExtractor (name);
		a.regexChecker(regex,answer);
		
		Printer p = Printer.createPrinter(a);
		p.printAllArrays();
		
		inputTestStrings(regex,name);
	}
}


public class ReversalBitesCount {

	
	public static void main(String[] args) {
		System.out.println(getBitsCount("47"));
	}
	
	private static Integer getBitsCount(String n) 
	{  
		try {
		String binaryString = Integer.toBinaryString(Integer.valueOf(n).intValue());
		String formattedStr = String.format("%0"+ (8 - binaryString.length() )+"d%s",0 ,binaryString);
		String reversed = formattedStr.chars()
			    .mapToObj(c -> (char)c)
			    .reduce("", (s,c) -> c+s, (s1,s2) -> s2+s1);

		return  Integer.parseInt(reversed,2);  
		}catch(Exception e) {
			return 0;
		}
	} 
 
}

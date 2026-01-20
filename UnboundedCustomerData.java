import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UnboundedCustData {
	public static List<?> UnboundedData(List<?> firstName) {
		return Arrays.asList(firstName);
	}

	public static void main(String[] args) {
		List<String> fName = Arrays.asList("Lexi", "Stefan", "Damon", "Elijah" ,"Ayush");
		
		System.out.println(UnboundedData(fName));
		
		
		List<String> fltr = 
			fName.stream()
			.filter(x -> x.startsWith("E") && x.endsWith("h"))
			.collect(Collectors.toList());
		System.out.println(fltr);
	}

}

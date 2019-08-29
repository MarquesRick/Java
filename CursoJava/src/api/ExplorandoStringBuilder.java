package api;

public class ExplorandoStringBuilder {
	
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		sb.append("João");
		sb.append(",");
		sb.append("Maria");
		sb.append(",");
		sb.append("Pedro");
		System.out.println(sb.toString());

		// É Mutavel
		sb.reverse();
		System.out.println(sb.toString());
		System.out.println(sb.substring(1, 3));
	}
}

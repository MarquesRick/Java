package api;

public class ExplorandoStringBuilder {
	
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Jo�o");
		sb.append(",");
		sb.append("Maria");
		sb.append(",");
		sb.append("Pedro");
		System.out.println(sb.toString());

		// � Mutavel
		sb.reverse();
		System.out.println(sb.toString());
		System.out.println(sb.substring(1, 3));
	}
}

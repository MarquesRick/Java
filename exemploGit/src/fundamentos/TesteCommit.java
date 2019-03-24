package fundamentos;

public class TesteCommit {
	
		public static void main(String[] args) {
			boolean executouTrabalho1 = false;
			boolean executouTrabalho2 = true;
			boolean comprouSorvete = executouTrabalho1 || executouTrabalho2;
			boolean comprouTv50 = executouTrabalho1 && executouTrabalho2;
			boolean comprouTv32 = executouTrabalho1 ^ executouTrabalho2; //"Ou Exclusivo" "^";
			
			System.out.println("Sorvete = " + comprouSorvete);
			System.out.println("TV 50 = " + comprouTv50);
			System.out.println("TV 32 = " + comprouTv32);
			//Operador Unário intruso 
			System.out.println("Fome = " + !comprouSorvete);
		}
}

import java.util.Scanner;

public class three {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in); 
		
		String[] candidatos = new String[4];
		
		for (int i = 0; i < candidatos.length; i++) {
			System.out.println("Candidato " + (i+1) + ":");
			candidatos[i] = ler.next();
		}
		
		System.out.println("Quantidade de alunos:");
		
		int alunos = ler.nextInt();		
		
		int[] votosCandidato = new int[5];
		
		for (int j = 0; j < alunos; j++) {

			System.out.println("\nVote no candidato:" +
					"\n1 para " + candidatos[0] +
					"\n2 para " + candidatos[1] +
					"\n3 para " + candidatos[2] +
					"\n4 para " + candidatos[3]+"\n");
			
			int voto = ler.nextInt();	
			
			if(voto>0 && voto<=4) {
				if(voto==1) {
					votosCandidato[0]++;
				}
				if(voto==2) {
					votosCandidato[1]++;
				}
				if(voto==3) {
					votosCandidato[2]++;
				}
				if(voto==4) {
					votosCandidato[3]++;
				}				
			}
			else {
				votosCandidato[4]++;
			}
			
		}
		
		ler.close();
		
		System.out.println("\nVotos de cada candidato:" +
				"\n Votos do candidato"+ candidatos[0] + ":" + votosCandidato[0] +
				"\n Votos do candidato"+ candidatos[1] + ":" + votosCandidato[1] +
				"\n Votos do candidato"+ candidatos[2] + ":" + votosCandidato[2] +
				"\n Votos do candidato"+ candidatos[3] + ":" + votosCandidato[3] +
				"\n Votos não válidos: " + votosCandidato[4]);		
		
		if(votosCandidato[0] > votosCandidato[1] && votosCandidato[0] > votosCandidato[2] && votosCandidato[0] > votosCandidato[3]) {
			System.out.println("O candidato "+ candidatos[0] + " ganhou!");
		}
		else if(votosCandidato[1] > votosCandidato[0] && votosCandidato[1] > votosCandidato[2] && votosCandidato[1] > votosCandidato[3]) {
			System.out.println("O candidato "+ candidatos[1] + " ganhou!");
		}
		else if(votosCandidato[2] > votosCandidato[0] && votosCandidato[2] > votosCandidato[2] && votosCandidato[2] > votosCandidato[3]) {
			System.out.println("O candidato "+ candidatos[2] + " ganhou!");
		}
		else if(votosCandidato[3] > votosCandidato[0] && votosCandidato[3] > votosCandidato[2] && votosCandidato[3] > votosCandidato[3]) {
			System.out.println("O candidato "+ candidatos[3] + " ganhou!");
		}
		else {
			System.out.println("\nNão houve vencedor!!!");
		}
		
	}
		
}

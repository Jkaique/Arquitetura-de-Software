package Exercicio8;

/**
 * 
 * @author Jheferson Kaique RA: 816123668- Turma:SIN3AN-MCA
 * 			
 *
 */

public class Teste {
	public static void main(String[] args) {
		
	NoticiarioAssina noticiario = new NoticiarioAssina();
	new Consumidor("Fernandes Martis", noticiario);
	noticiario.notificaNoticia("Nova noticia", 1, 2, "Tópicos interessantes!");
	new Consumidor("Marcos ", noticiario);
	noticiario.notificaNoticia("Uma noticia nova", 2, 2, "Tópico insatisfatório");
	
	
	}
}

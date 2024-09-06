import java.io.File;
import java.io.IOException;

public class Exemplo {

	public static void main(String[] args) {

		File f1 = new File ("teste.txt");
			
		 // Tentar executar o código que pode lançar uma exceção (IOException) ao criar ou manipular arquivos
		
		try {
			
		// Verifica se o arquivo existe e cria um novo arquivo se não existir
			
			if(!f1.exists()) {
				f1.createNewFile(); // Pode lançar IOException se houver um problema ao criar o arquivo
				
			} else if(f1.exists() && f1.isDirectory()) {
				System.out.println("Objeto existe e é um diretório");
			} else if (f1.exists() && f1.isFile()) {
				System.out.println("Objeto existe e é um arquivo " + f1.getName());
			}
			
		File f2 = new File ("./");
		
        // Verifica se o diretório existe e lista seus arquivos
		
			if(f2.exists() && f2.isDirectory()) {
				File[] lista = f2.listFiles(); // Pode lançar IOException se houver um problema ao ler a lista de arquivos
				
				for (File file : lista) {
					
					if(file.isDirectory()) {
						System.out.println("Diretório " + file.getName());
					}else {
						System.out.println("Arquivo " + file.getName());
					}
				}
			}
			
		} catch (IOException  e) {
			
            // Trata a exceção IOException se ela for lançada ao criar ou manipular arquivos

			e.printStackTrace();
			
		}
		
		// Parte do código a implementar, se quiser apagar o arquivo
		
	   //	System.out.println("Apagando arquivo");
	  //	f1.delete();
		
	}

}

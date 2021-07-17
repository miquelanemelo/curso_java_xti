package Java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Arquivo4 {

	public static void main(String[] args) throws IOException {
			
	Path path = Paths.get("C:\\Users\\Miquelane Melo\\eclipse-workspace\\fonte.txt");
	/*System.out.println(Files.exists(path));  verifica se o caminho é existente
	System.out.println(Files.isDirectory(path));  verifica se o caminho é um diretorio
	System.out.println(Files.isRegularFile(path)); verifica se é um arquivo regular ex: um texto, imagem
	System.out.println(Files.isExecutable(path));  verifica se é um arquivo executavel
	System.out.println(Files.size(path));// tamanho do arquivo
	System.out.println(Files.getLastModifiedTime(path)); mostra a ultima vez que o arquivo foi modificado
	System.out.println(Files.getOwner(path));  retorna o dono do arquivo
	System.out.println(Files.probeContentType(path));  retorna o tipo de arquivo
		Exclusão de arquivos
	Files.delete(path); Deleta mas pode lancar excesao
	Files.deleteIfExists; deleta */
	//	Create file
		Files.createFile(path); // Cria  um arquivo em branco
		Files.write(path, "Meu texto, testando".getBytes());
		
		// copy // 
		
		Path copia = Paths.get("C:\\Users\\Miquelane Melo\\eclipse-workspace\\copia.txt");
		Files.copy(path, copia, StandardCopyOption.REPLACE_EXISTING);
	

	}

}

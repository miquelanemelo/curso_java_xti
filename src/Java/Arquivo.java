package Java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:\\Users\\Miquelane Melo\\eclipse-workspace\\texto.txt");
		//path.toAbsolutePath() Retorna o caminho absoluto do arquivo
		//path.getParent() Retorna o diretorio onde se encontra o arquivo 
		//path.getRoot() Retorna a raiz do nosso sistema
		//path.getFileName() Retorna o nome do arquivo
		System.out.println(path.toAbsolutePath());
		System.out.println(path.getParent());
		System.out.println(path.getRoot()); 
		System.out.println(path.getFileName());
		/*Criação de diretorios*/
		Files.createDirectories(path.getParent());
		
		/*Escrever e ler Arquivos*/
		byte[] bytes = "Testando".getBytes();
		Files.write(path, bytes); // cria, limpa e escreve o texto dentro do arquivo
		byte[] retorno = Files.readAllBytes(path);
		System.out.println(new String(retorno));

	}

}

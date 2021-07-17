package Java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo2 {

	public static void main(String[] args) throws IOException {

		Path path = Paths.get("C:\\Users\\Miquelane Melo\\eclipse-workspace\\texto.txt");
		Charset utf8 = StandardCharsets.UTF_8;

		/* Escrita de arquivos */
		try (BufferedWriter w = Files.newBufferedWriter(path, utf8)) {
			w.write("Texto");
			w.write("Texto");
			w.flush(); // grava as informações no disco rigido
		} catch (IOException e) {
			e.printStackTrace();
		}
		/* Leitura de Arquivos */
		try (BufferedReader reader = Files.newBufferedReader(path, utf8)) {
			String line = null;
			while ((line = reader.readLine()) != null) // retorna as linhas desse arquivo
			{
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

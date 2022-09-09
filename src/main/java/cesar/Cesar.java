package cesar;

import java.io.*;

public class Cesar {
    public static void main(String[] args) throws IOException {
        BufferedReader palavras = new BufferedReader(new FileReader("src/main/resources/palavras.txt"));
        String linha = "";
        while (true) {
            if (linha != null) {
                System.out.println(linha);
            } else{
                break;
            }
            linha = palavras.readLine();
        }
        palavras.close();
    }
}

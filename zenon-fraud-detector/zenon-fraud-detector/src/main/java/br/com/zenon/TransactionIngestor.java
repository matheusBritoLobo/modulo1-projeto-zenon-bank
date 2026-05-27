package br.com.zenon;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TransactionIngestor {

    public void lerArquivo(String caminho, int qtd) throws IOException {
        FileReader reader = new FileReader(caminho);
        BufferedReader br = new BufferedReader(reader);
        List<Transaction> transactions = new ArrayList<>();
        String linha;
        int c = 0;

        while((linha = br.readLine()) != null){
            if(c==0){
                c++;
                continue;
            }
            String[] separada = linha.split(",");
            TransactionCostumer tcOrigin = new TransactionCostumer(separada[3],Double.parseDouble(separada[4]),Double.parseDouble(separada[5]));
            TransactionCostumer tcDest = new TransactionCostumer(separada[6],Double.parseDouble(separada[7]),Double.parseDouble(separada[8]));

            Transaction t = new Transaction(Integer.parseInt(separada[0]),
                    TransactionType.valueOf(TransactionType.class,separada[1]),
                    Double.parseDouble(separada[2]),
                    tcOrigin,
                    tcDest,
                    !separada[9].equals("0"),
                    !separada[10].equals("0"));
            transactions.add(t);
            if(c == 1000){
                break;
            }
            c++;
        }
        br.close();

        for(int i = 0; i<qtd; i++){
            System.out.println(i+1 +" - "+ transactions.get(i));
        }
    }


}

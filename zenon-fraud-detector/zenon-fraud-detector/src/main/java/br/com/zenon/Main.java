package br.com.zenon;



import java.io.IOException;

import static br.com.zenon.TransactionType.*;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() throws IOException {

        TransactionIngestor tI = new TransactionIngestor();
        tI.lerArquivo("C:\\Users\\mathe\\Desktop\\Fundamentos do Java\\data\\PS_20174392719_1491204439457_log.csv", 10);
    }
}


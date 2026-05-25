package br.com.zenon;



import static br.com.zenon.TransactionType.*;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        TransactionCostumer tcO1 = new TransactionCostumer("C1231006815",170136.0,160296.36);
        TransactionCostumer tcR1 = new TransactionCostumer("M1979787155",0.0,0.0);

        TransactionCostumer tcO2 = new TransactionCostumer("C1280323807",850002.52,0.0);
        TransactionCostumer tcR2 = new TransactionCostumer("C873221189",6510099.11,7360101.63);

        Transaction transaction1 = new Transaction(
                1,PAYMENT,9839.64, tcO1,tcR1,false,false);

        Transaction transaction2 = new Transaction(
                743,CASH_OUT,850002.52,tcO2,tcR2,true,false);

        IO.println(transaction1);
        IO.println("---------------");
        IO.println(transaction2);

    }
}


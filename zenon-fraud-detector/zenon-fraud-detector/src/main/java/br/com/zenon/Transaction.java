package br.com.zenon;

public record Transaction(int step, TransactionType type, double amount, TransactionCostumer origin,
                          TransactionCostumer recipient, boolean isFraud, boolean isFlaggedFraud) {

}

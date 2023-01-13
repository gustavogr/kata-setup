package org.example.kata;

public class Statement {

    private final int amount;
    private final StatementType type;


    public Statement(int amount, StatementType type) {
        this.amount = amount;
        this.type = type;
    }

    public static Statement depositOf(int amount) {
        return new Statement(amount, StatementType.DEPOSIT);
    }

    public static Statement withdrawOf(int amount) {
        return new Statement(amount, StatementType.WITHDRAW);
    }

    public boolean isDeposit() {
        return type == StatementType.DEPOSIT;
    }

    public boolean isWithdraw() {
        return type == StatementType.WITHDRAW;
    }
}

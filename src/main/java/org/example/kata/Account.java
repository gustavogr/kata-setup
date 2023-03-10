package org.example.kata;


import java.util.List;

public class Account {
    private final StatementRepository statementRepository = new StatementRepository();
    private StatementPrinter statementPrinter;

    public void deposit(int amount) {
        Statement statement = Statement.depositOf(amount);
        statementRepository.save(statement);
    }

    public void withdraw(int amount) {
        Statement statement = Statement.withdrawOf(amount);
        statementRepository.save(statement);
    }

    public void printStatement() {
        List<Statement> statements = statementRepository.getStatements();
        statementPrinter.print(statements);
    }

}

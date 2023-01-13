package org.example.kata;

import java.sql.Statement;
import java.util.List;

public class Account {
    public void deposit(int i) {
        statementRepository.save(statement);
    }

    public void withdraw(int i) {
        statementRepository.save(statement);
    }

    public void printStatement() {
        List<Statement> statements = statementRepository.getStatements();
        statementPrinter.print(statements);
    }
}

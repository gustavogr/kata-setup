package org.example.kata;

import java.util.ArrayList;
import java.util.List;

public class StatementRepository {


    private final List<Statement> statements = new ArrayList<>();

    public void save(Statement statement) {
        this.statements.add(statement);
    }

    public List<Statement> getStatements() {
        return statements;
    }
}

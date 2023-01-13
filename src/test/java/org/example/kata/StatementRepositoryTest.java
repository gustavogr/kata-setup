package org.example.kata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatementRepositoryTest {

    private StatementRepository statementRepository;
    private final int notImportantAmount = 100;

    @BeforeEach
    void setUp() {
        statementRepository = new StatementRepository();
    }

    @Test
    void that_saves_one_statement() {
        Statement statement = Statement.depositOf(notImportantAmount);

        statementRepository.save(statement);

        assertEquals(1, statementRepository.getStatements().size());
    }

    @Test
    void that_saves_multiple_statements() {
        Statement statement1 = Statement.depositOf(notImportantAmount);
        Statement statement2 = Statement.depositOf(notImportantAmount);

        statementRepository.save(statement1);
        statementRepository.save(statement2);

        assertEquals(2, statementRepository.getStatements().size());
    }
}

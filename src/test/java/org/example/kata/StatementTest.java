package org.example.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatementTest {

    @Test
    void creates_a_deposit_statement() {
        int amount = 10;
        Statement statement = Statement.depositOf(amount);
        assertTrue(statement.isDeposit());
        assertFalse(statement.isWithdraw());
    }

    @Test
    void creates_a_withdraw_statement() {
        int amount = 10;
        Statement statement = Statement.withdrawOf(amount);
        assertTrue(statement.isWithdraw());
    }
}
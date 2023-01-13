package org.example.kata;

import org.example.kata.Account;
import org.example.kata.MyConsole;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mock;

import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;

public class AccountTest {

    private Account account = new Account();

    @Mock
    private MyConsole console;

    @BeforeEach
    void setUp() {
        account = new Account();
        console = mock(MyConsole.class);
    }

    @Test
    void itShouldWorks() {
        account.deposit(1000);
        account.deposit(2000);
        account.withdraw(500);

        account.printStatement();

        InOrder inOrder = inOrder(console);
        inOrder.verify(console).printLine("DATE | AMOUNT | BALANCE");
        inOrder.verify(console).printLine("10/04/2014 | 500.00 | 1400");
        inOrder.verify(console).printLine ("02/04/2014 | -100.00 | 900");
        inOrder.verify(console).printLine("01/04/2014 | 1000.00 | 100");
    }
}

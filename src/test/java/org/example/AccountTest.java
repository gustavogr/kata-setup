package org.example;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

public class AccountTest {
    @Test
    void itShouldWorks() {
        Account account = new Account();
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

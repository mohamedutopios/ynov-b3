package org.example.o.solution;

public class Demo {

    public static void main(String[] args) {
        LoanHandler loanHandler = new ImmoLoanHandler(new ImmoLoanValidator());

        User user = new User();

        loanHandler.approveloan(user);

    }

}

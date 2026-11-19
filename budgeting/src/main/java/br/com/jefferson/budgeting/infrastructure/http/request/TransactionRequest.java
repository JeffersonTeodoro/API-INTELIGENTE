package br.com.jefferson.budgeting.infrastructure.http.request;

import br.com.jefferson.budgeting.application.input.PersistTransactionInput;
import br.com.jefferson.budgeting.domain.Category;

public record TransactionRequest(String descriotion, Category category, long amount) {
    public PersistTransactionInput toInput() {
        return new PersistTransactionInput(descriotion,amount, category);
    }
}

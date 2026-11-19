package br.com.jefferson.budgeting.application.input;

import br.com.jefferson.budgeting.domain.Category;
import org.springframework.ai.tool.annotation.ToolParam;

public record PersistTransactionInput(@ToolParam(description = "Descrição do gasto") String description,
                                      @ToolParam(description = "Valor do gasto (em centavos )") long amount,
                                      @ToolParam(description = "Categoria de uam transação") Category category) {
}

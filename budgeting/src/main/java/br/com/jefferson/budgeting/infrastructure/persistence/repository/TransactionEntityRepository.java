package br.com.jefferson.budgeting.infrastructure.persistence.repository;

import br.com.jefferson.budgeting.domain.Category;
import br.com.jefferson.budgeting.infrastructure.persistence.entity.TransactionEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface TransactionEntityRepository extends CrudRepository<TransactionEntity, UUID> {
    List<TransactionEntity> findByCategory(Category category);
}

package core.basesyntax.strategy;

import core.basesyntax.model.FruitTransaction;
import core.basesyntax.operation.OperationHandler;

public interface OperationStrategy {
    OperationHandler process(FruitTransaction.Operation operation);
}

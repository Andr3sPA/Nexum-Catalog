package co.edu.udea.nexum.catalog.common.domain.model;

import co.edu.udea.nexum.catalog.common.domain.utils.contracts.BaseBuilder;

public interface Model<T> {
    T getId();

    void setId(T id);
}

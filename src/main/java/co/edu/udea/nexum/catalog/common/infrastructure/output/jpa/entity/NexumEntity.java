package co.edu.udea.nexum.catalog.common.infrastructure.output.jpa.entity;

import java.io.Serializable;

public interface NexumEntity <ID> extends Serializable {
    ID getId();
    void setId(ID id);
}

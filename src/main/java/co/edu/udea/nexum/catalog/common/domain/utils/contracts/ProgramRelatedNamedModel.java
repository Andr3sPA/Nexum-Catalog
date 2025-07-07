package co.edu.udea.nexum.catalog.common.domain.utils.contracts;

import co.edu.udea.nexum.catalog.program.domain.model.Program;

public interface ProgramRelatedNamedModel {
    Long getId();
    String getName();
    Program getProgram();
}

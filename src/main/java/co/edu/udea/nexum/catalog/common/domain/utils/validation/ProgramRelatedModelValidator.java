package co.edu.udea.nexum.catalog.common.domain.utils.validation;

import co.edu.udea.nexum.catalog.common.domain.exception.EntityAlreadyExistsException;
import co.edu.udea.nexum.catalog.common.domain.exception.EntityNotFoundException;
import co.edu.udea.nexum.catalog.common.domain.spi.BaseCrudPersistencePort;
import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.common.domain.utils.contracts.ProgramRelatedNamedModel;
import co.edu.udea.nexum.catalog.program.domain.model.Program;

import java.util.function.BiFunction;

@Generated
public class ProgramRelatedModelValidator {

    private ProgramRelatedModelValidator() {
        throw new IllegalStateException("Utility class");
    }

    public static <T extends ProgramRelatedNamedModel> void validate(
            Long currentId,
            T model,
            BaseCrudPersistencePort<Long, Program> programPersistencePort,
            BiFunction<Long, String, T> findByProgramIdAndName,
            String programIdFieldName,
            String nameFieldName
    ) {
        Long programId = model.getProgram() != null ? model.getProgram().getId() : null;
        if (programId == null || programPersistencePort.findById(programId) == null) {
            assert programId != null;
            throw new EntityNotFoundException(
                    Program.class.getSimpleName(),
                    programIdFieldName,
                    programId.toString()
            );
        }

        T existing = findByProgramIdAndName.apply(programId, model.getName());
        if (existing != null && !existing.getId().equals(currentId)) {
            throw new EntityAlreadyExistsException(
                    model.getClass().getSimpleName(),
                    nameFieldName,
                    model.getName()
            );
        }
    }
}

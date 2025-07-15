package co.edu.udea.nexum.catalog.program.infrastructure.output.jpa.adapter;

import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.common.infrastructure.output.jpa.adapter.impl.BaseCrudAdapterImpl;
import co.edu.udea.nexum.catalog.common.infrastructure.output.jpa.mapper.BaseEntityMapper;
import co.edu.udea.nexum.catalog.program.domain.model.Program;
import co.edu.udea.nexum.catalog.program.domain.spi.ProgramPersistencePort;
import co.edu.udea.nexum.catalog.program.infrastructure.output.jpa.entity.ProgramEntity;
import co.edu.udea.nexum.catalog.program.infrastructure.output.jpa.mapper.ProgramEntityMapper;
import co.edu.udea.nexum.catalog.program.infrastructure.output.jpa.repository.ProgramRepository;
import co.edu.udea.nexum.catalog.program_version.domain.model.ProgramVersion;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Generated
@RequiredArgsConstructor
public class ProgramJpaAdapter extends BaseCrudAdapterImpl<Long, Program, ProgramEntity> implements ProgramPersistencePort {
    private final ProgramRepository programRepository;
    private final ProgramEntityMapper programEntityMapper;

    @Override
    protected BaseEntityMapper<Program, ProgramEntity> getMapper() {
        return programEntityMapper;
    }

    @Override
    protected CrudRepository<ProgramEntity, Long> getRepository() {
        return programRepository;
    }

    @Override
    public Program findByCode(String sniesCode) {
        return programRepository.findByCode(sniesCode)
                .map(programEntityMapper::toDomain)
                .orElse(null);
    }
}

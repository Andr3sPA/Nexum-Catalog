package co.edu.udea.nexum.catalog.program.infrastructure.output.jpa.adapter;

import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.common.infrastructure.output.jpa.adapter.impl.BaseCrudAdapterImpl;
import co.edu.udea.nexum.catalog.common.infrastructure.output.jpa.mapper.BaseEntityMapper;
import co.edu.udea.nexum.catalog.program.domain.model.Program;
import co.edu.udea.nexum.catalog.program.domain.spi.ProgramPersistencePort;
import co.edu.udea.nexum.catalog.program.infrastructure.output.jpa.entity.ProgramEntity;
import co.edu.udea.nexum.catalog.program.infrastructure.output.jpa.mapper.ProgramEntityMapper;
import co.edu.udea.nexum.catalog.program.infrastructure.output.jpa.repository.ProgramRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

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
    public Program findBySniesCode(String sniesCode) {
        return programEntityMapper.toDomain(
                programRepository.findBySniesCode(sniesCode)
        );
    }
}

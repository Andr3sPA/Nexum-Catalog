package co.edu.udea.nexum.catalog.program_competency.infrastructure.output.jpa.adapter;

import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.common.infrastructure.output.jpa.adapter.impl.BaseCrudAdapterImpl;
import co.edu.udea.nexum.catalog.common.infrastructure.output.jpa.mapper.BaseEntityMapper;
import co.edu.udea.nexum.catalog.program_competency.domain.model.ProgramCompetency;
import co.edu.udea.nexum.catalog.program_competency.domain.spi.ProgramCompetencyPersistencePort;
import co.edu.udea.nexum.catalog.program_competency.infrastructure.output.jpa.entity.ProgramCompetencyEntity;
import co.edu.udea.nexum.catalog.program_competency.infrastructure.output.jpa.mapper.ProgramCompetencyEntityMapper;
import co.edu.udea.nexum.catalog.program_competency.infrastructure.output.jpa.repository.ProgramCompetencyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Generated
@RequiredArgsConstructor
public class ProgramCompetencyJpaAdapter
        extends BaseCrudAdapterImpl<Long, ProgramCompetency, ProgramCompetencyEntity>
        implements ProgramCompetencyPersistencePort {

    private final ProgramCompetencyRepository programCompetencyRepository;
    private final ProgramCompetencyEntityMapper programCompetencyEntityMapper;

    @Override
    protected CrudRepository<ProgramCompetencyEntity, Long> getRepository() {
        return programCompetencyRepository;
    }

    @Override
    protected BaseEntityMapper<ProgramCompetency, ProgramCompetencyEntity> getMapper() {
        return programCompetencyEntityMapper;
    }

    @Override
    public List<ProgramCompetency> findAllByProgramId(Long programId) {
        return programCompetencyEntityMapper.toDomains(
                programCompetencyRepository.findAllByProgram_Id(programId)
        );
    }

    @Override
    public ProgramCompetency findByProgramIdAndName(Long programId, String name) {
        return programCompetencyRepository.findByProgram_IdAndName(programId, name)
                .map(programCompetencyEntityMapper::toDomain)
                .orElse(null);
    }
}

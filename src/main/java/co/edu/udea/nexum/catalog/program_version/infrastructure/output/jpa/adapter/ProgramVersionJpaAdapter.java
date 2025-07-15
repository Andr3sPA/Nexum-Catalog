package co.edu.udea.nexum.catalog.program_version.infrastructure.output.jpa.adapter;

import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.common.infrastructure.output.jpa.adapter.impl.BaseCrudAdapterImpl;
import co.edu.udea.nexum.catalog.common.infrastructure.output.jpa.mapper.BaseEntityMapper;
import co.edu.udea.nexum.catalog.program_version.domain.model.ProgramVersion;
import co.edu.udea.nexum.catalog.program_version.domain.spi.ProgramVersionPersistencePort;
import co.edu.udea.nexum.catalog.program_version.infrastructure.output.jpa.entity.ProgramVersionEntity;
import co.edu.udea.nexum.catalog.program_version.infrastructure.output.jpa.mapper.ProgramVersionEntityMapper;
import co.edu.udea.nexum.catalog.program_version.infrastructure.output.jpa.repository.ProgramVersionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Generated
@RequiredArgsConstructor
public class ProgramVersionJpaAdapter
        extends BaseCrudAdapterImpl<Long, ProgramVersion, ProgramVersionEntity>
        implements ProgramVersionPersistencePort {
    private final ProgramVersionRepository programVersionRepository;
    private final ProgramVersionEntityMapper programVersionEntityMapper;

    @Override
    protected BaseEntityMapper<ProgramVersion, ProgramVersionEntity> getMapper() {
        return programVersionEntityMapper;
    }

    @Override
    protected CrudRepository<ProgramVersionEntity, Long> getRepository() {
        return programVersionRepository;
    }

    public boolean existByProgramIdAndVersion(Long id, Short version) {
        return programVersionRepository.existsByProgram_IdAndVersion(id, version);
    }

    @Override
    public ProgramVersion findByProgramIdAndVersion(Long id, Short version) {

        return programVersionRepository.findByVersionAndProgram_Id(version, id)
                .map(programVersionEntityMapper::toDomain)
                .orElse(null);
    }

    @Override
    public List<ProgramVersion> findAllByProgramId(Long programId) {
        return programVersionEntityMapper.toDomains(
                programVersionRepository.findAllByProgram_Id(programId)
        );
    }
}

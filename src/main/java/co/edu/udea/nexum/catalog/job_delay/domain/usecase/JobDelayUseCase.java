package co.edu.udea.nexum.catalog.job_delay.domain.usecase;

import co.edu.udea.nexum.catalog.common.domain.usecase.AuditableCrudUseCase;
import co.edu.udea.nexum.catalog.common.domain.spi.BaseCrudPersistencePort;
import co.edu.udea.nexum.catalog.job_delay.domain.api.JobDelayServicePort;
import co.edu.udea.nexum.catalog.job_delay.domain.model.JobDelay;
import co.edu.udea.nexum.catalog.job_delay.domain.spi.JobDelayPersistencePort;

import java.util.List;

import static co.edu.udea.nexum.catalog.common.domain.utils.functions.CommonHelpers.replaceIfNotNull;
import static co.edu.udea.nexum.catalog.common.domain.utils.functions.OrderableHelper.*;

public class JobDelayUseCase
        extends AuditableCrudUseCase<Long, JobDelay>
        implements JobDelayServicePort {

    private final JobDelayPersistencePort jobDelayPersistencePort;

    public JobDelayUseCase(JobDelayPersistencePort jobDelayPersistencePort) {
        this.jobDelayPersistencePort = jobDelayPersistencePort;
    }

    @Override
    public JobDelay save(JobDelay model) {
        return saveOrdered(
                model,
                jobDelayPersistencePort::findAllByOrderByOrderAsc,
                super::save,
                jobDelayPersistencePort::update
        );
    }

    @Override
    public JobDelay updateById(Long id, JobDelay payload) {
        JobDelay original = findById(id);
        JobDelay patched = patch(original, payload);
        validateEntity(id, patched);
        JobDelay enriched = loadAssociations(patched);
        return updateOrdered(
                original,
                enriched,
                jobDelayPersistencePort::findAllByOrderByOrderAsc,
                jobDelayPersistencePort::update
        );
    }

    @Override
    public JobDelay deleteById(Long id) {
        JobDelay toDelete = findById(id);
        List<JobDelay> all = jobDelayPersistencePort.findAllByOrderByOrderAsc();
        deleteOrdered(
                toDelete,
                all,
                d -> jobDelayPersistencePort.deleteById(d.getId()),
                jobDelayPersistencePort::update
        );
        return toDelete;
    }

    @Override
    protected BaseCrudPersistencePort<Long, JobDelay> getPersistencePort() {
        return jobDelayPersistencePort;
    }

    @Override
    protected String getModelClassName() {
        return JobDelay.class.getSimpleName();
    }

    @Override
    protected JobDelay patch(JobDelay original, JobDelay patch) {
        replaceIfNotNull(patch.getLabel(), original::setLabel);
        replaceIfNotNull(patch.getOrder(), original::setOrder);
        replaceIfNotNull(patch.getActive(), original::setActive);
        return original;
    }

    @Override
    protected void validateEntity(Long currentId, JobDelay model) {
    }
}

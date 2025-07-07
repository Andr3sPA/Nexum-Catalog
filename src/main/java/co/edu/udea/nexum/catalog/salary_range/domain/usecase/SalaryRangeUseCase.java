package co.edu.udea.nexum.catalog.salary_range.domain.usecase;

import co.edu.udea.nexum.catalog.common.domain.spi.BaseCrudPersistencePort;
import co.edu.udea.nexum.catalog.common.domain.usecase.AuditableCrudUseCase;
import co.edu.udea.nexum.catalog.salary_range.domain.api.SalaryRangeServicePort;
import co.edu.udea.nexum.catalog.salary_range.domain.model.SalaryRange;
import co.edu.udea.nexum.catalog.salary_range.domain.spi.SalaryRangePersistencePort;

import java.util.List;

import static co.edu.udea.nexum.catalog.common.domain.utils.functions.CommonHelpers.replaceIfNotNull;
import static co.edu.udea.nexum.catalog.common.domain.utils.functions.OrderableHelper.*;

public class SalaryRangeUseCase
        extends AuditableCrudUseCase<Long, SalaryRange>
        implements SalaryRangeServicePort {

    private final SalaryRangePersistencePort salaryRangePersistencePort;

    public SalaryRangeUseCase(SalaryRangePersistencePort salaryRangePersistencePort) {
        this.salaryRangePersistencePort = salaryRangePersistencePort;
    }

    @Override
    public SalaryRange save(SalaryRange model) {
        return saveOrdered(
                model,
                salaryRangePersistencePort::findAllByOrderByOrderAsc,
                super::save,
                salaryRangePersistencePort::update
        );
    }

    @Override
    public SalaryRange updateById(Long id, SalaryRange payload) {
        SalaryRange original = findById(id);
        SalaryRange patched = patch(original, payload);
        validateEntity(id, patched);
        SalaryRange enriched = loadAssociations(patched);
        return updateOrdered(
                original,
                enriched,
                salaryRangePersistencePort::findAllByOrderByOrderAsc,
                salaryRangePersistencePort::update
        );
    }

    @Override
    public SalaryRange deleteById(Long id) {
        SalaryRange toDelete = findById(id);
        List<SalaryRange> all = salaryRangePersistencePort.findAllByOrderByOrderAsc();
        deleteOrdered(
                toDelete,
                all,
                salaryRange -> salaryRangePersistencePort.deleteById(salaryRange.getId()),
                salaryRangePersistencePort::update
        );
        return toDelete;
    }

    @Override
    protected BaseCrudPersistencePort<Long, SalaryRange> getPersistencePort() {
        return salaryRangePersistencePort;
    }

    @Override
    protected String getModelClassName() {
        return SalaryRange.class.getSimpleName();
    }

    @Override
    protected SalaryRange patch(SalaryRange original, SalaryRange patch) {
        replaceIfNotNull(patch.getSalary(), original::setSalary);
        replaceIfNotNull(patch.getOrder(), original::setOrder);
        replaceIfNotNull(patch.getActive(), original::setActive);
        return original;
    }

    @Override
    protected void validateEntity(Long currentId, SalaryRange model) {
    }
}

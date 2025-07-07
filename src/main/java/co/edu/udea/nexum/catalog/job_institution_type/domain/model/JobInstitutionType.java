package co.edu.udea.nexum.catalog.job_institution_type.domain.model;

import co.edu.udea.nexum.catalog.common.domain.model.Model;
import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.common.domain.utils.contracts.BaseBuilder;
import co.edu.udea.nexum.catalog.common.domain.utils.contracts.ProgramRelatedNamedModel;
import co.edu.udea.nexum.catalog.program.domain.model.Program;

@Generated
public class JobInstitutionType implements Model<Long>, ProgramRelatedNamedModel {
    private Long id;
    private String name;
    private String description;
    private Program program;

    public JobInstitutionType(JobInstitutionTypeBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.description = builder.description;
        this.program = builder.program;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    public static JobInstitutionTypeBuilder builder() {
        return new JobInstitutionTypeBuilder();
    }

    public static class JobInstitutionTypeBuilder implements BaseBuilder<JobInstitutionType> {
        private Long id;
        private String name;
        private String description;
        private Program program;

        public JobInstitutionTypeBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public JobInstitutionTypeBuilder name(String name) {
            this.name = name;
            return this;
        }

        public JobInstitutionTypeBuilder description(String description) {
            this.description = description;
            return this;
        }

        public JobInstitutionTypeBuilder program(Program program) {
            this.program = program;
            return this;
        }

        @Override
        public JobInstitutionType build() {
            return new JobInstitutionType(this);
        }
    }
}

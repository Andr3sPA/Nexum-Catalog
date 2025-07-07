package co.edu.udea.nexum.catalog.job_area.domain.model;

import co.edu.udea.nexum.catalog.common.domain.model.Model;
import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.common.domain.utils.contracts.BaseBuilder;
import co.edu.udea.nexum.catalog.common.domain.utils.contracts.ProgramRelatedNamedModel;
import co.edu.udea.nexum.catalog.program.domain.model.Program;

@Generated
public class JobArea implements Model<Long>, ProgramRelatedNamedModel {
    private Long id;
    private String name;
    private String description;
    private Program program;

    public JobArea(JobAreaBuilder builder) {
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

    public static JobAreaBuilder builder() {
        return new JobAreaBuilder();
    }

    public static class JobAreaBuilder implements BaseBuilder<JobArea> {
        private Long id;
        private String name;
        private String description;
        private Program program;

        public JobAreaBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public JobAreaBuilder name(String name) {
            this.name = name;
            return this;
        }

        public JobAreaBuilder description(String description) {
            this.description = description;
            return this;
        }

        public JobAreaBuilder program(Program program) {
            this.program = program;
            return this;
        }

        @Override
        public JobArea build() {
            return new JobArea(this);
        }
    }
}

package co.edu.udea.nexum.catalog.program_competency.domain.model;

import co.edu.udea.nexum.catalog.common.domain.model.Model;
import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.common.domain.utils.contracts.BaseBuilder;
import co.edu.udea.nexum.catalog.common.domain.utils.contracts.ProgramRelatedNamedModel;
import co.edu.udea.nexum.catalog.program.domain.model.Program;

@Generated
public class ProgramCompetency implements Model<Long>, ProgramRelatedNamedModel {
    private Long id;
    private String name;
    private String description;
    private Program program;

    public ProgramCompetency(ProgramCompetencyBuilder builder) {
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

    public static ProgramCompetencyBuilder builder() {
        return new ProgramCompetencyBuilder();
    }

    public static class ProgramCompetencyBuilder implements BaseBuilder<ProgramCompetency> {
        private Long id;
        private String name;
        private String description;
        private Program program;

        public ProgramCompetencyBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public ProgramCompetencyBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ProgramCompetencyBuilder description(String description) {
            this.description = description;
            return this;
        }

        public ProgramCompetencyBuilder program(Program program) {
            this.program = program;
            return this;
        }

        @Override
        public ProgramCompetency build() {
            return new ProgramCompetency(this);
        }
    }
}

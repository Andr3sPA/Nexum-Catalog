package co.edu.udea.nexum.catalog.program_version.domain.model;

import co.edu.udea.nexum.catalog.common.domain.model.Model;
import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.common.domain.utils.contracts.BaseBuilder;
import co.edu.udea.nexum.catalog.program.domain.model.Program;

@Generated
public class ProgramVersion implements Model<Long> {
    private Long id;
    private Program program;
    private Short version;
    private Integer startYear;
    private Integer endYear;

    public ProgramVersion(ProgramVersionBuilder builder) {
        this.id = builder.id;
        this.program = builder.program;
        this.version = builder.version;
        this.startYear = builder.startYear;
        this.endYear = builder.endYear;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    public Short getVersion() {
        return version;
    }

    public void setVersion(Short version) {
        this.version = version;
    }

    public Integer getStartYear() {
        return startYear;
    }

    public void setStartYear(Integer startYear) {
        this.startYear = startYear;
    }

    public Integer getEndYear() {
        return endYear;
    }

    public void setEndYear(Integer endYear) {
        this.endYear = endYear;
    }

    public static ProgramVersionBuilder builder() {
        return new ProgramVersionBuilder();
    }

    @Generated
    public static class ProgramVersionBuilder implements BaseBuilder<ProgramVersion> {
        private Long id;
        private Program program;
        private Short version;
        private Integer startYear;
        private Integer endYear;

        public ProgramVersionBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public ProgramVersionBuilder program(Program program) {
            this.program = program;
            return this;
        }

        public ProgramVersionBuilder version(Short version) {
            this.version = version;
            return this;
        }

        public ProgramVersionBuilder startYear(Integer startYear) {
            this.startYear = startYear;
            return this;
        }

        public ProgramVersionBuilder endYear(Integer endYear) {
            this.endYear = endYear;
            return this;
        }


        @Override
        public ProgramVersion build() {
            return new ProgramVersion(this);
        }
    }
}

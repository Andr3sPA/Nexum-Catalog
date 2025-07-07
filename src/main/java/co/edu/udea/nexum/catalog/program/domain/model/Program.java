package co.edu.udea.nexum.catalog.program.domain.model;

import co.edu.udea.nexum.catalog.common.domain.model.Model;
import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.common.domain.utils.contracts.BaseBuilder;

@Generated
public class Program implements Model<Long> {
    private Long id;
    private String name;
    private String code;

    public Program(ProgramBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.code = builder.code;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public static ProgramBuilder builder() {
        return new ProgramBuilder();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public static class ProgramBuilder implements BaseBuilder<Program> {
        private Long id;
        private String name;
        private String code;

        public ProgramBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public ProgramBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ProgramBuilder code(String sniesCode) {
            this.code = sniesCode;
            return this;
        }

        public Program build() {
            return new Program(this);
        }
    }

}

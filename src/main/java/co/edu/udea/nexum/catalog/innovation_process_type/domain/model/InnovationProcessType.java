package co.edu.udea.nexum.catalog.innovation_process_type.domain.model;

import co.edu.udea.nexum.catalog.common.domain.model.Model;
import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.common.domain.utils.contracts.BaseBuilder;

@Generated
public class InnovationProcessType implements Model<Long> {
    private Long id;
    private String name;
    private String description;
    private Boolean enabled;

    public InnovationProcessType(InnovationProcessTypeBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.description = builder.description;
        this.enabled = builder.enabled;
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

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public static InnovationProcessTypeBuilder builder() {
        return new InnovationProcessTypeBuilder();
    }

    public static class InnovationProcessTypeBuilder implements BaseBuilder<InnovationProcessType> {
        private Long id;
        private String name;
        private String description;
        private Boolean enabled;

        public InnovationProcessTypeBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public InnovationProcessTypeBuilder name(String name) {
            this.name = name;
            return this;
        }

        public InnovationProcessTypeBuilder description(String description) {
            this.description = description;
            return this;
        }

        public InnovationProcessTypeBuilder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        @Override
        public InnovationProcessType build() {
            return new InnovationProcessType(this);
        }
    }
}

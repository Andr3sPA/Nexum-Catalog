package co.edu.udea.nexum.catalog.alternative_academic_route.domain.model;

import co.edu.udea.nexum.catalog.common.domain.model.Model;
import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.common.domain.utils.contracts.BaseBuilder;

@Generated
public class AlternativeAcademicRoute implements Model<Long> {
    private Long id;
    private String name;
    private String description;
    private Boolean enabled;

    public AlternativeAcademicRoute(AlternativeAcademicRouteBuilder builder) {
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

    public static AlternativeAcademicRouteBuilder builder() {
        return new AlternativeAcademicRouteBuilder();
    }

    public static class AlternativeAcademicRouteBuilder implements BaseBuilder<AlternativeAcademicRoute> {
        private Long id;
        private String name;
        private String description;
        private Boolean enabled;

        public AlternativeAcademicRouteBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public AlternativeAcademicRouteBuilder name(String name) {
            this.name = name;
            return this;
        }

        public AlternativeAcademicRouteBuilder description(String description) {
            this.description = description;
            return this;
        }

        public AlternativeAcademicRouteBuilder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        @Override
        public AlternativeAcademicRoute build() {
            return new AlternativeAcademicRoute(this);
        }
    }
}

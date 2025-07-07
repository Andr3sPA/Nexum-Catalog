package co.edu.udea.nexum.catalog.job_delay.domain.model;

import co.edu.udea.nexum.catalog.common.domain.model.AuditableModel;
import co.edu.udea.nexum.catalog.common.domain.model.Model;
import co.edu.udea.nexum.catalog.common.domain.model.OrderableModel;
import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.common.domain.utils.contracts.BaseBuilder;

import java.time.LocalDateTime;

@Generated
public class JobDelay implements Model<Long>, AuditableModel, OrderableModel {
    private Long id;
    private String label;
    private Integer order;
    private Boolean active;
    private LocalDateTime creationDate;
    private LocalDateTime lastUpdate;

    public JobDelay(JobDelayBuilder builder) {
        this.id = builder.id;
        this.label = builder.label;
        this.order = builder.order;
        this.active = builder.active;
        this.creationDate = builder.creationDate;
        this.lastUpdate = builder.lastUpdate;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public Integer getOrder() {
        return order;
    }

    @Override
    public void setOrder(Integer order) {
        this.order = order;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    @Override
    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    @Override
    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public static JobDelayBuilder builder() {
        return new JobDelayBuilder();
    }

    public static class JobDelayBuilder implements BaseBuilder<JobDelay> {
        private Long id;
        private String label;
        private Integer order;
        private Boolean active;
        private LocalDateTime creationDate;
        private LocalDateTime lastUpdate;

        public JobDelayBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public JobDelayBuilder label(String label) {
            this.label = label;
            return this;
        }

        public JobDelayBuilder order(Integer order) {
            this.order = order;
            return this;
        }

        public JobDelayBuilder active(Boolean active) {
            this.active = active;
            return this;
        }

        public JobDelayBuilder creationDate(LocalDateTime creationDate) {
            this.creationDate = creationDate;
            return this;
        }

        public JobDelayBuilder lastUpdate(LocalDateTime lastUpdate) {
            this.lastUpdate = lastUpdate;
            return this;
        }

        @Override
        public JobDelay build() {
            return new JobDelay(this);
        }
    }
}

package org.izumi.jmix.cascadepersist.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.UUID;

@JmixEntity
@Table(name = "JMCAPE_OUTER", indexes = {
        @Index(name = "IDX_OUTER_INNER_ID", columnList = "INNER_ID")
})
@Entity(name = "jmcape_Outer")
public class Outer {

    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @JoinColumn(name = "INNER_ID")
    @Composition
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private Inner inner;

    @Column(name = "SOMETHING")
    private String something;

    public String getSomething() {
        return something;
    }

    public void setSomething(String something) {
        this.something = something;
    }

    public Inner getInner() {
        return inner;
    }

    public void setInner(Inner inner) {
        this.inner = inner;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}

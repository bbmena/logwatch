package com.proserv.logwatch.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "lti")
public class Lti {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @ManyToMany(mappedBy = "ltiSet", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Watch> watches = new HashSet<>();

    public Lti() {
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Set<Watch> getWatches() {
        return watches;
    }
    public void setWatches(Set<Watch> watches) {
        this.watches = watches;
    }
}

package com.proserv.logwatch.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "watch")
public class Watch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String name;

    @Column
    private String watchText;

    @Column
    private String alertContactEmail;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "lti_watch", joinColumns = {@JoinColumn(name = "watch_id")}, inverseJoinColumns = {@JoinColumn(name = "lti_id")})
    private Set<Lti> ltiSet = new HashSet<>();

    public Watch() {

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

    public String getWatchText() {
        return watchText;
    }
    public void setWatchText(String watchText) {
        this.watchText = watchText;
    }

    public String getAlertContactEmail() {
        return alertContactEmail;
    }
    public void setAlertContactEmail(String alertContactEmail) {
        this.alertContactEmail = alertContactEmail;
    }

    public Set<Lti> getLtis() {
        return ltiSet;
    }
    public void setLtis(Set<Lti> ltis) {
        this.ltiSet = ltis;
    }
}

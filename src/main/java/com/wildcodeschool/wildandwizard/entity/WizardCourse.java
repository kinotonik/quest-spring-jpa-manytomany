package com.wildcodeschool.wildandwizard.entity;

import javax.persistence.*;

@Entity
@Table(name = "wizard_course")
public class WizardCourse {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "wizard_id")
    private Wizard wizard;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    public WizardCourse() {
    }

    public WizardCourse(Long id, Wizard wizard, Course course) {
        this.id = id;
        this.wizard = wizard;
        this.course = course;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Wizard getWizard() {
        return wizard;
    }

    public void setWizard(Wizard wizard) {
        this.wizard = wizard;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}

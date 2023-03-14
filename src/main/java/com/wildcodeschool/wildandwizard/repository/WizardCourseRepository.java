package com.wildcodeschool.wildandwizard.repository;

import com.wildcodeschool.wildandwizard.entity.WizardCourse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WizardCourseRepository extends JpaRepository<WizardCourse, Long> {
}

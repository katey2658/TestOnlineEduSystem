package com.katey2658.toes.service.impl;

import com.katey2658.toes.entity.Course;
import com.katey2658.toes.service.CourseServcie;

import java.util.Collection;

/**
 * Created by 11456 on 2016/11/22.
 */
public class CourseServiceImpl implements CourseServcie {
    @Override
    public Collection<Course> getCourseList(int page) {
        return null;
    }

    @Override
    public int addCourse(Course course) {
        return 0;
    }

    @Override
    public int deleteCourse(String courseId) {
        return 0;
    }

    @Override
    public int deleteCourses(Collection<Course> courses) {
        return 0;
    }

    @Override
    public int updateCourse(Course course) {
        return 0;
    }

    @Override
    public Course findCourseById(String courseId) {
        return null;
    }

    @Override
    public Collection<Course> findCourseByName() {
        return null;
    }

    @Override
    public Collection<String> getCourseHeader() {
        return null;
    }
}

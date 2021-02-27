package com.io.SBWebMVCStudRegApp.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl  implements StudentService{
    @Override
    public List<String> getGenders() {
        List<String> genders = new ArrayList<>();
        genders.add("Male");
        genders.add("fe-Male");
        return genders;
    }

    @Override
    public List<String> getCourses() {
        List<String> courses = new ArrayList<>();
        courses.add("Java");
        courses.add("Python");
        courses.add("DEVOPS");
        courses.add(".NET");
        return courses;
    }

    @Override
    public List<String> gettimings() {
        List<String> timings = new ArrayList<>();
        timings.add("Morning");
        timings.add("Afternoon");
        timings.add("Evening");
        return timings;
    }
}

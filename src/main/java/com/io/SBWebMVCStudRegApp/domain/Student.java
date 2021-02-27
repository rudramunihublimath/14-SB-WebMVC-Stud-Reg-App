package com.io.SBWebMVCStudRegApp.domain;

import lombok.Data;

@Data
public class Student {
    private String studentName;
    private String studentEmail;
    private String gender;
    private String course;
    private String[] timings;

}

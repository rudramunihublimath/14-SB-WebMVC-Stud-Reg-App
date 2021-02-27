package com.io.SBWebMVCStudRegApp.controller;

import com.io.SBWebMVCStudRegApp.domain.Student;
import com.io.SBWebMVCStudRegApp.service.StudentServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    private StudentServiceImpl service;

    public StudentController(StudentServiceImpl service) {
        this.service = service;
    }
    @ModelAttribute
    public  void loadFormData(Model model){
        System.out.println("## loadFormData() called ##");
        model.addAttribute("genders",service.getGenders());
        model.addAttribute("courses",service.getCourses());
        model.addAttribute("timings",service.gettimings());
    }


    @GetMapping("/studentReg")
    public String loadRegForm(Model model){
        model.addAttribute("student",new Student());



        return "regForm";
    }

    @PostMapping("/studentReg")
    public String saveRegData(Student student, Model model){
        System.out.println(student);
        if(student!=null)
            model.addAttribute("msg","Registered Successfully..");

        return "regForm";
    }
}

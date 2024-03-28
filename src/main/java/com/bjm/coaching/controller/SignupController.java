package com.bjm.coaching.controller;

import com.bjm.coaching.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignupController {
    @GetMapping("/signup")
    public String signup(Model model){
        //adding the attribute('student') in the model
        model.addAttribute("student",new Student());
        return "signup";
    }
    @PostMapping("/process-student-form")
    public String processStudentForm(@ModelAttribute("student")Student theStudent){

        //Reteriving/accesing the 'student' attribute from the model by using(@ModelAttribute) (if attribute is not found in the model then it will create that attribute first)
        // and then binding it theStudent object to use getter and setter method in java as below -->
        System.out.println("Student Name :"+theStudent.getFirstName()+" "+ theStudent.getLastName());
        System.out.println("Student Mob. num :"+theStudent.getMobileNumber());
        System.out.println("Student Date of Birth :"+theStudent.getDob());
        System.out.println("Student grade: "+theStudent.getGrade());
        System.out.println("Student Stream: "+theStudent.getStream());
        System.out.println("the Student school Name: "+theStudent.getSchoolName());
        System.out.println("the student email: "+theStudent.getEmail());
        System.out.println("the student password :"+theStudent.getPassword());
        return "signup-confirmation";
    }
}

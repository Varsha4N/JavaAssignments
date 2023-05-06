package com.targetindia.programs;

import com.targetindia.models.Person;
import com.targetindia.models.Staff;
import com.targetindia.models.Student;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PersonClassDemo {
    public static void main(String[] args) {
        Person[] people= {
                new Student("Keerthi","Hyderabad","Core Java",2016,1020),
                new Staff("Jyothi","Pune","Lab School",75000.0),
                new Staff("Sravani","Hyderabad","Narayana School",50000.0),
                new Student("Uday","Hyderabad","Fundamentals of Javascripts",2018,1200),
                new Student("Aaron","Pune","Core Java",2010,1020)

        };

        for (Person p: people) {
            log.trace("Details : {}",p.toString());

        }
    }
}

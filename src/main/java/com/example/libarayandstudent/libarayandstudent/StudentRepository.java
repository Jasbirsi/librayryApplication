package com.example.libarayandstudent.libarayandstudent;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository  extends JpaRepository<Student ,Integer> {
}

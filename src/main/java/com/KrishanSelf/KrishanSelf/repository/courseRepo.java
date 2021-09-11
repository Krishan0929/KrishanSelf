package com.KrishanSelf.KrishanSelf.repository;

import com.KrishanSelf.KrishanSelf.model.course;
import com.KrishanSelf.KrishanSelf.model.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface courseRepo extends JpaRepository<course,Integer>
{
    course findById(int id);
}

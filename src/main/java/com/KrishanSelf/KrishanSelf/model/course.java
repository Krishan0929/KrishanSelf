package com.KrishanSelf.KrishanSelf.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class course
{
    @Id
    @Column(name = "course_id")
    private int id;

    private String name;

    @ManyToMany
    @JsonIgnore
    @JoinTable(name = "student_course",
            joinColumns ={@JoinColumn(name = "course_id",referencedColumnName = "course_id") },
            inverseJoinColumns = {@JoinColumn(name = "student_id",referencedColumnName = "student_id")}
    )
    private List<student> students;


}

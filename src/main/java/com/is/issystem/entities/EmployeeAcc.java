package com.is.issystem.entities;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="employee_acc")
public class EmployeeAcc {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "code")
    private String code;
    @Column(name = "pass")
    private String pass;
    @Column(name = "status")
    private boolean status;

    @Column(name = "id_role")
    private Integer id_role;
}

package com.is.issystem.entities;
import javax.persistence.*;

@Entity
@Table(name="employee_acc")
public class EmployeeAcc {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "code")
    private String code;
    @Column(name = "pass")
    private String pass;
    @Column(name = "status")
    private boolean status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

package sprintOne.EmpManSys.Entities;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "userId")
    private int userId;
    private String password;
    private String role;
    private int result;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_userId",referencedColumnName = "userId")
    private Employee employee;


    public User() {
        super();
    }


    public User(int userId, String password, String role, int result, Employee employee) {
        this.userId = userId;
        this.password = password;
        this.role = role;
        this.result = result;
        this.employee = employee;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", result=" + result +
                ", employee=" + employee +
                '}';
    }
}

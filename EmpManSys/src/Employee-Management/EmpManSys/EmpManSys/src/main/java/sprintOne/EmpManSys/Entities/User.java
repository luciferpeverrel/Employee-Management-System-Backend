//package sprintOne.EmpManSys.Entities;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//@Entity
//public class User {
//    @Id
//    @GeneratedValue(strategy =  GenerationType.IDENTITY)
//    private int userId;
//    private String password;
//    private String role;
//    private int result;
//
//    public User() {
//        super();
//    }
//
//    public User(int userId, String password, String role, int result) {
//        super();
//        this.userId = userId;
//        this.password = password;
//        this.role = role;
//        this.result = result;
//    }
//
//    public int getUserId() {
//        return userId;
//    }
//
//    public void setUserId(int userId) {
//        this.userId = userId;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getRole() {
//        return role;
//    }
//
//    public void setRole(String role) {
//        this.role = role;
//    }
//
//    public int getResult() {
//        return result;
//    }
//
//    public void setResult(int result) {
//        this.result = result;
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "userId=" + userId +
//                ", password='" + password + '\'' +
//                ", role='" + role + '\'' +
//                ", result=" + result +
//                '}';
//    }
//}

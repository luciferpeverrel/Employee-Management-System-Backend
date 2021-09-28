package sprintOne.EmpManSys.Entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "status_report")
public class StatusReport {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "complianceId")
    private  int complianceId;
    private String comments;
    private String details;
    private LocalDate createDate;
    private int userId;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "department_depart_id")
    private Department department;


    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "compliance_complianceId",referencedColumnName = "complianceId")
    @JsonManagedReference
    private Compliance compliance;

    public StatusReport() {
        super();
    }

    public StatusReport(int complianceId, String comments, String details, LocalDate createDate, int userId, Department department, Compliance compliance) {
        this.complianceId = complianceId;
        this.comments = comments;
        this.details = details;
        this.createDate = createDate;
        this.userId = userId;
        this.department = department;
        this.compliance = compliance;
    }

    public int getComplianceId() {
        return complianceId;
    }

    public void setComplianceId(int complianceId) {
        this.complianceId = complianceId;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Compliance getCompliance() {
        return compliance;
    }

    public void setCompliance(Compliance compliance) {
        this.compliance = compliance;
    }

    @Override
    public String toString() {
        return "StatusReport{" +
                "complianceId=" + complianceId +
                ", comments='" + comments + '\'' +
                ", details='" + details + '\'' +
                ", createDate=" + createDate +
                ", userId=" + userId +
                ", department=" + department +
                ", compliance=" + compliance +
                '}';
    }
//
//    public StatusReport(int statusId, String comments, String details, LocalDate createDate, int userId, Department department, Compliance compliance) {
//        super();
//        this.statusId = statusId;
//        this.comments = comments;
//        this.details = details;
//        this.createDate = createDate;
//        this.userId = userId;
//        this.department = department;
//        this.compliance = compliance;
//    }
//
//
//    public Compliance getCompliance() {
//        return compliance;
//    }
//
//    public void setCompliance(Compliance compliance) {
//        this.compliance = compliance;
//    }
//
//    public int getStatusId() {
//        return statusId;
//    }
//
//    public void setStatusId(int statusId) {
//        this.statusId = statusId;
//    }
//
//    public String getComments() {
//        return comments;
//    }
//
//    public void setComments(String comments) {
//        this.comments = comments;
//    }
//
//    public String getDetails() {
//        return details;
//    }
//
//    public void setDetails(String details) {
//        this.details = details;
//    }
//
//    public LocalDate getCreateDate() {
//        return createDate;
//    }
//
//    public void setCreateDate(LocalDate createDate) {
//        this.createDate = createDate;
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
//
//    public Department getDepartment() {
//        return department;
//    }
//
//    public void setDepartment(Department department) {
//        this.department = department;
//    }
//
//    @Override
//    public String toString() {
//        return "StatusReport{" +
//                "statusId=" + statusId +
//                ", comments='" + comments + '\'' +
//                ", details='" + details + '\'' +
//                ", createDate=" + createDate +
//                ", userId=" + userId +
//                ", department=" + department +
//                ", compliance=" + compliance +
//                '}';
//    }
}

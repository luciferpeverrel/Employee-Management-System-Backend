package sprintOne.EmpManSys.Entities;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Compliance {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int complianceId;
    private String rlType;
    private String details;
    private LocalDate createDate;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "department_depart_id")
    private Department department;
    private int empCount;
    private int stsCount;
    private String status;

    public Compliance() {
        super();
    }

    public Compliance(int complianceId, String rlType, String details, LocalDate createDate, Department department, int empCount, int stsCount, String status) {
        super();
        this.complianceId = complianceId;
        this.rlType = rlType;
        this.details = details;
        this.createDate = createDate;
        this.department = department;
        this.empCount = empCount;
        this.stsCount = stsCount;
        this.status = status;
    }

    public int getComplianceId() {
        return complianceId;
    }

    public void setComplianceId(int complianceId) {
        this.complianceId = complianceId;
    }

    public String getRlType() {
        return rlType;
    }

    public void setRlType(String rlType) {
        this.rlType = rlType;
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public int getEmpCount() {
        return empCount;
    }

    public void setEmpCount(int empCount) {
        this.empCount = empCount;
    }

    public int getStsCount() {
        return stsCount;
    }

    public void setStsCount(int stsCount) {
        this.stsCount = stsCount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Compliance{" +
                "complianceId=" + complianceId +
                ", rlType='" + rlType + '\'' +
                ", details='" + details + '\'' +
                ", createDate=" + createDate +
                ", department=" + department +
                ", empCount=" + empCount +
                ", stsCount=" + stsCount +
                ", status='" + status + '\'' +
                '}';
    }
}

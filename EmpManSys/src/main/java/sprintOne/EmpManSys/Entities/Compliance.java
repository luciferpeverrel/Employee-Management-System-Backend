package sprintOne.EmpManSys.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "compliance")
public class Compliance {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "complianceId")
    private int complianceId;
    private String rlType;
    private String details;
    private LocalDate createDate;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "department_depart_id")
    private Department department;
    private int stsCount;
    private String status;

    @OneToOne(mappedBy = "compliance")
    @JsonBackReference
    private StatusReport statusReport;

    public Compliance() {
        super();
    }

    public Compliance(int complianceId, String rlType, String details, LocalDate createDate, Department department, int stsCount, String status, StatusReport statusReport) {
        this.complianceId = complianceId;
        this.rlType = rlType;
        this.details = details;
        this.createDate = createDate;
        this.department = department;
        this.stsCount = stsCount;
        this.status = status;
        this.statusReport = statusReport;
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

    public StatusReport getStatusReport() {
        return statusReport;
    }

    public void setStatusReport(StatusReport statusReport) {
        this.statusReport = statusReport;
    }

    @Override
    public String toString() {
        return "Compliance{" +
                "complianceId=" + complianceId +
                ", rlType='" + rlType + '\'' +
                ", details='" + details + '\'' +
                ", createDate=" + createDate +
                ", department=" + department +
                ", stsCount=" + stsCount +
                ", status='" + status + '\'' +
                ", statusReport=" + statusReport +
                '}';
    }
}

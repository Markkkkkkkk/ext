package pri.Mark.ext.model;

import java.util.Date;

public class Loan {
    private Integer loanId;

    private Integer loanType;

    private String loanAmount;

    private Date loanApplytime;

    public Integer getLoanId() {
        return loanId;
    }

    public void setLoanId(Integer loanId) {
        this.loanId = loanId;
    }

    public Integer getLoanType() {
        return loanType;
    }

    public void setLoanType(Integer loanType) {
        this.loanType = loanType;
    }

    public String getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(String loanAmount) {
        this.loanAmount = loanAmount == null ? null : loanAmount.trim();
    }

    public Date getLoanApplytime() {
        return loanApplytime;
    }

    public void setLoanApplytime(Date loanApplytime) {
        this.loanApplytime = loanApplytime;
    }
}
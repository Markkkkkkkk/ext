package pri.Mark.ext.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pri.Mark.ext.model.Loan;
import pri.Mark.ext.model.LoanExample;

public interface LoanMapper {
    int countByExample(LoanExample example);

    int deleteByExample(LoanExample example);

    int deleteByPrimaryKey(Integer loanId);

    int insert(Loan record);

    int insertSelective(Loan record);

    List<Loan> selectByExample(LoanExample example);

    Loan selectByPrimaryKey(Integer loanId);

    int updateByExampleSelective(@Param("record") Loan record, @Param("example") LoanExample example);

    int updateByExample(@Param("record") Loan record, @Param("example") LoanExample example);

    int updateByPrimaryKeySelective(Loan record);

    int updateByPrimaryKey(Loan record);
}
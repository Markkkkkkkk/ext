package pri.Mark.ext.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pri.Mark.ext.model.Loantype;
import pri.Mark.ext.model.LoantypeExample;

public interface LoantypeMapper {
    int countByExample(LoantypeExample example);

    int deleteByExample(LoantypeExample example);

    int deleteByPrimaryKey(Integer loantypeId);

    int insert(Loantype record);

    int insertSelective(Loantype record);

    List<Loantype> selectByExample(LoantypeExample example);

    Loantype selectByPrimaryKey(Integer loantypeId);

    int updateByExampleSelective(@Param("record") Loantype record, @Param("example") LoantypeExample example);

    int updateByExample(@Param("record") Loantype record, @Param("example") LoantypeExample example);

    int updateByPrimaryKeySelective(Loantype record);

    int updateByPrimaryKey(Loantype record);
}
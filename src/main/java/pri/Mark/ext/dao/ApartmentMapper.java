package pri.Mark.ext.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pri.Mark.ext.model.Apartment;
import pri.Mark.ext.model.ApartmentExample;

public interface ApartmentMapper {
    int countByExample(ApartmentExample example);

    int deleteByExample(ApartmentExample example);

    int deleteByPrimaryKey(Integer apartmentId);

    int insert(Apartment record);

    int insertSelective(Apartment record);

    List<Apartment> selectByExample(ApartmentExample example);

    Apartment selectByPrimaryKey(Integer apartmentId);

    int updateByExampleSelective(@Param("record") Apartment record, @Param("example") ApartmentExample example);

    int updateByExample(@Param("record") Apartment record, @Param("example") ApartmentExample example);

    int updateByPrimaryKeySelective(Apartment record);

    int updateByPrimaryKey(Apartment record);
}
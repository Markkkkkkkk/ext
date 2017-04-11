package pri.Mark.ext.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pri.Mark.ext.model.Address;
import pri.Mark.ext.model.AddressExample;
import pri.Mark.ext.model.AddressWithBLOBs;

public interface AddressMapper {
    int countByExample(AddressExample example);

    int deleteByExample(AddressExample example);

    int deleteByPrimaryKey(Integer addressId);

    int insert(AddressWithBLOBs record);

    int insertSelective(AddressWithBLOBs record);

    List<AddressWithBLOBs> selectByExampleWithBLOBs(AddressExample example);

    List<Address> selectByExample(AddressExample example);

    AddressWithBLOBs selectByPrimaryKey(Integer addressId);

    int updateByExampleSelective(@Param("record") AddressWithBLOBs record, @Param("example") AddressExample example);

    int updateByExampleWithBLOBs(@Param("record") AddressWithBLOBs record, @Param("example") AddressExample example);

    int updateByExample(@Param("record") Address record, @Param("example") AddressExample example);

    int updateByPrimaryKeySelective(AddressWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(AddressWithBLOBs record);

    int updateByPrimaryKey(Address record);
}
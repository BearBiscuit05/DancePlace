package cloud.bearbiscuit.DancePlace.dao;


import cloud.bearbiscuit.DancePlace.domain.Activity;
import cloud.bearbiscuit.DancePlace.domain.Connection;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface ConnectionDao {

    int insertConnection(Connection connection);


    List<Connection> selectConnections();

}

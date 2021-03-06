package com.colin.mapper;

import com.colin.bean.Jop;

import java.util.List;

public interface JopMapper {


    void addJop(Jop jop);

    Integer selectJopCount(Integer tId);

    List<Jop> selectAllJop(int begin, int pageCount,int tId);

    void deleteJop(int id);


    List<Jop> selectAllJopByTid(int id);

    void updateProcessNum(int i, int jId);

}

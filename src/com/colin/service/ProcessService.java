package com.colin.service;

import com.colin.bean.PM;
import com.colin.bean.Process;
import java.util.List;
import com.colin.bean.Process;
public interface ProcessService {


    void addProcess(Process process);

    Integer selectProcessCount(Integer jId);

    List<Process> selectAllProcesses(int begin, int pageCount, Integer jId);

    void deleteProcess(int id);

    List<Process> selectAllProcessesByJid(int id);

    void deleteProcessByJid(int jId);

    void updateProcessSE(Integer pId, int startTime, int endTime);

    void setMaterial(PM pm);

    void deletePm(int pmId);

    List<PM> selectPmByPId(Integer pro);

}

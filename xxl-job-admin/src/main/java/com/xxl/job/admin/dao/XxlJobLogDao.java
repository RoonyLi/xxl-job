package com.xxl.job.admin.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.xxl.job.admin.core.model.XxlJobLog;

/**
 * job log
 * 
 * @author xuxueli 2016-1-12 18:03:06
 */
@Mapper
public interface XxlJobLogDao {

    public List<XxlJobLog> pageList(@Param("start") int start, @Param("end") int end, @Param("jobGroup") int jobGroup,
            @Param("jobId") int jobId, @Param("triggerTimeStart") Date triggerTimeStart,
            @Param("triggerTimeEnd") Date triggerTimeEnd, @Param("logStatus") int logStatus);

    public int pageListCount(@Param("jobGroup") int jobGroup, @Param("jobId") int jobId,
            @Param("triggerTimeStart") Date triggerTimeStart, @Param("triggerTimeEnd") Date triggerTimeEnd,
            @Param("logStatus") int logStatus);

    public XxlJobLog load(@Param("id") int id);

    public int save(XxlJobLog xxlJobLog);

    public int updateTriggerInfo(XxlJobLog xxlJobLog);

    public int updateHandleInfo(XxlJobLog xxlJobLog);

    public int delete(@Param("jobId") int jobId);

    public int triggerCountByHandleCode(@Param("handleCode") int handleCode);

    public List<Map<String, Object>> triggerCountByDay(@Param("from") Date from, @Param("to") Date to);

    public int clearLog(@Param("jobGroup") int jobGroup, @Param("jobId") int jobId,
            @Param("clearBeforeTime") Date clearBeforeTime, @Param("clearBeforeNum") int clearBeforeNum);

}

package com.devfun.settingweb_boot.dao;

import java.util.HashMap;

public interface  StatisticMapper {
    public HashMap<String, Object> selectYearLogin(String year);
    public HashMap<String, Object> selectMonthLogin(String yearMonth);
    public HashMap<String, Object> selectDateLogin(String date);
   public HashMap<String, Object> selectAvgDateLogin(String yearMonth);
    public HashMap<String, Object> selectDeptMonthLogin(String yearMonth,String dept);
    public HashMap<String, Object> selectNonPhLogin(String yearMonth);

}
package com.devfun.settingweb_boot.service;

import java.util.HashMap;

public interface StatisticService {
	    public HashMap<String,Object> yearloginNum (String year);
	    public HashMap<String,Object> yearMonthloginNum (String yearMonth);
	    public HashMap<String,Object> dateloginNum (String date);

	    public HashMap<String,Object> DeptMonthloginNum (String yearMonth,String dpet);


}

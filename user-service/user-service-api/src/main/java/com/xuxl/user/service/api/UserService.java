package com.xuxl.user.service.api;

import java.util.Date;

import com.xuxl.common.annotation.dubbo.api.DubboMethod;
import com.xuxl.common.annotation.dubbo.api.DubboService;
import com.xuxl.common.annotation.http.api.ApiGroup;
import com.xuxl.common.annotation.http.api.ApiParameter;
import com.xuxl.common.annotation.http.api.HttpApi;
import com.xuxl.user.service.domain.User;

@DubboService(version = "1.0.0")
@ApiGroup(name = "user",owner = "xuxl")
public interface UserService {
	
	/**
	 * 基本数据类型测试
	 * @param age
	 * @return
	 */
	@HttpApi(desc = "根据年龄获得用户", name = "age", method = "get")
	@DubboMethod(retries = 2,timeOut = 2000)
	User getUserByAge(@ApiParameter(desc = "年龄", name = "age", required = true) int age);
	
	/**
	 * String类型测试
	 * @param name
	 * @return
	 */
	@HttpApi(desc = "根据名字获得用户", name = "name", method = "get")
	@DubboMethod(retries = 2,timeOut = 1000)
	User getUserByName(@ApiParameter(desc = "名字", name = "name", required = true) String name);
	
	/**
	 * 日期类型测试，前端可以给数字
	 * @param date
	 * @return
	 */
	@HttpApi(desc = "根据生日获得用户", name = "birthday", method = "get")
	@DubboMethod(retries = 0,timeOut = 2000)
	User getUserByBirthday(@ApiParameter(desc = "生日", name = "birthday", required = true) Date date);

}

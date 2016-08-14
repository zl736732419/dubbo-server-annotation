package com.zheng.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zheng.service.AnnotationService;

/**
 * 注解实现
 * @author zhenglian
 *
 */
@Service(version="0.0.1")
public class AnnotationServiceImpl implements AnnotationService {

	@Override
	public String say(String str) {
		return "hi " + str;
	}

}

package com.shop.myapp;

import com.shop.myapp.dao.DeveloperMapper;
import com.shop.myapp.dto.DeveloperDTO;
import com.shop.myapp.service.DeveloperService;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@MapperScan({"com.shop.myapp.mapper"})
class MyappApplicationTests {
	@Autowired
	DeveloperService developerService;
	@Test
	void test() {
		DeveloperDTO developerDTO = new DeveloperDTO();
		boolean res = developerService.removeById(19l);
		System.out.println(res);

	}

}

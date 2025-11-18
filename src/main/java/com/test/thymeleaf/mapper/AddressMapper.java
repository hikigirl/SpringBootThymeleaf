package com.test.thymeleaf.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.test.thymeleaf.dto.AddressDTO;

//Mapper 어노테이션은 패키지 스캔과 동일한 역할
@Mapper
public interface AddressMapper {

	AddressDTO get(int i);

	

}

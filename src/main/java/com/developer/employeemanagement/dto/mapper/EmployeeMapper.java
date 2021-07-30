package com.developer.employeemanagement.dto.mapper;

import com.developer.employeemanagement.dto.request.EmployeeRequest;
import com.developer.employeemanagement.dto.response.EmployeeResponse;
import com.developer.employeemanagement.entity.EmployeeEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapper {
    EmployeeMapper MAPPER = Mappers.getMapper(EmployeeMapper.class);
    EmployeeEntity fromRequestToEntity(EmployeeRequest employeeRequest);
    EmployeeResponse fromEntityToResponse(EmployeeEntity employeeEntity);
}

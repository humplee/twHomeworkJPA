package com.example.employee.repository;


import com.example.employee.entity.Company;
import com.example.employee.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    //以下所有的*都代表变量

    //1.查询名字是*的第一个employee
    //List<Employee> findByEmployeeName
    //List<Employee>
    @Query("select e from Employee e where e.name = ?1")
    Employee getFirstName(String name);
    //2.找出Employee表中第一个姓名包含`*`字符并且薪资大于*的雇员个人信息
    @Query("select e from Employee e where e.name LIKE '%name%' ")
    Employee getSomeName(@Param("name") String name);

    //3.找出一个薪资最高且公司ID是*的雇员以及该雇员的姓名
    @Query("select e from Employee e where e.name = ?2 and companyId = ?1")
    Employee getFirstSalary(int companyId, String name);

    //4.实现对Employee的分页查询，每页两个数据
    //@Query("select e from Employee e limit 0,2")
    Page<Employee> findAll(Pageable pageable);

    //5.查找**的所在的公司的公司名称
    @Query("select c from Company c,Employee e where e.name = ?1 and e.companyId = c.id")
    Company getCompanyName(String name);

    //6.将*的名字改成*,输出这次修改影响的行数
    @Modifying
    @Query("UPDATE Employee SET name=?2 WHERE name=?1")
    int getAffectedLines(String nameOriginal,String nameNew);

    //7.删除姓名是*的employee
    @Modifying
    @Query("DELETE from Employee WHERE name=?1")
    void deleteSomeEmployee(String name);
}

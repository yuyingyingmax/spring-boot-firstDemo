package com.learning.demo.repository;

import com.learning.demo.domain.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/*
设计了实体之后，我们只要为这个实体创建一个存储库接口，就可以实现实体的持久化。
这个接口继承了JPA的存储库JpaRepository，并使用实体Country作为初始化对象

 */
@Repository
public interface CountryRepository extends JpaRepository<Country,Long> {
}

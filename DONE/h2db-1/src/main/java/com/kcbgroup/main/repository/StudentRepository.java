package com.kcbgroup.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kcbgroup.main.model.Student; 
@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>   {


}

//public interface TransactionsIncomingRepository  extends JpaRepository<IpslCreditsIncoming, BigDecimal>{

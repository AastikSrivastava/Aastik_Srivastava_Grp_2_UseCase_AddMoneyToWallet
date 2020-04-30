package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.model.CardDetails;

@Repository
public interface CardDetailsDao  extends JpaRepository<CardDetails, Integer>

{
	
	
	
//	@Query(value="update carddetails set amountremain =: amountremain where cardno = :cardno",nativeQuery = true)
//	double updateBalanceInCard(@Param("cardNo") int cardNo , @Param("amountremain") double amountremain);

}

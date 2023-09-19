package com.engineersmind.s3.repository;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.engineersmind.s3.model.EventChat;

@Repository
public interface EventChatRepository extends JpaRepository<EventChat, Integer> {

    @Query(value = "SELECT * FROM dbo.EventChat e WHERE CAST(e.LastDateUpdated_UTC AS DATE) = CAST(?1 AS DATE)", nativeQuery = true)
    List<EventChat> findByLastDateUpdated_UTC(Timestamp LastDateUpdated_UTC);
}

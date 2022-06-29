package edu.miu.bank.repositories;

import edu.miu.bank.domain.TraceRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public interface TraceRecordRepository extends JpaRepository<TraceRecord, Long> {
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    default void SaveTraceRecord(TraceRecord traceRecord){
        save(traceRecord);
    }
}

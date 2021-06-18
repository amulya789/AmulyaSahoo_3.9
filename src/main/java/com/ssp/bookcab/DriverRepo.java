package com.ssp.bookcab;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface DriverRepo extends CrudRepository<DriverInfo, Integer> {
	
	 @Query(value = "SELECT   max(id) id, max(ideal_time) as ideal_time   FROM radms.cab_driver_info", nativeQuery = true)
	List<DriverInfo> getDriverInfos();

}

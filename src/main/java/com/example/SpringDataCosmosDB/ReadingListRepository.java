package com.example.SpringDataCosmosDB;

import java.util.List;

import com.azure.spring.data.cosmos.repository.CosmosRepository;
import com.azure.spring.data.cosmos.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ReadingListRepository extends CosmosRepository<Book, String> {
	//@Query(value = "select * from c")
	public List<Book> findByReader(String reader);
	

}

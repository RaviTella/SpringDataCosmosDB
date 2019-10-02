package com.example.SpringDataCosmosDB;

import java.util.List;

import com.microsoft.azure.spring.data.cosmosdb.repository.CosmosRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReadingListRepository extends CosmosRepository<Book, String> {

	public List<Book> findByReader(String reader);
	

}

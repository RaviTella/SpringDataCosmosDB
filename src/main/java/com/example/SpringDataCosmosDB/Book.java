package com.example.SpringDataCosmosDB;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;

import java.time.OffsetDateTime;
import java.util.Date;

@Container(containerName = "ReadingList")
public class Book {


    private String id;
    @PartitionKey
    private String reader;
    private String isbn;
    private String title;
    private String author;
    private String description;
    @CreatedDate
    private Date createdDate;
    @LastModifiedDate
    private Date lastModifiedByDate;
    @Version
    String _etag;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReader() {
        return reader;
    }

    public void setReader(String reader) {
        this.reader = reader;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getLastModifiedByDate() {
        return lastModifiedByDate;
    }

    public void setLastModifiedByDate(Date lastModifiedByDate) {
        this.lastModifiedByDate = lastModifiedByDate;
    }

    public String get_etag() {
        return _etag;
    }

    public void set_etag(String _etag) {
        this._etag = _etag;
    }

    @Override
    public String toString() {
        String value = "Book ID:" + this
                .getId()
                .toString() + ", " + "Book Title:" + this.getTitle();

        return value;
    }


}

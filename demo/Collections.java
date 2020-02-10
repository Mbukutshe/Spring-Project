package com.example.demo;

import com.mongodb.client.MongoCollection;
import org.bson.Document;

public class Collections{
    private static MongoCollection<Document> document;
    private static databaseConnection con;

    public Collections(String collection)
    {
        con = new databaseConnection();
        document = con.returnCollection().getCollection(collection);
    }
    public MongoCollection<Document> getTable()
    {
        return document;
    }
}
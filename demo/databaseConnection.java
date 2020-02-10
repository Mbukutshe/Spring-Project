package com.example.demo;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

public class databaseConnection{
    private static MongoClient mongoClient;
    private static MongoClientURI uri;
    private static MongoDatabase database;
    

    public databaseConnection()
    {
        uri = new MongoClientURI("mongodb://wiseman:<Khanyisa18>@cluster0-8x72w.mongodb.net/test?retryWrites=true&w=majority");
        mongoClient = new MongoClient(uri);
        database = mongoClient.getDatabase("Voting");
    }

    public MongoDatabase returnCollection()
    {
        return database;
    }

}
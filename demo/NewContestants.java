package com.example.demo;

import org.bson.Document;

public class NewContestants{
    public Document record;

    public NewContestants(String columnName, int value)
    {
        record = new Document("name", columnName).append("results",value);
    }

    public Document returnRecord()
    {
        return record;
    }
}
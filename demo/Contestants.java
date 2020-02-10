
package com.example.demo;

public class Contestants
{
    public String id;
    public String contestant;
    public int results;

    public Contestants(){}

    public Contestants(String id, String contestant, int results)
    {
        this.contestant = contestant;
        this.id = id;
        this.results = results;
    }

    public int getResults()
    {
        return results;
    }
    public String getId()
    {
        return id;
    }
    public String getContestant()
    {
        return contestant;
    } 
}
package com.mitrais;

import java.util.ArrayList;
import java.util.List;

public class Transaction
{
    private List<HistoryData> transactionHistoryList;

    // constructor
    public Transaction()
    {
        transactionHistoryList = new ArrayList<HistoryData>(){};
    }

    // send point write to history
    public void SendPoint(Users userSender, Users userReceiver, int point, int day, int month, int year)
    {
        userSender.reducePoint(point);
        userReceiver.addPoint(point);

        HistoryData history = new HistoryData();
        history.date = String.valueOf(day) + "/" + String.valueOf(month) + "/" + String.valueOf(year);
        history.userSender = userSender.getName();
        history.userReceiver = userReceiver.getName();
        history.point = point;

        // add history
        transactionHistoryList.add(history);
    }

    // print the history
    public void PrintHistory()
    {
        for (HistoryData data : transactionHistoryList)
        {
            System.out.println("\nDate: " + data.date);
            System.out.println(data.userSender + " -> " + data.userReceiver + " : " + data.point + "P");
        }
    }
}
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
    public void SendPoint(String userSenderID, String userReceiverID, int point, int day, int month, int year)
    {
        HistoryData history = new HistoryData();
        history.date = String.valueOf(day) + "/" + String.valueOf(month) + "/" + String.valueOf(year);
        history.userSender = userSenderID;
        history.userReceiver = userReceiverID;
        history.point = point;
    }

    // print the history
    public void PrintHistory()
    {
        for (HistoryData data : transactionHistoryList)
        {
            System.out.println("Date: " + data.date);
            System.out.println(data.userSender + " -> " + data.userReceiver + " : " + data.point + "P");
        }
    }
}
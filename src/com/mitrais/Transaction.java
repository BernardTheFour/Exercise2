package com.mitrais;

import java.util.ArrayList;
import java.util.List;

public class Transaction {

    private List<TransactionHistory> transactionHistoryList;

    public Transaction()
    {
        transactionHistoryList = new ArrayList<TransactionHistory>(){};
    }

    public void SendPoint(String userSenderID, String userReceiverID, int point, int day, int month, int year)
    {
        TransactionHistory history = new TransactionHistory();
        history.date = String.valueOf(day) + "/" + String.valueOf(month) + "/" + String.valueOf(year);
        history.userSenderID = userSenderID;
        history.userReceiverID = userReceiverID;
        history.point = point;
    }
}

package com.example.crackaddictedunicorn88.exceedrefact;
import org.ethereum.geth.*;

// GethNodeHolder.java
public class GethNodeHolder {

    private Node node;
    private Account account;
    private static GethNodeHolder instance = null;

    private GethNodeHolder() {
    }

    public static GethNodeHolder getInstance() {
        if (instance == null) {
            instance = new GethNodeHolder();
        }
        return instance;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

}
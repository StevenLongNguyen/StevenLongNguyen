/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fptuni.csd201.lib;
import com.fptuni.csd201.ds.Stack;
/**
 *
 * @author DUNGHUYNH
 */
public class ArrayStack implements Stack{

    Node head;
    

    @Override
    public boolean isEmpty() {

        return head == null;
    }

    @Override
    public void clear() {
        head = null;
    }

    @Override
    public void push(int x) {
        Node p = new Node(x);
        if (isEmpty()) {
            head = p;
        } else {
            p.next = head;
            head = p;
        }
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            return 0;
        }
        int info = head.info;
        head = head.next;
        return info;
    }

    @Override
    public int top() {
        if (isEmpty()) {
            return 0;
        }
        int info = head.info;
        return info;
    }
    

    @Override
    public void traverse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}


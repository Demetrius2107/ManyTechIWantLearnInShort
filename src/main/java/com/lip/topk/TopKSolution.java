package com.lip.topk;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * @author: Elon
 * @title: TopKSolution
 * @projectName: ScannerPractice
 * @description: TODO
 * @date: 2025/3/13 15:42
 */
public class TopKSolution {


    public static void main(String[] args) {

    }

    

    
    
    /**
     * 获取topK
     * @param heap
     */
    public void printHeap(PriorityQueue<Integer> heap){
        Iterator<Integer> iterator = heap.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

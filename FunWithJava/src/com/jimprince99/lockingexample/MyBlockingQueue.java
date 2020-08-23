package com.jimprince99.lockingexample;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyBlockingQueue<T> {
	private Queue<T> queue = new LinkedList<>();
	private int maxSize = 0;
	ReentrantLock lock = new ReentrantLock(true);
	private Condition notFull = lock.newCondition();
	private Condition notEmpty = lock.newCondition();

	MyBlockingQueue(int maxSize) {
		this.maxSize = maxSize;
	}

	public int size() {
		return queue.size();
	}

	public boolean add(T item) {
		// if (queue.size() >= maxSize) return false;
		lock.lock();
		try {
			if (queue.size() >= maxSize)
				try {
					notFull.await();
				} catch (InterruptedException e) {
				}

			boolean result = queue.add(item);
			System.out.println("add");
			notEmpty.signal();
			return result;

		} finally {
			lock.unlock();
		}
	}

	public T remove() {
		lock.lock();
		try {
			if (queue.size() == 0) {
				try {
					notEmpty.await();
				} catch (InterruptedException e) {
				}
			}
			notFull.signal();
			System.out.println("remove");
			return queue.remove();
		} finally {
			lock.unlock();
		}

	}
}

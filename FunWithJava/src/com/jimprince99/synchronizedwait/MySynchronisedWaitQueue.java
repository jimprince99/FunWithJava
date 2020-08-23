package com.jimprince99.synchronizedwait;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class MySynchronisedWaitQueue<T> {
	private Queue<T> queue = new LinkedList<>();
	private int maxSize = 0;
	private Object notFull = new Object();
	private Object notEmpty = new Object();

	MySynchronisedWaitQueue(int size) {
		this.maxSize = size;
	}

	public int size() {
		return queue.size();
	}

	/**
	 * add an item to the queue thread safe
	 * 
	 * @param item the item to add
	 */
	public void put(T item) {
		synchronized (notFull) {

			boolean success = false;
			while (success == false) {
				if (queue.size() >= maxSize) {
					try {
						notFull.wait();

					} catch (InterruptedException e) {
					}
				}

				try {
					success = true;
					System.out.println(("add"));
					queue.add(item);
				} catch (IllegalStateException e) {
					success = false;
				}
			}
		}

		synchronized (notEmpty) {
			notEmpty.notify();
		}
	}

	/**
	 * remove an item thread safe
	 * 
	 * @return
	 */
	public T remove() {
		T item = null;

		synchronized (notEmpty) {
			while (item == null) {
				if (queue.size() == 0)
					try {
						notEmpty.wait();

					} catch (InterruptedException e) {
					}
				try {
					item = queue.remove();
				} catch (NoSuchElementException e) {
				}
				;
			}

		}

		synchronized (notFull) {
			notFull.notify();
		}
		return item;
	}

}

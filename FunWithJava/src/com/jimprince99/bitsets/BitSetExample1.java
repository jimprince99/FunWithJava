package com.jimprince99.bitsets;

import java.util.BitSet;

public class BitSetExample1 {

	public static void main(String[] args) {
		BitSet bs1 = new BitSet();
		BitSet bs2 = new BitSet(8);
		BitSet bs3;
		
		bs1.set(1);
		bs1.set(2);
		
		System.out.println("bs1=" + bs1);
		System.out.println("bs2=" + bs2);
		
		bs3 = (BitSet) bs1.clone();
		System.out.println("bs3=" + bs3);
		
		System.out.println("bs1 cardinality=" + bs1.cardinality());
		bs1.xor(new BitSet(0));
		System.out.println("bs1 xor=" + bs1);
		System.out.println("bs1 length=" + bs1.length());

		if (bs1.get(1)) {
			System.out.println("bit it set");
		}
	}

}

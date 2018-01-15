package com.generics;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class BeforeGenerics {

	public static void main(String args[]) {

		List ints = Arrays.asList(new Integer[] { new Integer(1), new Integer(2), new Integer(3) });
		int sum = 0;

		for (Iterator it = ints.iterator(); it.hasNext();) {

			int n = ((Integer) it.next()).intValue();
			sum += n;
		}
        assert sum ==6;
        System.out.println("The sum of 3 no's :"+sum);
	}

}

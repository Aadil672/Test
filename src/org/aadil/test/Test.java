package org.aadil.test;

import java.util.ArrayList;  
import java.util.List;
import java.util.stream.*;
import java.util.stream.Collectors; 

public class Test {

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<Integer>();
        List<Integer> b = new ArrayList<Integer>();
        List<Integer> result= new ArrayList<Integer>();

        a.add(3);
        a.add(5);
        a.add(1);
        a.add(6);

        b.add(1);
        b.add(2);
        b.add(6);
        b.add(1);
        
 result = IntStream.range(0, a.size()).mapToObj(i -> a.get(i) + b.get(i)).collect(Collectors.toList());

System.out.println("result of addition of two equal list:"+result);
    }

}
/*import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

import org.apache.fineract.portfolio.servicecharge.data.ServiceChargeLoanProductSummary;

class Test{  
	public List<BigDecimal> getMonthWiseOutstandingAmount(boolean isDemandLoan) {
		List<BigDecimal> result = new LinkedList<>();
		BigDecimal monthOne, monthTwo, monthThree;
		monthOne = monthTwo = monthThree = BigDecimal.ZERO;
		for (Long identifier : loanSummaryObjectMap.keySet()) {
			ServiceChargeLoanProductSummary summaryObj = loanSummaryObjectMap.get(identifier);
			if (summaryObj.isDemandLaon() ^ isDemandLoan) {
				List<BigDecimal> outstanding = summaryObj.getPeriodicOutstanding();
				int size = outstanding.size();
				if (size > 0) {
					monthOne = monthOne.add(outstanding.get(0));
					if (size > 1) {
						monthTwo = monthTwo.add(outstanding.get(1));
						if (size > 2) {
							monthThree = monthThree.add(outstanding.get(2));
						}
					}
				}
			}
		}
		result.add(monthOne);
		result.add(monthTwo);
		result.add(monthThree);
		return result;
	}*/

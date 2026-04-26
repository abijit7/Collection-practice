/*
Two lists of account IDs —
one is registered customers,
 one is premium. Find:
 (a) customers who are premium,
 (b) customers who are not premium,
 (c) all unique IDs. Use HashMap/HashSet.*/
package hashMapp;

import java.util.HashSet;

public class Qn2 {
    static void main() {
        HashSet<Integer> customer = new HashSet<>();
        customer.add(1);
        customer.add(2);
        customer.add(3);
        customer.add(4);
        customer.add(5);
        System.out.println("list of cutomers");
        for (Integer num : customer) {
            System.out.print(num + " ");
        }
        HashSet<Integer> premium = new HashSet<>();
        premium.add(3);
        premium.add(4);
        premium.add(5);
        HashSet<Integer> premiumCustomer = new HashSet<>(customer);
        premiumCustomer.retainAll(premium);

        HashSet<Integer> nonPremiumCustomer = new HashSet<>(customer);
        nonPremiumCustomer.removeAll(premium);
        HashSet<Integer> uniqueIDs = new HashSet<>(customer);
        uniqueIDs.addAll(premium);
        System.out.println("registered customers  " + customer);
        System.out.println("customers who are premium  " + premiumCustomer);
        System.out.println("customers who are not premium  " + nonPremiumCustomer);
        System.out.println("all unique IDs  " + uniqueIDs);

    }
}


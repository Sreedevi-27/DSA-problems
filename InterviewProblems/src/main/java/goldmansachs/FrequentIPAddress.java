/*
Given a list of logs with IP addresses in the following format.
lines = ["10.0.0.1 - GET 2020-08-24", "10.0.0.1 - GET 2020-08-24", "10.0.0.2 - GET 2020-08-20",
"10.0.0.1 - GET 2020-08-24", "10.0.0.1 - GET 2020-08-24", "10.0.0.2 - GET 2020-08-20",
"10.0.0.2 - GET 2020-08-24", "10.0.0.1 - GET 2020-08-24", "10.0.0.2 - GET 2020-08-20",
"10.0.0.2 - GET 2020-08-24", "10.0.0.1 - GET 2020-08-24", "10.0.0.2 - GET 2020-08-20",
"10.0.0.3 - GET 2020-08-24", "10.0.0.1 - GET 2020-08-24", "10.0.0.2 - GET 2020-08-20"]

Return the most frequent IP address from the logs. The retuned IP address value must be in a string format.
If multiple IP addresses have the count equal to max count, then return the address as a comma-separated string with IP addresses in sorted order.
 */

package goldmansachs;

import java.util.Map;
import java.util.TreeMap;

public class FrequentIPAddress {
    public static void main(String[] args) {
        String[] lines = new String[]{
                "10.0.0.1 - GET 2020-08-24", "10.0.0.1 - GET 2020-08-24", "10.0.0.2 - GET 2020-08-20",
                "10.0.0.1 - GET 2020-08-24", "10.0.0.1 - GET 2020-08-24", "10.0.0.2 - GET 2020-08-20",
                "10.0.0.2 - GET 2020-08-24", "10.0.0.1 - GET 2020-08-24", "10.0.0.2 - GET 2020-08-20",
                "10.0.0.2 - GET 2020-08-24", "10.0.0.1 - GET 2020-08-24", "10.0.0.2 - GET 2020-08-20",
                "10.0.0.3 - GET 2020-08-24", "10.0.0.1 - GET 2020-08-24", "10.0.0.2 - GET 2020-08-20"
        };
        System.out.println(findFrequentIP(lines));
    }

    public static String findFrequentIP(String[] lines){
        Map<String, Integer> frequencyOfIPs = new TreeMap<>();
        for(String line : lines){
            String ip = line.split(" ")[0];
            frequencyOfIPs.put(ip, frequencyOfIPs.getOrDefault(ip, 0)+1);
        }

        int highFrequency = 0;
        String frequentIP = "";
        for(Map.Entry<String, Integer> entry : frequencyOfIPs.entrySet()){
            String ip = entry.getKey();
            int frequency = entry.getValue();
            if(highFrequency==frequency)  frequentIP += " , "+ip;
            if(highFrequency<frequency){
                frequentIP = ip;
                highFrequency = frequency;
            }
        }
        return frequentIP;
    }
}

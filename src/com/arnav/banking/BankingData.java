package com.arnav.banking;

import java.util.ArrayList;
import java.util.HashMap;

public class BankingData
{
    public ArrayList<HashMap<String, String>> getData()
    {
        ArrayList<HashMap<String, String>> members = new ArrayList();
        HashMap<String, String> member = null;

        member = new HashMap();
        member.put("Username", "mem1");
        member.put("Password", "pwd");
        member.put("Money", "100000");
        member.put("Name", "Member 1");
        members.add(member);

        member = new HashMap();
        member.put("Username", "mem2");
        member.put("Password", "pwd");
        member.put("Money", "10000");
        member.put("Name", "Member 2");
        members.add(member);

        member = new HashMap();
        member.put("Username", "mem3");
        member.put("Password", "pwd");
        member.put("Money", "10000");
        member.put("Name", "Member 3");
        members.add(member);

        member = new HashMap();
        member.put("Username", "mem4");
        member.put("Password", "pwd");
        member.put("Money", "100000000000");
        member.put("Name", "Member 4");
        members.add(member);

        member = new HashMap();
        member.put("Username", "mem5");
        member.put("Password", "pwd");
        member.put("Money", "1");
        member.put("Name", "Member 5");
        members.add(member);

        return members;
    }
}

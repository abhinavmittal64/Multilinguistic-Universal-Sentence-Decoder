package com.mittal.mytest.Model;

import com.mittal.mytest.ScriptPython;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MultilinguisticUniversalSentenceDecoder {
    List<String> sentenceList = new LinkedList<>();
//    public String getScore(List<String> l){
//        return "0.8";
//    }
    public String getScore(String l){
        return "0.8";
    }

    public void runScript() {
        ScriptPython scriptPython = new ScriptPython();
        scriptPython.runScript();
    }
}

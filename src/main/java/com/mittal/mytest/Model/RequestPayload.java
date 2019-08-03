package com.mittal.mytest.Model;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class RequestPayload {
    @JsonProperty("sentences")
    private List<String> sentences;

    public RequestPayload() {
    }

    public RequestPayload(List sentences) {
        this.sentences = sentences;
    }

    public List<String> getSentences() {
        return sentences;
    }

    public void setSentences(List<String> sentences) {
        this.sentences = sentences;
    }
}

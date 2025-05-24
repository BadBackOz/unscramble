package com.ohz.unscramble.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class UnscrambledWordsResponse {
    String message;
    List<String> oneLetterWords = new ArrayList<>();
    List<String> twoLetterWords = new ArrayList<>();
    List<String> threeLetterWords = new ArrayList<>();
    List<String> fourLetterWords = new ArrayList<>();
    List<String> fiveLetterWords = new ArrayList<>();
    List<String> sixLetterWords = new ArrayList<>();
    List<String> sevenLetterWords = new ArrayList<>();
    List<String> eightLetterWords = new ArrayList<>();
    List<String> nineLetterWords = new ArrayList<>();
    List<String> tenLetterWords = new ArrayList<>();
    List<String> elevenLetterWords = new ArrayList<>();
    List<String> twelveLetterWords = new ArrayList<>();
    List<String> thirteenLetterWords = new ArrayList<>();
    List<String> fourteenLetterWords = new ArrayList<>();
    List<String> fifteenLetterWords = new ArrayList<>();

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<String> getOneLetterWords() {
        return oneLetterWords;
    }

    public void setOneLetterWords(List<String> oneLetterWords) {
        this.oneLetterWords = oneLetterWords;
    }

    public List<String> getTwoLetterWords() {
        return twoLetterWords;
    }

    public void setTwoLetterWords(List<String> twoLetterWords) {
        this.twoLetterWords = twoLetterWords;
    }

    public List<String> getThreeLetterWords() {
        return threeLetterWords;
    }

    public void setThreeLetterWords(List<String> threeLetterWords) {
        this.threeLetterWords = threeLetterWords;
    }

    public List<String> getFourLetterWords() {
        return fourLetterWords;
    }

    public void setFourLetterWords(List<String> fourLetterWords) {
        this.fourLetterWords = fourLetterWords;
    }

    public List<String> getFiveLetterWords() {
        return fiveLetterWords;
    }

    public void setFiveLetterWords(List<String> fiveLetterWords) {
        this.fiveLetterWords = fiveLetterWords;
    }

    public List<String> getSixLetterWords() {
        return sixLetterWords;
    }

    public void setSixLetterWords(List<String> sixLetterWords) {
        this.sixLetterWords = sixLetterWords;
    }

    public List<String> getSevenLetterWords() {
        return sevenLetterWords;
    }

    public void setSevenLetterWords(List<String> sevenLetterWords) {
        this.sevenLetterWords = sevenLetterWords;
    }

    public List<String> getEightLetterWords() {
        return eightLetterWords;
    }

    public void setEightLetterWords(List<String> eightLetterWords) {
        this.eightLetterWords = eightLetterWords;
    }

    public List<String> getNineLetterWords() {
        return nineLetterWords;
    }

    public void setNineLetterWords(List<String> nineLetterWords) {
        this.nineLetterWords = nineLetterWords;
    }

    public List<String> getTenLetterWords() {
        return tenLetterWords;
    }

    public void setTenLetterWords(List<String> tenLetterWords) {
        this.tenLetterWords = tenLetterWords;
    }

    public List<String> getElevenLetterWords() {
        return elevenLetterWords;
    }

    public void setElevenLetterWords(List<String> elevenLetterWords) {
        this.elevenLetterWords = elevenLetterWords;
    }

    public List<String> getTwelveLetterWords() {
        return twelveLetterWords;
    }

    public void setTwelveLetterWords(List<String> twelveLetterWords) {
        this.twelveLetterWords = twelveLetterWords;
    }

    public List<String> getThirteenLetterWords() {
        return thirteenLetterWords;
    }

    public void setThirteenLetterWords(List<String> thirteenLetterWords) {
        this.thirteenLetterWords = thirteenLetterWords;
    }

    public List<String> getFourteenLetterWords() {
        return fourteenLetterWords;
    }

    public void setFourteenLetterWords(List<String> fourteenLetterWords) {
        this.fourteenLetterWords = fourteenLetterWords;
    }

    public List<String> getFifteenLetterWords() {
        return fifteenLetterWords;
    }

    public void setFifteenLetterWords(List<String> fifteenLetterWords) {
        this.fifteenLetterWords = fifteenLetterWords;
    }
}

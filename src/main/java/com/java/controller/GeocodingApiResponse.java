package com.java.controller;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;

import java.util.List;

@Getter
public class GeocodingApiResponse {
    @JsonProperty("result")
    private Result result;
    
    @Getter
    public static class Result {
        @JsonProperty("addressMatches")
        private List<AddressMatch> addressMatches;
    }
    
    @Getter
    public static class AddressMatch {
        @JsonProperty("geographies")
        private Geographies geographies;
    }
    
    @Getter
    public static class Geographies {
        @JsonProperty("Census Blocks")
        private List<CensusBlock> censusBlocks;
    }
    
    @Getter
    public static class CensusBlock {
        @JsonProperty("BLOCK")
        private String block;
        
        @JsonProperty("TRACT")
        private String tract;
        
        @JsonProperty("STATE")
        private String state;
        
        @JsonProperty("COUNTY")
        private String county;
    }
    
}

package com.java.controller;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ApiResponse {
    @JsonProperty("result")
    private Result result;

    public Result getResult() {
        return result;
    }

    public static class Result {
        @JsonProperty("addressMatches")
        private List<AddressMatch> addressMatches;

        public List<AddressMatch> getAddressMatches() {
            return addressMatches;
        }
    }

    public static class AddressMatch {
        @JsonProperty("geographies")
        private Geographies geographies;

        public Geographies getGeographies() {
            return geographies;
        }
    }

    public static class Geographies {
        @JsonProperty("States")
        private List<State> states;

        @JsonProperty("Counties")
        private List<County> counties;

        @JsonProperty("Census Blocks")
        private List<CensusBlock> censusBlocks;

        @JsonProperty("Census Tracts")
        private List<CensusTract> censusTracts;

        public List<State> getStates() {
            return states;
        }

        public List<County> getCounties() {
            return counties;
        }

        public List<CensusBlock> getCensusBlocks() {
            return censusBlocks;
        }

        public List<CensusTract> getCensusTracts() {
            return censusTracts;
        }
    }

    public static class State {
        @JsonProperty("STUSAB")
        private String stateAbbreviation;

        public String getStateAbbreviation() {
            return stateAbbreviation;
        }
    }

    public static class County {
        @JsonProperty("COUNTY")
        private String county;

        public String getCounty() {
            return county;
        }
    }

    public static class CensusBlock {
        @JsonProperty("BLOCK")
        private String block;

        public String getBlock() {
            return block;
        }
    }

    public static class CensusTract {
        @JsonProperty("TRACT")
        private String tract;

        public String getTract() {
            return tract;
        }
    }
}

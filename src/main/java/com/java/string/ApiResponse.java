package com.java.string;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ApiResponse {
    @JsonProperty("result")
    private Result result;

    public Result getResult() {
        return result;
    }

    public static class Result {
        @JsonProperty("input")
        private Input input;

        @JsonProperty("addressMatches")
        private List<AddressMatch> addressMatches;

        public Input getInput() {
            return input;
        }

        public List<AddressMatch> getAddressMatches() {
            return addressMatches;
        }
    }

    public static class Input {
        @JsonProperty("address")
        private Address address;

        public Address getAddress() {
            return address;
        }
    }

    public static class Address {
        @JsonProperty("zip")
        private String zip;

        @JsonProperty("city")
        private String city;

        @JsonProperty("street")
        private String street;

        @JsonProperty("state")
        private String state;

        public String getZip() {
            return zip;
        }

        public String getCity() {
            return city;
        }

        public String getStreet() {
            return street;
        }

        public String getState() {
            return state;
        }
    }

    public static class AddressMatch {
        @JsonProperty("tigerLine")
        private TigerLine tigerLine;

        @JsonProperty("geographies")
        private Geographies geographies;

        @JsonProperty("coordinates")
        private Coordinates coordinates;

        @JsonProperty("addressComponents")
        private AddressComponents addressComponents;

        @JsonProperty("matchedAddress")
        private String matchedAddress;

        public TigerLine getTigerLine() {
            return tigerLine;
        }

        public Geographies getGeographies() {
            return geographies;
        }

        public Coordinates getCoordinates() {
            return coordinates;
        }

        public AddressComponents getAddressComponents() {
            return addressComponents;
        }

        public String getMatchedAddress() {
            return matchedAddress;
        }
    }

    public static class TigerLine {
        @JsonProperty("side")
        private String side;

        @JsonProperty("tigerLineId")
        private String tigerLineId;

        public String getSide() {
            return side;
        }

        public String getTigerLineId() {
            return tigerLineId;
        }
    }

    public static class Geographies {
        @JsonProperty("States")
        private List<State> states;

        @JsonProperty("Counties")
        private List<County> counties;

        @JsonProperty("Census Tracts")
        private List<CensusTract> censusTracts;

        @JsonProperty("Census Blocks")
        private List<CensusBlock> censusBlocks;

        public List<State> getStates() {
            return states;
        }

        public List<County> getCounties() {
            return counties;
        }

        public List<CensusTract> getCensusTracts() {
            return censusTracts;
        }

        public List<CensusBlock> getCensusBlocks() {
            return censusBlocks;
        }
    }

    public static class Coordinates {
        @JsonProperty("x")
        private double x;

        @JsonProperty("y")
        private double y;

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }
    }

    public static class AddressComponents {
        @JsonProperty("zip")
        private String zip;

        @JsonProperty("streetName")
        private String streetName;

        @JsonProperty("preType")
        private String preType;

        @JsonProperty("city")
        private String city;

        @JsonProperty("preDirection")
        private String preDirection;

        @JsonProperty("suffixDirection")
        private String suffixDirection;

        @JsonProperty("fromAddress")
        private String fromAddress;

        @JsonProperty("state")
        private String state;

        @JsonProperty("suffixType")
        private String suffixType;

        @JsonProperty("toAddress")
        private String toAddress;

        @JsonProperty("suffixQualifier")
        private String suffixQualifier;

        @JsonProperty("preQualifier")
        private String preQualifier;

        public String getZip() {
            return zip;
        }

        public String getStreetName() {
            return streetName;
        }

        public String getPreType() {
            return preType;
        }

        public String getCity() {
            return city;
        }

        public String getPreDirection() {
            return preDirection;
        }

        public String getSuffixDirection() {
            return suffixDirection;
        }

        public String getFromAddress() {
            return fromAddress;
        }

        public String getState() {
            return state;
        }

        public String getSuffixType() {
            return suffixType;
        }

        public String getToAddress() {
            return toAddress;
        }

        public String getSuffixQualifier() {
            return suffixQualifier;
        }

        public String getPreQualifier() {
            return preQualifier;
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

    public static class CensusTract {
        @JsonProperty("TRACT")
        private String tract;

        public String getTract() {
            return tract;
        }
    }

    public static class CensusBlock {
        @JsonProperty("BLOCK")
        private String block;

        public String getBlock() {
            return block;
        }
    }
}

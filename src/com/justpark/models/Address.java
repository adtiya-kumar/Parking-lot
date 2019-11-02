package com.justpark.models;

public class Address {
    private String country;
    private String state;
    private String city;
    private String zipCode;
    private String streetAddress;

    private Address(Builder builder) {
        setCountry(builder.country);
        setState(builder.state);
        setCity(builder.city);
        setZipCode(builder.zipCode);
        setStreetAddress(builder.streetAddress);
    }

    public String getState() {
        return state;
    }

    private void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    private void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    private void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    private void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCountry() {
        return country;
    }

    private void setCountry(String country) {
        this.country = country;
    }

    public static final class Builder {
        private String country;
        private String state;
        private String city;
        private String zipCode;
        private String streetAddress;

        public Builder() {
        }

        public Builder country(String val) {
            country = val;
            return this;
        }

        public Builder state(String val) {
            state = val;
            return this;
        }

        public Builder city(String val) {
            city = val;
            return this;
        }

        public Builder zipCode(String val) {
            zipCode = val;
            return this;
        }

        public Builder streetAddress(String val) {
            streetAddress = val;
            return this;
        }

        public Address build() {
            if (this.country == null)
                country = "India";
            return new Address(this);
        }
    }

    @Override
    public String toString() {
        return "Address [city=" + city + ", country=" + country + ", state=" + state + ", streetAddress="
                + streetAddress + ", zipCode=" + zipCode + "]";
    }

}
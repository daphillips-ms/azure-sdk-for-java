// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.weather.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The ForecastInterval model. */
@Fluent
public final class ForecastInterval {
    /*
     * The date and time for the start of the interval in ISO 8601 format, for example, 2019-10-27T19:39:57-08:00.
     */
    @JsonProperty(value = "startTime")
    private OffsetDateTime startTime;

    /*
     * The first minute for the interval.
     */
    @JsonProperty(value = "minute")
    private Integer minute;

    /*
     * A unit that represents forecasted precipitation intensity.
     */
    @JsonProperty(value = "dbz")
    private Double decibelRelativeToZ;

    /*
     * A short phrase describing precipitation condition for the interval.
     */
    @JsonProperty(value = "shortPhrase")
    private String shortDescription;

    /*
     * Key that specifies the threshold value. Along with precipitationType, can be used to determine the
     * simplifiedColor. If dbz is zero, not present in the response.
     */
    @JsonProperty(value = "threshold")
    private String threshold;

    /*
     * The full spectrum color that maps to the dBZ (decibel relative to Z). If dbz is zero, color is not present in
     * the response.
     */
    @JsonProperty(value = "color")
    private ColorValue color;

    /*
     * The band color that maps to the precipitation type and threshold. If dbz is zero, not present in the response.
     */
    @JsonProperty(value = "simplifiedColor")
    private ColorValue simplifiedColor;

    /*
     * Specifies the type of precipitation ("Rain" "Snow" "Ice" or "Mix"). If dbz is zero, precipitationType is not
     * present in the response.
     */
    @JsonProperty(value = "precipitationType")
    private PrecipitationType precipitationType;

    /*
     * Numeric value representing an image that displays the `iconPhrase`. Please refer to [Weather Service
     * Concepts](https://aka.ms/AzureMapsWeatherConcepts) for details.
     */
    @JsonProperty(value = "iconCode")
    private IconCode iconCode;

    /*
     * Percent representing cloud cover.
     */
    @JsonProperty(value = "cloudCover")
    private Integer cloudCover;

    /** Set default ForecastInterval constructor to private */
    private ForecastInterval() {}

    /**
     * Get the startTime property: The date and time for the start of the interval in ISO 8601 format, for example,
     * 2019-10-27T19:39:57-08:00.
     *
     * @return the startTime value.
     */
    public OffsetDateTime getStartTime() {
        return this.startTime;
    }

    /**
     * Get the minute property: The first minute for the interval.
     *
     * @return the minute value.
     */
    public Integer getMinute() {
        return this.minute;
    }

    /**
     * Get the decibelRelativeToZ property: A unit that represents forecasted precipitation intensity.
     *
     * @return the decibelRelativeToZ value.
     */
    public Double getDecibelRelativeToZ() {
        return this.decibelRelativeToZ;
    }

    /**
     * Get the shortDescription property: A short phrase describing precipitation condition for the interval.
     *
     * @return the shortDescription value.
     */
    public String getShortDescription() {
        return this.shortDescription;
    }

    /**
     * Get the threshold property: Key that specifies the threshold value. Along with precipitationType, can be used to
     * determine the simplifiedColor. If dbz is zero, not present in the response.
     *
     * @return the threshold value.
     */
    public String getThreshold() {
        return this.threshold;
    }

    /**
     * Get the color property: The full spectrum color that maps to the dBZ (decibel relative to Z). If dbz is zero,
     * color is not present in the response.
     *
     * @return the color value.
     */
    public ColorValue getColor() {
        return this.color;
    }

    /**
     * Get the simplifiedColor property: The band color that maps to the precipitation type and threshold. If dbz is
     * zero, not present in the response.
     *
     * @return the simplifiedColor value.
     */
    public ColorValue getSimplifiedColor() {
        return this.simplifiedColor;
    }

    /**
     * Get the precipitationType property: Specifies the type of precipitation ("Rain" "Snow" "Ice" or "Mix"). If dbz is
     * zero, precipitationType is not present in the response.
     *
     * @return the precipitationType value.
     */
    public PrecipitationType getPrecipitationType() {
        return this.precipitationType;
    }

    /**
     * Get the iconCode property: Numeric value representing an image that displays the `iconPhrase`. Please refer to
     * [Weather Service Concepts](https://aka.ms/AzureMapsWeatherConcepts) for details.
     *
     * @return the iconCode value.
     */
    public IconCode getIconCode() {
        return this.iconCode;
    }

    /**
     * Get the cloudCover property: Percent representing cloud cover.
     *
     * @return the cloudCover value.
     */
    public Integer getCloudCover() {
        return this.cloudCover;
    }
}

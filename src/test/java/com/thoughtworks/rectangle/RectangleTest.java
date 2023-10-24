package com.thoughtworks.rectangle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    public void calculatePerimeter_WithLengthAndBreadth_Equals160 () {
        Rectangle rectangle = new Rectangle(20, 60);

        int perimeter = rectangle.calculatePerimeter();

        assertEquals(160, perimeter);
    }

    @Test
    public void calculateArea_WithLengthAndBreadth_Equals200 () {
        Rectangle rectangle = new Rectangle(10, 20);

        int area = rectangle.calculateArea();

        assertEquals(200, area);
    }
    
}

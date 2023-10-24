package com.thoughtworks.rectangle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.closeTo;

import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    public void shouldReturnAreaWhenLengthAndBreadthIsGiven() {
        Rectangle rectangle = new Rectangle(10.05, 20.25);

        double area = rectangle.area();

        assertThat(area, is(closeTo(203.5125, 0.01)));
    }

    @Test
    public void shouldReturnPerimeterWhenLengthAndBreadthIsGiven() {
        Rectangle rectangle = new Rectangle(30.15, 40.25);

        double perimeter = rectangle.perimeter();

        assertThat(perimeter, is(closeTo(140.8, 0.01)));
    }

}

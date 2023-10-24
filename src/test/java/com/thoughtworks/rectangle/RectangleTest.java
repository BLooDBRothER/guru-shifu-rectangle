package com.thoughtworks.rectangle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    public void shouldReturnAreaWhenLengthAndBreadthIsGiven() {
        Rectangle rectangle = new Rectangle(10, 20);

        int area = rectangle.area();

        assertThat(area, is(equalTo(200)));

    }

}

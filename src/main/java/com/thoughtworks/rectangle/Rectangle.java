package com.thoughtworks.rectangle;

class Rectangle {
    private int length, breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int calculatePerimeter() {
        return 2 * (length + breadth);
    }

    public int calculateArea() {
        return length * breadth;
    }

}

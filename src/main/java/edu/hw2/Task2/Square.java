package edu.hw2.Task2;

public class Square extends Rectangle {

    @Override public void setWidth(int width) {
        super.setWidth(width);
        if (this.height == 0) {
            super.setHeight(width);
        }
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        if (this.width == 0) {
            super.setWidth(height);
        }
    }
}

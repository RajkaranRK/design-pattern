package com.rk.dp.solid.liskov.violated;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Getter
public class Square extends Rectangle {

    public Square(int width, int height){
        super(width,height);
    }

    public void setWidth(int width){
        setSide(width);
    }

    public void setHeight(int height){
        setSide(height);
    }

    private void setSide(int side){
        super.setWidth(side);
        super.setHeight(side);
    }
}

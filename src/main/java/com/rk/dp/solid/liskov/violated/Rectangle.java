package com.rk.dp.solid.liskov.violated;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rectangle {

    private int width;

    private int height;

    public int computeArea(){
        return width * height;
    }

}

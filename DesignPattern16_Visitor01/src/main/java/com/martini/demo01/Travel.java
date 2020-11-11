package com.martini.demo01;

import java.util.LinkedList;
import java.util.List;

/**
 * @author martini at 2020/11/10 15:03
 */
public class Travel {
    private List<Place> places = new LinkedList<Place>();
    public void attach(Place place) {
        places.add(place);
    }
    public void detach(Place place) {
        places.add(place);
    }
    public void display(Visitor visitor) {
        for (Place place : places) {
            place.acceptEvaluation(visitor);
        }
    }
}

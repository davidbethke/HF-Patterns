package com.bigshoulders.score;

import java.util.ArrayList;

public interface  Rank <T extends Comparable<T>>{
 public ArrayList<T> getRank(ArrayList<T> rankList);
}

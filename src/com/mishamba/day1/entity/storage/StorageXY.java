package com.mishamba.day1.entity.storage;

import com.mishamba.day1.entity.coordinate.PointXY;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Objects;

public class StorageXY implements Comparable<StorageXY>{
    private final ArrayList<PointXY> variables;

    public StorageXY() {
        variables = new ArrayList<>();
    }

    public void setVariables(double x, double y) {
        variables.add(new PointXY(x, y));
    }

    @Override
    public int compareTo(@NotNull StorageXY storage) {
        int result = 0;
        for (int i = 0; i< storage.variables.size(); i++) {
            result += storage.variables.get(i).compareTo(this.variables.get(i));
        }

        if (result > 0) {
            result = 1;
        } else if (result < 0) {
            result = -1;
        } else {
            result = 0;
        }

        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StorageXY)) {
            return false;
        }

        StorageXY storageXY = (StorageXY) o;
        return this.compareTo(storageXY) == 0;
    }

    @Override
    public int hashCode() {
        final int prime = 53;
        int result = 4;
        for (PointXY point : this.variables) {
            result = (int) (prime * result + point.getX());
            result = (int) (prime * result + point.getY());
        }

        return result;
    }

    @Override
    public String toString() {
        return variables.toString();
    }
}

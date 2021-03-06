package org.nd4j.linalg.cache;

import java.util.Arrays;

/**
 * This is utility class, made to compare java arrays for caching purposes.
 *
 * @author raver119@gmail.com
 */
public class ArrayDescriptor {
    int[] intArray = null;
    float[] floatArray = null;
    double[] doubleArray = null;
    long[] longArray = null;

    public ArrayDescriptor(int[] array) {
        this.intArray = array;
    }

    public ArrayDescriptor(float[] array) {
        this.floatArray = array;
    }

    public ArrayDescriptor(double[] array) {
        this.doubleArray = array;
    }

    public ArrayDescriptor(long[] array) {
        this.longArray = array;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArrayDescriptor that = (ArrayDescriptor) o;

        if (intArray != null && that.intArray != null) {
            return Arrays.equals(intArray, that.intArray);
        } else if (floatArray != null && that.floatArray != null) {
            return Arrays.equals(floatArray, that.floatArray);
        } else if (doubleArray != null && that.doubleArray != null) {
            return Arrays.equals(doubleArray, that.doubleArray);
        } else if (longArray != null && that.longArray != null) {
            return Arrays.equals(longArray, that.longArray);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        if (intArray != null) {
            return intArray.getClass().hashCode()    + 31 * Arrays.hashCode(intArray);
        } else if (floatArray != null) {
            return floatArray.getClass().hashCode()  + 31 * Arrays.hashCode(floatArray);
        } else if (doubleArray != null) {
            return doubleArray.getClass().hashCode() + 31 * Arrays.hashCode(doubleArray);
        } else if (longArray != null) {
            return longArray.getClass().hashCode()   + 31 * Arrays.hashCode(longArray);
        } else {
            return 0;
        }
    }
}

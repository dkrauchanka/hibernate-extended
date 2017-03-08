package by.kd.segment;

/**
 * Created by dkrauchanka on 7.3.17.
 */
public interface Segment<T> {
    boolean containsValue(T value);
    boolean isApplicable(String strSegment);
    String toStringValue();
}

package DecimalToBınary;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class NumberConverterTest {
    private NumberConverter converter;

    @BeforeEach
    void setUp() {
        converter = new NumberConverter();
    }

    @Test
    void testZero() {
        // Edge Case: 0 should return "0"
        assertEquals("0", converter.convertToBinary(0), "0 conversion failed!");
    }

    @Test
    void testSmallNumbers() {
        // 2 -> 10
        assertEquals("10", converter.convertToBinary(2));
        // 7 -> 111
        assertEquals("111", converter.convertToBinary(7));
    }

    @Test
    void testStandardNumbers() {
        // 13 -> 1101 (The classic example)
        assertEquals("1101", converter.convertToBinary(13), "Decimal 13 should be 1101");
        
        // 19 -> 10011
        assertEquals("10011", converter.convertToBinary(19));
    }

    @Test
    void testLargeNumber() {
        // 156 -> 10011100
        assertEquals("10011100", converter.convertToBinary(156));
    }
}
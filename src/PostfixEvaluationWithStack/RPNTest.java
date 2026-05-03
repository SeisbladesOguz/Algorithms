package PostfixEvaluationWithStack;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RPNTest {
	private RPNCalculator calculator;

	@BeforeEach
	void setUp() {
		// Her testten önce 10 kapasiteli yeni bir hesap makinesi oluşturuyoruz
		calculator = new RPNCalculator(10);
	}

	@Test
	void testSimpleAddition() {
		// "3 4 +" -> 7
		assertEquals(7, calculator.evaluate("3 4 +"), "Basit toplama hatalı!");
	}

	@Test
	void testComplexExpression() {
		// "(10 / 2) + 3" -> "10 2 / 3 +" -> 8
		assertEquals(8, calculator.evaluate("10 2 / 3 +"), "Karmaşık işlem hatalı!");
	}

	@Test
	void testMultiStepExpression() {
		// "(3 + 4) * (5 - 2)" -> "3 4 + 5 2 - *" -> 7 * 3 = 21
		assertEquals(21, calculator.evaluate("3 4 + 5 2 - *"), "Çok adımlı işlem hatalı!");
	}

	@Test
	void testDivisionTruncation() {
		// Java'da integer bölmesi küsuratı atar: "7 3 /" -> 2
		assertEquals(2, calculator.evaluate("7 3 /"), "Tam sayı bölme mantığı hatalı!");
	}

	@Test
	void testLargeNumbers() {
		// Çok basamaklı sayıları (parseInt) doğru alıyor mu?
		assertEquals(150, calculator.evaluate("100 50 +"), "Çok basamaklı sayılar hatalı!");
	}
}
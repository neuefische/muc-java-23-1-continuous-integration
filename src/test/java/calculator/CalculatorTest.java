package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// Test der Klasse
class CalculatorTest {

	// "Annotation" fängt mit @
	// @ auf Mac = option + l
	@Test
	// Was wollen wir testen?
	// Wird ein richtiges Ergebnis zurück gegeben, wenn die Zahlen positiv sind?
	// Testnamen + should ... + when ...
	// summeSollteGültigesErgebnisZurückgeben_wennZahlenPositivSind
	
	// Ausführen mit rechtsclick -> run as junit
	void sumShouldReturnValidResult_whenNumbersArePositive() {
		// GIVEN - Mit diesen Parametern
		int a = 1;
		int b = 1;
		// Erwartetes Ergebnis
		int expected = 2;
		
		// WHEN - Soll...
		// Tatsächliches Ergebnis
		int result = Calculator.sum(a, b);
		
		// THEN - Erwartetes Ergebnis rauskommen
		// Sicherstellen das expected = result ist
		assertEquals(expected, result);		
	}
}

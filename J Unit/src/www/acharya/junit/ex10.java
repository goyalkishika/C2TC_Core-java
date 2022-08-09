package www.acharya.junit;

@ParameterizesTest
@MethodSource("createWordsWithLength")
void withMethodSource(String word, int length) {
	
}

private static Stream<Arguments> createwordsWithLength() {
	return Stream.of(
			Arguments.of("Hello",5),
			Arguments.of("JUnit 5",7));
}

	@DisplayName("Roman Numeral")
	@ParameterizedTest(name="\"{0)\" should be {1}")
	@CsvSource({"I,1"),"II,2","V,5"})
				void withNiceName(String word, int number) 
				}

}

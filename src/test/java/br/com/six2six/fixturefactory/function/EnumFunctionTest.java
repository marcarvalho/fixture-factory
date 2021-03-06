package br.com.six2six.fixturefactory.function;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import br.com.six2six.fixturefactory.function.EnumFunction;
import br.com.six2six.fixturefactory.model.UserType;

public class EnumFunctionTest {
	
	@Test
	public void shouldGenerateRandomEnumValues() {
		List<UserType> userTypes = new EnumFunction(UserType.class, 2).generateValue();
		
		assertEquals(2, userTypes.size());
	}
}

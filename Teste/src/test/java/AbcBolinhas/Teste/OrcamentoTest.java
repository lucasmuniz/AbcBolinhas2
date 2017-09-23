package AbcBolinhas.Teste;

import org.junit.Assert;
import org.junit.Test;

public class OrcamentoTest {

	@Test
	public void test() {
		Orcamento orcamento = new Orcamento(100.0);
		Imposto imposto = new Imposto();
		// valor esperado, valor obtido
		Assert.assertEquals(10.0, imposto.calcula(orcamento), Double.MIN_VALUE);
	}

}

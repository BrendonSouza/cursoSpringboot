package com.cepedi.curso;

import java.util.Arrays;

import com.cepedi.curso.domain.Categoria;
import com.cepedi.curso.domain.Cidade;
import com.cepedi.curso.domain.Cliente;
import com.cepedi.curso.domain.Endereco;
import com.cepedi.curso.domain.Estado;
import com.cepedi.curso.domain.Produto;
import com.cepedi.curso.domain.enums.TipoCliente;
import com.cepedi.curso.repositories.CategoriaRepository;
import com.cepedi.curso.repositories.CidadeRepository;
import com.cepedi.curso.repositories.ClienteRepository;
import com.cepedi.curso.repositories.EnderecoRepository;
import com.cepedi.curso.repositories.EstadoRepository;
import com.cepedi.curso.repositories.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CursoApplication implements CommandLineRunner {
	@Autowired
	private CategoriaRepository categoriaRepository;

	@Autowired
	private ProdutoRepository produtoRepository;

	@Autowired
	private CidadeRepository cidadeRepository;

	@Autowired
	private EstadoRepository estadoRepository;

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private EnderecoRepository enderecoRepository;

	public static void main(String[] args) {

		SpringApplication.run(CursoApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");

		Produto p1 = new Produto(null, "Computador", 2000.00);
		Produto p2 = new Produto(null, "Impressora", 800.00);
		Produto p3 = new Produto(null, "Mouse", 80.00);

		cat1.getProdutos().addAll(Arrays.asList(p1, p2, p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));

		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1, cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));

		produtoRepository.saveAll(Arrays.asList(p1, p2, p3));
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));

		Estado e2 = new Estado(null, "Bahia");
		Estado e1 = new Estado(null, "São Paulo");

		Cidade c1 = new Cidade(null, "Salvador", e2);
		Cidade c2 = new Cidade(null, "Sao Paulo", e1);
		Cidade c3 = new Cidade(null, "Ilheus", e2);

		e1.getCidades().addAll(Arrays.asList(c2));
		e2.getCidades().addAll(Arrays.asList(c1, c3));

		estadoRepository.saveAll(Arrays.asList(e1, e2));
		cidadeRepository.saveAll(Arrays.asList(c1, c2, c3));

		Cliente cli1 = new Cliente(null, "Maria Silva", "maria@gmail.com", "00223556998", TipoCliente.PESSOAFISICA);

		cli1.getTelefones().addAll(Arrays.asList("40028922", "996699969"));

		Endereco end1 = new Endereco(null, "logradouro", "numero", "complemento", "bairro", "cep", cli1, c1);
		Endereco end2 = new Endereco(null, "Rua das dores", "75", "casa sem chão", "bairro das graças", "4569985", cli1,
				c2);
		cli1.getEnderecos().addAll(Arrays.asList(end1, end2));

		enderecoRepository.saveAll(Arrays.asList(end1, end2));
		clienteRepository.saveAll(Arrays.asList(cli1));
	}

}

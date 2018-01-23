package br.com.andersonmatte.webServiceRestComSpringBoot.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.andersonmatte.webServiceRestComSpringBoot.entidade.Cliente;

/**
 * @author Anderson Matte 
 * 
 * Interface Cliente.
 * 
 */
public interface ClienteRepository extends CrudRepository<Cliente, String>{

}

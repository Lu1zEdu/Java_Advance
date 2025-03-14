package br.com.fiap.api_rest.repository;

import br.com.fiap.api_rest.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    List<Cliente> findByNome (String nome);
    List<Cliente> findByNomels(String nome);
    List<Cliente> FindByNomeEquals(String nome);
    List<Cliente> findByNomeEqualsIgnoreCase(String nome);
    List<Cliente> findByNameNot(String nome);
    List<Cliente> findByNomeIsNot(String nome);
    List<Cliente> findByNomeIsNotEquals(String nome);

    List<Cliente> findTop3ByIdade(int idade);

    List<Cliente> findByEmailIsNull();
    List<Cliente> findByEmailIsNotNull();

    //Idade
    List<Cliente> findByIdade(int idade);
    List<Cliente> findByIdadeGreaterThan(int idade);
    List<Cliente> findByIdadeLessThan(int idade);
    List<Cliente> findByIdadeBetween(int idadeStart, int idadeEnd);
    List<Cliente> findByIdadeNot(int idade);

    //Email
    List<Cliente> findByEmail(String email);
    List<Cliente> findByEmailIgnoreCase(String email);
    List<Cliente> findByEmailNot(String email);
    List<Cliente> findByEmailIsNot(String email);

    //Vip
    List<Cliente> findByVip(boolean vip);
    List<Cliente> findByVipTrue();
    List<Cliente> findByVipFalse();
    List<Cliente> findByVipNot(boolean vip);

    //Data de Nascimento
    List<Cliente> findByDtanasc(Date dtanasc);
    List<Cliente> findByDtanascBefore(Date dtanasc);
    List<Cliente> findByDtanascAfter(Date dtanasc);
    List<Cliente> findByDtanascBetween(Date startDate, Date endDate);
    List<Cliente> findByDtanascIsNull();
    List<Cliente> findByDtanascIsNotNull();

}
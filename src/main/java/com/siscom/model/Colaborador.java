package com.siscom.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "colaborador")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Colaborador implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @Temporal(TemporalType.DATE)
    @Column(name = "CTPS_DATA_EXPEDICAO")
    private Date ctpsDataExpedicao;

    @Column(name = "CTPS_NUMERO")
    private String ctpsNumero;

    @Column(name = "CTPS_SERIE")
    private String ctpsSerie;

    @Column(name = "CTPS_UF")
    private String ctpsUf;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_ADMISSAO")
    private Date dataAdmissao;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_CADASTRO")
    private Date dataCadastro;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_DEMISSAO")
    private Date dataDemissao;

    @Lob
    @Column(name = "FOTO_34")
    private String foto34;

    private String matricula;

    @Lob
    private String observacao;

    @Column(name = "PAGAMENTO_AGENCIA")
    private String pagamentoAgencia;

    @Column(name = "PAGAMENTO_AGENCIA_DIGITO")
    private String pagamentoAgenciaDigito;

    @Column(name = "PAGAMENTO_BANCO")
    private String pagamentoBanco;

    @Column(name = "PAGAMENTO_CONTA")
    private String pagamentoConta;

    @Column(name = "PAGAMENTO_CONTA_DIGITO")
    private String pagamentoContaDigito;

    @Column(name = "PAGAMENTO_FORMA")
    private String pagamentoForma;

    @ManyToOne
    @JoinColumn(name = "ID_SETOR")
    private Setor setor;

    @ManyToOne
    @JoinColumn(name = "ID_CARGO")
    private Cargo cargo;

    @ManyToOne
    @JoinColumn(name = "ID_TIPO_COLABORADOR")
    private TipoColaborador tipoColaborador;

    @ManyToOne
    @JoinColumn(name = "ID_PESSOA")
    private Pessoa pessoa;

}

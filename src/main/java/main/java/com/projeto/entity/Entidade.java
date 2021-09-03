package main.java.com.projeto.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SelecionaEntradaChamados", schema = "DW_OTRS")
public class Entidade {

    @Id
    @Column(name = "IDLinha")
    private long id;

    @Column(name = "ClienteSigla")
    private String clienteSigla;

    @Column(name = "DataDiaMesAnoCriacao")
    private LocalDate dataCriacao;

    @Column(name = "AberturaChamadoTipo")
    private String aberturaChamadoTipo;

    @Column(name = "TotalQuantidadeChamados")
    private int totalQuantidadeChamados;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getClienteSigla() {
        return clienteSigla;
    }

    public void setClienteSigla(String clienteSigla) {
        this.clienteSigla = clienteSigla;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getAberturaChamadoTipo() {
        return aberturaChamadoTipo;
    }

    public void setAberturaChamadoTipo(String aberturaChamadoTipo) {
        this.aberturaChamadoTipo = aberturaChamadoTipo;
    }

    public int getTotalQuantidadeChamados() {
        return totalQuantidadeChamados;
    }

    public void setTotalQuantidadeChamados(int totalQuantidadeChamados) {
        this.totalQuantidadeChamados = totalQuantidadeChamados;
    }

}
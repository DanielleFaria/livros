package br.biblioteca.livros.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "LIVRO")

public class Livro {
	
	 @Id
	   @GeneratedValue
	   @Column(name = "ID")
	   private long id;

	   @Column(name = "NAME", nullable = false)
	   private String name;

	   @Column(name = "QTDE_PAGINAS")
	   private String qtdePaginas;


	   @ManyToOne
	   @JoinColumn(name = "AUTOR_ID")
	   private Autor autor;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getQtdePaginas() {
		return qtdePaginas;
	}


	public void setQtdePaginas(String qtdePaginas) {
		this.qtdePaginas = qtdePaginas;
	}


	public Autor getAutor() {
		return autor;
	}


	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	   

	   //Setter and Getter methods

}


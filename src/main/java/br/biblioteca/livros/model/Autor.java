package br.biblioteca.livros.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "AUTOR")
public class Autor {
	 @Id
	   @GeneratedValue
	   @Column(name = "ID")
	   private long id;

	   @Column(name = "NAME", nullable = false)
	   private String name;

	  


	   @OneToMany(mappedBy = "autor")
	   private List<Livro> livros = new ArrayList<>();




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




	public List<Livro> getLivros() {
		return livros;
	}




	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
	   
	   //Setter and Getter methods

}
